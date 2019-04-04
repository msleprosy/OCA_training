package OCAtasks.assesment1.interfaces.LambdasAndFunctionalInterfaces;

import java.lang.*;

/**
 * Created by veronika on 31.03.2019.
 */
/*
* Задача 1. Написать функциональный интерфейс с методом, который принимает число и возвращает булево значение. Написать
* реализацию такого интерфейса в виде лямбда-выражения, которое возвращает true если переданное число делится без остатка на 2.*/
public class FunctionalInterfaceTask1 {
    public static void main(String[] args) {
        ClassWithLambda classWithLambda = new ClassWithLambda();
        System.out.println(classWithLambda.lambda1.getBoolean(6));
    }
}

class ClassWithLambda {
    /*FunctionalInterface1*/ BaseFunctionalInterface lambda1 = value -> {
        if (value % 2 == 0) {
            return true;
        }
        return false;
    };
}
@FunctionalInterface
interface BaseFunctionalInterface{
    boolean getBoolean(int val);
}

@FunctionalInterface
interface FunctionalInterface1 extends BaseFunctionalInterface{
/*   @Override
    boolean getBoolean(int value);*/
}