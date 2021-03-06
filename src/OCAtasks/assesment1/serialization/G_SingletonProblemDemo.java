package OCAtasks.assesment1.serialization;

/**
 * Created by veronika on 25.03.2019.
 */
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Created by veronika on 25.03.2019.
 */

//in the process of deserialization the new instance of singleton creates, which is against the singleton principle.
// to solve it you, for example, may use enum as a singleton.

public class G_SingletonProblemDemo {
    private static class SecretKey implements Serializable {
        private String key;

        public SecretKey(String key) {
            this.key = key;
        }
    }

    private static class Passport implements Serializable {

        private int serial;
        private int number;

        public Passport(int serial, int number) {
            this.serial = serial;
            this.number = number;
        }
    }

    private static class Person implements Serializable {
        public static final Person INSTANCE = new Person("Ivan", "Ivanov", new Passport(11, 22), new SecretKey("AAA"));
        private static String someProp = "SOME PROP";

        private String name;
        private String lastName;
        private Passport passport;
        private transient SecretKey secretKey;

        private Person(String name, String lastName, Passport passport, SecretKey secretKey) {
            this.name = name;
            this.lastName = lastName;
            this.passport = passport;
            this.secretKey = secretKey;
        }
    }

    public static void main(String[] args) throws Exception {
        Person person = Person.INSTANCE;

        String pathToSerializedData = getSerializedPerson(person);
        Person.someProp = "AAAAAA";
        Person person1 = readDataFromFile(pathToSerializedData);

        System.out.println(person.equals(person1));
    }

    private static Person readDataFromFile(String file) throws Exception {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            Object o = objectInputStream.readObject();
            return (Person) o;
        }
    }

    private static String getSerializedPerson(Person person) throws IOException {
        Path file = Files.createTempFile("lesson14serialization", ".txt");
        System.out.println(file.toAbsolutePath());

        try (ObjectOutput objectOutput = new ObjectOutputStream(
                new FileOutputStream(file.toFile())
        )) {
            objectOutput.writeObject(person);
        }
        return file.toAbsolutePath() + "";

    }
}


