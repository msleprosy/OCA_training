package OCAtasks.assesment1.nestedClasses.innerClasses.anonymousClasses;

/**
 * Created by veronika on 14.04.2019.
 */
public class ClassWithAnonymousClass1 {
    public static void main(String[] args){
        new AnonymousClass() {
            private void talk()

            {
                System.out.println("ClassWithAnonymousClass is talking");
            }
        };
    }
}
