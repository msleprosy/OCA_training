package OCAtasks.assesment1.nestedClasses.innerClasses.localInnerClass;

/**
 * Created by veronika on 15.04.2019.
 */
public class Outer {
    int x = 5;

    private void calculate(){
        int y = 2;
        /*no modifiers here*/
            class Inner{
            void multiply(){
                System.out.println(x * y);
            }
        }

        new Inner().multiply();
    }

    public static void main(String[] args){
        Outer outer = new Outer();
        outer.calculate();
    }
}
