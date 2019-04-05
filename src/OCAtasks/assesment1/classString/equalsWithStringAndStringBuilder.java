package OCAtasks.assesment1.classString;

/**
 * Created by veronika on 28.03.2019.
 */
public class equalsWithStringAndStringBuilder {

    public static void main(String[] args) {
        String s1 = new String("string");
        String s2 = new String("STRINg");

        StringBuilder sb1 = new StringBuilder("test");
        StringBuilder sb2 = new StringBuilder("test");

        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(sb1.equals(sb2));//equals() isn't overridden in StringBuilder/StringBuffer, yu should
                                           //use compareTo() in Comparable (since java 11 LOL) or toString() and then equals()
        System.out.println(sb1.toString().equals(sb2.toString()));

    }
}


