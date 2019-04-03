package OCAtasks.assesment1.arrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by veronika on 03.04.2019.
 */
public class IntegralTypesRemovingAndAddingByValueIssue {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        //numbers.remove(1);//deletes by index instead of deleting by value
        numbers.remove(new Integer(1));//deletes by value
        System.out.println(numbers);

        List<Byte> numbers2 = new ArrayList<>();
        numbers2.add(new Byte((byte)1));
        numbers2.add(new Byte((byte)2));
        //numbers.remove(1);
        numbers2.remove(new Byte((byte)1));
        System.out.println(numbers2);
    }
}
