package OCAtasks.assesment1.nestedClasses.innerClasses.anonymousClasses;

/**
 * Created by veronika on 14.04.2019.
 */
public class ClassWithAnonymousClassSimpleExample {
    public static void main(String[] args){
        new AnonymousClassSimpleExample() {
            private void talk()

            {
                System.out.println("ClassWithAnonymousClass is talking");
            }
        }./*voice();*/ talk();
    }
}
