package OCAtasks.assesment1.nestedClasses.innerClasses.privateInterfaceInsideTheOuterClass;

/**
 * Created by veronika on 15.04.2019.
 */
public class Outer {
    private interface Secret{
        void shh();
    }

    private class Inner implements Secret{

        @Override
        public void shh() {
            System.out.println("Tiho blyad'");
        }
    }

    public static void main(String[] args){

        Inner inner = new Outer().new Inner();
        inner.shh();
    }
}
