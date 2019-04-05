package OCAtasks.assesment1.classString;

import java.util.Arrays;

/**
 * Created by veronika on 03.04.2019.
 */
public class StringsSortInAlphabeticalOrder {

    public static void main(String[] args){
        String[] strings = { "10", "9", "100" };
        Arrays.sort(strings);
        for (String string : strings)
            System.out.print(string + " ");
    }
}
