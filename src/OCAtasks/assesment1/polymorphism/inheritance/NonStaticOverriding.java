package OCAtasks.assesment1.inheritance;

/**
 * Created by veronika on 24.03.2019.
 */
class Deer1 {
    private String privateDeer1Field = "i'am a private Deer1 field";
    public Deer1() { System.out.print("Deer1"); }
    public Deer1(int age) { System.out.print("DeerAge "); }
    private boolean hasHorns() {return false; }//it won't override, because Reindeer1 doesn't see private method.

    public static void main(String[] args) {
        Deer1 deer = new Reindeer1(5);//you can directly invoke only Deer1 methods and fields (private/public)
                                      //or public methods overriden by Reindeer1.
       // Deer1 deer1 = new Deer1();//you can invoke only Deer1 methods (private/public), nothing overrides.
       // Reindeer1 reindeer = new Reindeer1(3);//you can invoke Reindeer1 methods and fields (private/public)
                                               //and public Deer1 methods.
       // System.out.println(", has horns: " + deer.hasHorns());
        System.out.println(", has horns: " + deer.hasHorns());
    }
}

class Reindeer1 extends Deer1 {
    public Reindeer1(int age) { System.out.print("Reindeer1 " /*+ " color: " + color*/); }
    private boolean hasHorns() { return true; }
    public String publicReindeerField = "i'am a public Reindeer1 field";
    private String color = "black ";
}