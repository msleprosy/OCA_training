package OCAtasks.assesment1.orderOfInitialization;

/**
 * Created by veronika on 28.03.2019.
 */
 class Tasks {
    public static Tasks instance = new Tasks();//constructor invokes
    private static final int DELTA = 5;
    private static int BASE = 7;//and BASE equals 0 at this moment.
    private int x;

    public Tasks() {
        x = BASE + DELTA;
    }
    public static int getBASE() {
        return BASE;
    }
    public static void main(String[] args) {
        System.out.println(Tasks.instance.x);
    }
}