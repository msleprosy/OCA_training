package OCAtasks.assesment1.arithmeticOperations;

/**
 * Created by veronika on 28.03.2019.
 */

/*
* before arithmetic calculations values of byte, char and short types converts
* to int, therefore, k variable should have int type, otherwise "incompatible types" error appears.
* */
public class ByteShortAndIntegerIssue {
    public static void main( String[] args ) {
        byte i = 2;
        byte j = 2;
        /*byte*/ int k = i * j;
        System.out.println(k);
    }
}
