package OCAtasks.assesment1;

/**
 * Created by veronika on 29.03.2019.
 */
 abstract class Animal
{
    private final String fullName;

    protected Animal()
    {
        fullName = "Animal " + getName();
    }

    public String getFullName()
    {
        return fullName;
    }

    protected abstract String getName();
}

 class Dog extends Animal
{
    private String thisName = "DDog";

    protected String getName()
    {
        return thisName;
    }
}

class Test{
    public static void main(String[] args)
    {
        Animal animal = new Dog();
        System.out.println(animal.getFullName());
    }
}



/*
Сначала выдаст значение а = 99,а после префиксного инкремента выполнится снова метод recur с параметром 100,
который выведет а=100, следующий recur будет вызван с параметром 101, но условие выполняться не будет, так как передаваемый
параметр больше 100, и будет выведено на экран значение параметра а=101, закончится выполнение этого метода, и программа
возвратится к предыдущему выполнению этого метода, и выдаст значение а=100, таким, каким бы выдало его, если бы
метод recur и вовсе не вызывался сам в себе, а просто переменная а увеличилась бы на 1.

У каждого метода свой собственный набор локальных переменных. Т.е. у каждого "экземпляра" метода
recur своя собственная переменная a. Последовательность вызовов можно изобразить в виде вот такой вот "матрёшки":

recur(99)
|--------------
| a=99
| recur(++a)
| |--------------
| | a=100
| | recur(++a)
| | |--------------
| | | условие не выполняется, ничего не делаем
| | |--------------
| | a=101
| |--------------
| a=100
|--------------
* */