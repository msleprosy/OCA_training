package OCAtasks.assesment1;

/**
 * Created by veronika on 03.04.2019.
 */
public class ForWithLabel {
    public static void main(String[] args) {
        label:
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                if (j == 2) continue label;
                System.out.println(i + "-" + j + "");
            }
        }
    }
}
