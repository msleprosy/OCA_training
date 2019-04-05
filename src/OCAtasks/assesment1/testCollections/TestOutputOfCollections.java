package OCAtasks.assesment1.testCollections;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestOutputOfCollections {
    static int[] array = {6,9,8};
    static List<Integer> list = new ArrayList<>();
   /* public static void main(String[] args) {
        list.add(array[0]);
        list.add(array[2]);
        list.set(1, array[1]);
        list.remove(0);
        System.out.println(list);
    }*/
    public static void main(String[] args){
        Map<String, Integer> map = new HashMap<>();
        map.put("key1", 1);
        map.put("key2", 2);
        map.put("key3", 3);
        System.out.println(map);
    }
}



