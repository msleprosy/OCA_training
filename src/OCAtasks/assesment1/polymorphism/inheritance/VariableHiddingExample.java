package OCAtasks.assesment1.polymorphism.inheritance;

/**
 * Created by veronika on 24.03.2019.
 */

class Deer2 {

    String name = "Deer2";
    /*private*/ public void voice(){ System.out.println("Hello World from Deer class!"); }

    public static void main(String[] args){
        Deer2 deer = new SubDeer2();
        SubDeer2 subDeer = new SubDeer2();
        Deer2 mainDeer = new Deer2();
        deer.voice();
        subDeer.voice();
        mainDeer.voice();
        System.out.println(deer.name); // When an instance variable in a subclass has the same name
                                      // as an instance variable in a super class, then the instance variable
                                     // is chosen from the reference type.
        System.out.println(subDeer.name);
        System.out.println(mainDeer.name);
    }
}

class SubDeer2 extends Deer2{
    String name = "SubDeer2";
    public void voice(){
        System.out.println("Hello World from SubDeer class!");
    }
}
