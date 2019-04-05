package OCAtasks.assesment1.classString;

/**
 * Created by veronika on 03.04.2019.
 */
public class StringAndStringBuffer {

    public static void main(String[] args){
        String str = new String("string");
        StringBuffer stringBuffer1 = new StringBuffer("string");
        StringBuffer stringBuffer2 = new StringBuffer("string");
        Integer integer = 5;
        Integer integer1 = 5;

        System.out.println(str.equals(stringBuffer1));
        System.out.println(stringBuffer1.equals(str));
        System.out.println(stringBuffer1.toString().equals(stringBuffer2.toString()));
        System.out.println(integer.equals(integer1));
        System.out.println(integer.toString().equals(integer1));
    }

}
