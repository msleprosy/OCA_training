package OCAtasks.assesment1.java_8.LambdasAndFunctionalInterfaces;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Collections.sort;

/**
 * Created by veronika on 04.04.2019.
 */
public class FunctionalInterfaceComparator implements Comparator<String> {
        public int compare(String firstStr, String secondStr) {
            //return Integer.compare(firstStr.length(),secondStr.length());
            return firstStr.compareTo(secondStr);
        }

        public static void main(String[] args){
            List<String> strings = Arrays.asList("string1", "string11", "str");
            sort(strings, new FunctionalInterfaceComparator ()); //with anonymous class (in this case you need to
                                                                  //implement Comparator in this class and then pass it in sort method
            System.out.println(strings);

           /* Comparator<String> comparator = (firstStr, secondStr) // with lambda
                    -> Integer.compare(firstStr.length(),secondStr.length());
            Collections.sort(strings, comparator);
            System.out.println(strings);*/
        }
    }



