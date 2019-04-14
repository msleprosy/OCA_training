package OCAtasks.assesment1.nestedClasses.innerClasses;

/**
 * Created by veronika on 15.04.2019.
 */
public class Outer {
    private String greeting = "Hi from Outer class";

    /*public protected default*/
    private class Inner {
        private int repeat = 3;
        private void go() {
            for(int i = 0; i < repeat; i++){
                System.out.println(greeting);
            }
        }
    }

    private void callInner(){
        Inner inner = new Inner();
        inner.go();
    }

    public static void main(String[] args){
        Outer outer = new Outer();
        Inner inner = outer.new Inner();
        outer.callInner();
        inner.go();
    }
}
