package OCAtasks.assesment1.polymorphism;

/**
 * Created by veronika on 02.04.2019.
 */
public class OverloadExample {

    public static void main(String[] args) {
        method2ForOverloading(8.0f, 9);
    }

    public void method1ForOverloading(){
        System.out.println("method without parameters");
    }

    public void method1ForOverloading(int a){
        System.out.println("method with parameter " + a);
    }

    public static void method2ForOverloading(int a, float b){
        System.out.println("method21 with parameter " + a);
    }

    private static int method2ForOverloading(float b, int a){
        System.out.println("method22 with parameter " + a);
        return a;
    }
}
