package OCAtasks.assesment1.orderOfInitialization;

/**
 * Created by veronika on 28.03.2019.
 */
public class A {
    public static void main(String[] args) {

        byte[] a={ 49,50,51,52,53,54,55 };

        String b=new String(a);      // 1
        System.out.println(b);

        String c=new String(a,2,4);  // 2
        System.out.println(c);
    }

}