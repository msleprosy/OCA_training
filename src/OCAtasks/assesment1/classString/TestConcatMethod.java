package OCAtasks.assesment1.classString;

/**
 * Created by veronika on 28.03.2019.
 */
public class TestConcatMethod {
    public static void main(String[] args) {
        String s = new String("ssssss");
        StringBuffer sb = new StringBuffer("bbbbbb");
        s.concat("-aaa");
        sb.append("-aaa");
        System.out.println(s);
        System.out.println(sb);
    }
}
