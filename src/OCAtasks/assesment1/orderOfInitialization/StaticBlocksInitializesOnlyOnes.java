package OCAtasks.assesment1.orderOfInitialization;

/**
 * Created by veronika on 29.03.2019.
 */
abstract class Animal {
    static {
        System.out.println("Inside Animal");
    }
}

class Cat extends Animal {
    static {
        System.out.println("Inside Cat");
    }
}

class Dog extends Animal {
    static {
        System.out.println("Inside Dog");
    }
}

public class Main {
    public static void main(String[] args){
        Animal cat = new Cat();
        Animal dog = new Dog();
    }
}
