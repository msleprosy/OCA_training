package OCAtasks.assesment1.inheritance;

/**
 * Created by veronika on 27.03.2019.
 */
class Deer4 {

/* You can extend access modifiers and narrow return type in child.
* */

    protected void voice(){
        System.out.println("Deer4 is talking");
    }

    protected Object getValue(){return null;}

    public static void main(String[] args){
        Deer4 deer = new Reindeer4();
        deer.voice();
        System.out.println(deer.getValue());
    }
}

class Reindeer4 extends Deer4{
    public void voice(){
        System.out.println("Reindeer4 is talking");
    }

    public String getValue(){
        String str = "String value";
        return str;}
}