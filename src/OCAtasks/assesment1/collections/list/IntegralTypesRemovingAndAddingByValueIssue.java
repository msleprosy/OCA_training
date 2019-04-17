package OCAtasks.assesment1.arrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by veronika on 03.04.2019.
 */
public class IntegralTypesRemovingAndAddingByValueIssue {

    public static void main(String[] args) {
        int primitivInt = 8;
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(primitivInt);
        //numbers.remove(1);//deletes by index instead of deleting by value
        numbers.remove(new Integer(1));//deletes by value
        System.out.println(numbers);
        List<Byte> numbers2 = new ArrayList<>();
        numbers2.add(new Byte((byte)1));//same shit with Short
        numbers2.add(new Byte((byte)2));
        //numbers.remove(1);
        numbers2.remove(new Byte((byte)1));
        System.out.println(numbers2);

        String s = "8";
        Integer objectInt1 = 1;
        int primitiveInt1 = objectInt1.intValue();//primitive
        int primitiveInt12 = Integer.parseInt(s);//primitive
        Integer objectInt12 = Integer.valueOf(s);//object

    }
}

/*
*
* byte 1 byte -128 to 127, short 2 bytes -32,768 to 32,767.
*
* Assignment Conversion:
*
* byte a = 1;
The assignment will not generate the compiler error because at any time if an integral value is assigned to any of the
primitive types (byte, char, short), and the right hand side value is within the range of the left hand side data type,
it will not generate an error. Hence as 1 is within the range of byte (-128 to 127), it is not generating compiler error.
For example:
byte a = 129; //Compile-time error
When you assign an integral value to any primitive type variable, the compiler will do a range checking to see if this value
is in the range of the left side data type. If it is NOT within the range of data type, a compile-time error occurs.
*
* Method Invocation Conversion
*
Byte c = new Byte(1);

A compile-time error will occur because you are passing an integer to the constructor of the Wrapper class Byte,
the compiler will not do the implicit casting here.
* */