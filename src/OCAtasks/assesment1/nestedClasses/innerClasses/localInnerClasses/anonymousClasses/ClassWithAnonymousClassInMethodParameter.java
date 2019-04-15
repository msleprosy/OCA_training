package OCAtasks.assesment1.nestedClasses.innerClasses.anonymousClasses;

/**
 * Created by veronika on 15.04.2019.
 */
public class ClassWithAnonymousClassInMethodParameter {
    interface Speakable{
        String voice();
    }

    private void speak(){
        conversation("Hello", new Speakable(){
            @Override
            public String voice() {
                return "Hi";
            }
        });
    }

    private void conversation(String str1, Speakable str2){
        System.out.println(str1 + "  " + str2.voice());
    }

    public static void main(String[] args){
        new ClassWithAnonymousClassInMethodParameter().speak();
    }
}
