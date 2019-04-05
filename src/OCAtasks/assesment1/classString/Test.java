package OCAtasks.assesment1.classString;

/**
 * Created by veronika on 28.03.2019.
 */
class MyLink {
    public MyLink() {
        str = "New";
    }
    public String str;
}

public class Test {
    public static void main(String[] args) {
        MyLink b1 = new MyLink();//it points to str which points to object in heap.
        MyLink b2 = b1;
        b2.str = "My String";
        System.out.println(b1.str);

        String a1 = "Test";//it points to object in heap.
        String a2 = a1;
        System.out.println(a2);
        a1 = "Not a Test"; //it's a new object with another hashcode (strings are immutable).
        System.out.println(a2);
    }
}
