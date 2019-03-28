package OCAtasks.assesment1.inheritance;

/**
 * Created by veronika on 24.03.2019.
 */

public class Deer2 {

    private void voice(){
        System.out.println("Hello World from Deer class!");
    }

    public static void main(String[] args){
        Deer2 deer = new SubDeer();
        SubDeer subDeer = new SubDeer();
        Deer2 mainDeer = new Deer2();
        deer.voice();
        subDeer.voice();
        mainDeer.voice();
    }
}

class SubDeer extends Deer2{
    public void voice(){
        System.out.println("Hello World from SubDeer class!");
    }
}
