package OCAtasks.inheritance;

/**
 * Created by veronika on 24.03.2019.
 */
public class Deer1 {
    public Deer1() { System.out.print("Deer1"); }

    public Deer1(int age) { System.out.print("DeerAge"); }

    private boolean hasHorns() { return false; }

    public static void main(String[] args) {
        Deer1 deer = new Reindeer(5);
        System.out.println("," + deer.hasHorns());
    }
}

class Reindeer extends Deer1 {
    public Reindeer(int age) { System.out.print("Reindeer"); }

    public boolean hasHorns() { return true; }
}