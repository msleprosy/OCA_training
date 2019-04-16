package OCAtasks.assesment1.arrays;

import java.util.Arrays;

/**
 * Created by veronika on 17.04.2019.
 */
public class ArrayStoreExceptionThing {

    static Integer[] game = new Integer[4];
    static Object[] obj = new Object[6];
    static String[] arr = new String[]{"test"};

    public static void main(String[] args) {

/*       game[3] = 6;
        obj = game;//exception
        obj[2] = "STRING";*/

        /*       but          */

        game[3] = 6;
        obj[0] = game[3];
        obj[2] = "STRING";

        System.out.println(Arrays.toString(obj));

    }
}
