package OCAtasks.assesment1.interfaces;

import java.lang.*;

/**
 * Created by veronika on 31.03.2019.
 */
/*
* Задача 1. Написать функциональный интерфейс с методом, который принимает число и возвращает булево значение. Написать
* реализацию такого интерфейса в виде лямбда-выражения, которое возвращает true если переданное число делится без остатка на 13.*/
public class FunctionalInterfaceTask1 {
    public static void main(String[] args) {
        ClassWithLambda classWithLambda = new ClassWithLambda();
        System.out.println(classWithLambda.functionalInterface1.getBoolean(13));
    }
}

class ClassWithLambda {
    FunctionalInterface1 functionalInterface1 = (value -> {
        if (value % 13 == 0) {
            return true;
        }
        return false;
    });
}

@FunctionalInterface
interface FunctionalInterface1 {
    boolean getBoolean(int value);
}