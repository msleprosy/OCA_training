package OCAtasks.assesment1.overload;

/**
 * Created by veronika on 27.03.2019.
 */
public class Deer {
    public void voice(){
        System.out.println("method without parameters");
    }

    protected int voice(String str){
        System.out.println(str);
        return 1;
    }

    public static void main(String[] args){
        Deer deer = new Deer();
        deer.voice("method with String parameter");
        deer.voice();
    }
}

class Reindeer extends Deer{
    //protected void voice(){}// error = clashes with Deer method - should be public.
    // protected int voice(){return 1;}// error = clashes with Deer method.
}