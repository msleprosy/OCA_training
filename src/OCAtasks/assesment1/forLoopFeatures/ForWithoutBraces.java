package OCAtasks.assesment1.forLoopFeatures;

import java.util.Arrays;
import java.util.List;

/**
 * Created by veronika on 03.04.2019.
 */
public class ForWithoutBraces {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("oca", "ocp");
        for (String l1 : list)
            for (String l2 : list)
                System.out.print(l1 + " " + l2);
        System.out.println();//it won't be reached in the inner loop

        //oca ocaoca ocpocp ocaocp ocp

        for (int i = 0; i < 10; i++)
            System.out.println("i is 1: " + i);  // executed inside  loop.
            System.out.println("second line");   // executed after   loop.

    }
}
