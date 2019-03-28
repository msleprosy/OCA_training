package OCAtasks.assesment1;

/**
 * Created by veronika on 29.03.2019.
 */
public abstract class Animal
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

