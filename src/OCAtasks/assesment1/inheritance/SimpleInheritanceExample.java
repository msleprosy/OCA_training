package OCAtasks.assesment1.inheritance;

/**
 * Created by veronika on 28.03.2019.
 */
class Base {
    public String name = "Base";
    public String getName() {
        return name;
    }
}

class Sub extends Base {
    public String name = "Sub";
    public String getName() {
        return name;
    }
}

 public class Program {
    public static void main(String[] args) {
        Sub s = new Sub();
        Base b = s;
        System.out.println(b.name);
    }
}
