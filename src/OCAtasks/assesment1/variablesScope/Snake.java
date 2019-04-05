package OCAtasks.assesment1.variablesScope;

/**
 * Created by veronika on 26.03.2019.
 */
public class Snake {

    public void shed(boolean time) {

        if (time) {
            String result = "done";
        }
        //System.out.println(result);
    }

    public static void main(String[] args){
        Snake s = new Snake();
        s.shed(false);
    }
}
