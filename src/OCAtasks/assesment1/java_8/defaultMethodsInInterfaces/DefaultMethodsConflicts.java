package OCAtasks.assesment1.interfaces.defaultMethodsInInterfaces;

/**
 * Created by veronika on 31.03.2019.
 */
public class DefaultMethodsConflicts implements Person, Naming {
    @Override
    public String getFirstName() {
        return Person.super.getFirstName();
    }

    public static void main(String[] args) {
        DefaultMethodsConflicts defaultMethodsConflicts = new DefaultMethodsConflicts();
        System.out.println(defaultMethodsConflicts.getFirstName());
    }
}

interface Person {
    default String getFirstName() {
        return "Jack";
    }
}

interface Naming {
    default String getFirstName() {
        return getClass().getName() + "_" + hashCode();
    }
}
