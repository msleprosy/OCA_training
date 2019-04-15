package OCAtasks.assesment1.nestedClasses.innerClasses.anonymousClasses;

/**
 * Created by veronika on 15.04.2019.
 */
public class ClassWithAbstractAnonymousClass {
    abstract private class AnonymousAbsctractClass {
        abstract public void voice();
    }

    public void talk(){
        AnonymousAbsctractClass anonymousClass = new AnonymousAbsctractClass(){ //it's ok to instantiate an abstract class here
                                                                //because i provide it's body right here anonymously
          public void voice(){
              System.out.println("Hello from anonymous abstract class");
          }
        };
        anonymousClass.voice();
    }

    public static void main(String[] args){
        new ClassWithAbstractAnonymousClass().talk();
    }
}

