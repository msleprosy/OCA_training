package OCAtasks.assesment1.orderOfInitialization;

/**
 * Created by veronika on 28.03.2019.
 */
public class TypesTutorial {

    public static void main(String... atgs) {
        A alpha = new B();
    }
}

class A {
    A(){
        System.out.print("A");
        a();
    }

    void a() {
        System.out.print("a");
    }
}

class B extends A {
    B() {
        System.out.print("B");
        a();
    }

    void a() {
        System.out.print("b");
    }
}