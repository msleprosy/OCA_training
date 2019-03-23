package OCAtasks;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestCollections {
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

/*public class FeedingSchedule {
    public static void main(String[] args) {
        int x = 5, j = 0;
        OUTER:
        for (int i = 0; i < 3; )
            INNER:do {
                i++;
                x++;
                if (x > 10) break INNER;
                x += 4;
                j++;
            }
            while (j <= 2);
        System.out.println(x);
    }
}*/
/*public class Egret {
    private String color;

    public Egret() {
        this("white");
    }

    public Egret(String color) {
        //this.color = color;
        color = color;
    }

    public static void main(String[] args) {
        Egret e = new Egret();
        System.out.println("Color:" + e.color);
    }
}*/



