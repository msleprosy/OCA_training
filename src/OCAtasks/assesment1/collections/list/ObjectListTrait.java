package OCAtasks.assesment1.arrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by veronika on 09.04.2019.
 */
public class ObjectListTrait {

    public static void main(String[] arg){
        List numbers = new ArrayList<>();//it won't work if you'll change it to List<Integer>
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        print(numbers);

        /*int i = 1;
        print2(i);*/
    }

    private static void print(List<String> list){
        for(Object obj: list)
            System.out.println(obj);
    }

    /*private static void print2(Object value){
            System.out.println(value);
    }*/
}
