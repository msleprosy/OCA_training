package OCAtasks.assesment1.overload;

/**
 * Created by veronika on 28.03.2019.
 */
public class AmbiguousMethods {

    static void m(int... a) {
        System.out.println("1");
    }

    static void m(Integer... a) {
        System.out.println("2");
    }

    public static void main(String[] args) {
        //m(1, 2);//reference to m is ambiguous
    }
}
