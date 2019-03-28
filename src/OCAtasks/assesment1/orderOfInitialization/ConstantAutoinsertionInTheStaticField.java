package OCAtasks.assesment1.orderOfInitialization;

/**
 * Created by veronika on 28.03.2019.
 */
public class Test {

    static int b = Test.a;
    static final int a = 3; //it's a constant so it automatically inserts in the upper field

    public static void main(String... args) {
        System.out.println("a = " + a + ", b = " + b);
    }

}
