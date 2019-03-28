package OCAtasks.assesment1;

/**
 * Created by veronika on 28.03.2019.
 */
public class Z {
    public void print( Object o ) {
        System.out.println( "Object" );
    }

//    public void print( String str ) {
//        System.out.println( "String" );
//    }

    public void print( Integer i ) {
        System.out.println( "Integer" );
    }

    public static void main(String[] args) {
        Z z = new Z();
        z.print( null );
    }
}
