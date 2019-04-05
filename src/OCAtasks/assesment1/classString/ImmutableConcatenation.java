package OCAtasks.assesment1.classString;

/**
 * Created by veronika on 03.04.2019.
 */
public class ImmutableConcatenation {

    public static void main(String[] args) {
        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3");
        String s3 = s2.concat("3");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        String test = "aajaa";
        System.out.println(test.substring(0, 3));

    }
}
