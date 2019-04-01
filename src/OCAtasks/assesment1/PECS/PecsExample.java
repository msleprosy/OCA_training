package OCAtasks.assesment1.PECS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by veronika on 01.04.2019.
 */
public class PecsExample {
    public static void main(String[] args){

        List<Integer> ints = Arrays.asList(1,2,3);
        assert sum(ints) == 6.0;
        List<Double>doubles = Arrays.asList(2.78,3.14);
        assert sum(doubles) == 5.92;
        List<Number>nums = Arrays.<Number>asList(1,2,2.78,3.14);
        assert sum(nums) == 8.92;
        System.out.println(sum(ints));

        List<Integer>ints2 = new ArrayList<Integer>();
        count(ints2, 5);
        assert ints2.toString().equals("[0, 1, 2, 3, 4]");
        List<Number>nums2 = new ArrayList<Number>();
        count(nums2, 5); nums2.add(5.0);
        assert nums2.toString().equals("[0, 1, 2, 3, 4, 5.0]");
        List<Object>objs = new ArrayList<Object>();
        count(objs, 5); objs.add("five");
        assert objs.toString().equals("[0, 1, 2, 3, 4, five]");
    }

    public static double sum(Collection<? extends Number> nums) {
        double s = 0.0;
        for (Number num : nums)
            s += num.doubleValue();
        return s;
    }

    public static void count(Collection<? super Integer> ints, int n) {
        for (int i = 0; i < n; i++) ints.add(i);
    }
}
