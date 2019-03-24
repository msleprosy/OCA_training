package OCAtasks.assesment1.variablesScope;

/**
 * Created by veronika on 24.03.2019.
 */
public class VariablesScope {
    public void eatIfHungry1(boolean hungry) {
        if (hungry) {
            int bitesOfCheese = 1;
        } // bitesOfCheese goes out of scope here
        //System.out.println(bitesOfCheese);// DOES NOT COMPILE
    }

    public void eatIfHungry2(boolean hungry) {
         if (hungry) {
              int bitesOfCheese = 1;
              {
                  boolean teenyBit = true;
                 System.out.println(bitesOfCheese);
                 }
              }
         // System.out.println(teenyBit); // DOES NOT COMPILE
          }
    /*Remember that blocks can contain other blocks.
    These smaller contained blocks can reference variables defi ned
    in the larger scoped blocks, but not vice versa. */
}
