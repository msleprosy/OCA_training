package OCAtasks.assesment1.polymorphism.inheritance;

/**
 * Created by veronika on 27.03.2019.
 */
class Deer3 {
    public static void voice(){
        System.out.println("Deer3 static parent");
    }
}

class Deer3Child extends Deer3{
    public static void voice(){
        System.out.println("Deer3 static child");
    }

    public static void main(String[] args){
        Deer3.voice();
        Deer3Child.voice();
    }
}