package OCAtasks.assesment1.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by veronika on 04.04.2019.
 */
public class StreamExamples {
    public static void main(String[] args) {
/*1*/    IntStream.of(120, 410, 85, 32, 314, 12)
                .filter(x -> x < 300)
                .map(x -> x + 11)
                .limit(3)
                .forEach(System.out::println);


/*2*/    List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
                myList.stream()
                    .filter(s -> s.startsWith("c"))
                    .map(String::toUpperCase)
                    .sorted()
                    .forEach(System.out::println);

        List<String> list = Arrays.asList("a1", "a2", "a3", "a1");
/*3 Вернуть количество вхождений объекта «a1»*/
         System.out.println(list.stream()
                 .filter("a1"::equals)
                 .count());

/*4 Вернуть первый элемент коллекции или 0, если коллекция пуста*/
        System.out.println(list.stream()
                .findFirst()
                .orElse("0"));

/*5 Вернуть последний элемент коллекции или «empty», если коллекция пуста*/
        System.out.println(list.stream()
                .skip(list.size() - 1)
                .findAny()
                .orElse("empty"));

/*6 Найти элемент в коллекции равный «a3» или кинуть ошибку*/
        System.out.println((list.stream()
                .filter("a3"::equals)
                .findFirst()
                .get()));

/*7 Вернуть третий элемент коллекции по порядку*/
        System.out.println((list.stream()
                .skip(2)
                .findFirst()
                .get()));

/*8 Вернуть два элемента начиная со второго*/
        System.out.println(Arrays.toString(list.stream()
                .skip(1)
                .limit(2)
                .toArray()));

/*9 Выбрать все элементы по шаблону*/
        System.out.println((list.stream()
                            .filter((s) -> s
                            .contains("1"))
                            .collect(Collectors.toList())));


        List<People> people = Arrays.asList( new People("Вася", 16, Sex.MAN),
                new People("Петя", 23, Sex.MAN),
                new People("Елена", 42, Sex.WOMEN),
                new People("Иван Иванович", 69, Sex.MAN));

/*10 Выбрать мужчин-военнообязанных (от 18 до 27 лет)*/
        System.out.println((people.stream().filter((p)-> p.getAge() >= 18 && p.getAge() < 27
                && p.getSex() == Sex.MAN).collect(Collectors.toList())));

/*11 Найти средний возраст среди мужчин*/
        System.out.println(people.stream().filter((p) -> p.getSex() == Sex.MAN).mapToInt(People::getAge).average().getAsDouble());

/*12 Найти кол-во потенциально работоспособных людей в выборке (т.е. от 18 лет и учитывая что женщины выходят в 55 лет,
а мужчина в 60)*/

        System.out.println(people.stream().filter((p) -> p.getAge() >= 18)
                .filter((p) -> (p.getSex() == Sex.WOMEN && p.getAge() < 55) || (p.getSex() == Sex.MAN && p.getAge() < 60))
                .count());



        System.out.println(people.stream()
                .filter((p) -> p.getSex().equals(Sex.WOMEN) && p.getName().startsWith("Ел"))
                .collect(Collectors.toList()));

        IntStream streamFromString = "123".chars();

        Predicate<Integer> isPositive = x -> x > 0;
        System.out.println(isPositive.test(-5));

    }
}

class People{
    String name;
    int age;
    Sex sex;

    public People(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}

enum Sex{
    MAN, WOMEN
}
