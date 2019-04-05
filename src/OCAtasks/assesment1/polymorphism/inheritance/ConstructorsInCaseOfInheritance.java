package OCAtasks.assesment1.polymorphism.inheritance;

/**
 * Created by veronika on 28.03.2019.
 */
class TypesTutorial {

    public static void main(String... args) {

        A alpha = new B();
    }
}

class A {
  /*  A(int a){
        System.out.print("A");
        a();
    }
error - no default constructor available*/

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
