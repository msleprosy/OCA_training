package OCAtasks.assesment1.generics.PECS;

/**
 * Created by veronika on 17.04.2019.
 */
public class PecsWithAmpersandExample <T extends Clazz & A & B> {

    public static void main(String[] args){
        PecsWithAmpersandExample<SubClazz> pp = new PecsWithAmpersandExample<>();

    }

}

class Clazz{}

class SubClazz extends Clazz implements A, B {
    @Override
    public void methodA() {

    }

    @Override
    public void methodB() {

    }
}

interface A{
    void methodA();
}

interface B{
    void methodB();
}