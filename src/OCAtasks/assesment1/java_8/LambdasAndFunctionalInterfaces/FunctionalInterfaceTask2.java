package OCAtasks.assesment1.interfaces.LambdasAndFunctionalInterfaces;

/**
 * Created by veronika on 31.03.2019.
 */
/*
* Написать функциональный интерфейс с методом, который принимает две строки и возвращает тоже строку. Написать реализацию
* такого интерфейса в виде лямбды, которая возвращает ту строку, которая длиннее.
*/

public class FunctionalInterfaceTask2 {
    public static void main(String[] args) {
        ClassWithLambda2 classWithLambda2 = new ClassWithLambda2();
        System.out.println(classWithLambda2.lambda2.getLongerString("longString", "String"));
    }
}

class ClassWithLambda2 {
    FunctionalInterface2 lambda2 = (str1, str2) -> {
        if (str1.length() > str2.length())
            return str1;
        else
            return str2;
    };
}

@FunctionalInterface
interface FunctionalInterface2 {
    String getLongerString(String str1, String str2);
}

