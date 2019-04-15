package OCAtasks.assesment1.nestedClasses;

/**
 * Created by veronika on 15.04.2019.
 */
public class NestedClassSimpleExample {

    static class Nested{
        private String phrase = "Hello from Nested class";
    }

    public static void main(String[] args){
        Nested nested = new Nested();
        System.out.println(nested.phrase);
    }
}
