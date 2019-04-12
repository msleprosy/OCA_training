package OCAtasks.assesment1.exceptions;

import java.io.IOException;

/**
 * Created by veronika on 12.04.2019.
 */
public class TryWithResourcesAutoCloseableExample implements AutoCloseable {
    @Override
    public void close() throws IOException { //it's better to throw more specific exception in close()
        throw new IOException("exception inside the close() method ");//this is suppressed exception
    }

    public static void main(String[] args){
/*        try(TryWithResourcesExample tryWithResourcesExample = new TryWithResourcesExample()){
            System.out.println("hello from try without suppressed exceptions");
        } catch (Exception ex){
            System.out.println("you've catched this: " + ex.getMessage());
        }*/

/*                  if try block throws an exception we should use suppressed exceptions                     */
        try(TryWithResourcesExample tryWithResourcesExample = new TryWithResourcesExample()){
            System.out.println("hello from try with suppressed exceptions");
            throw new Exception("exception inside the try block");//this is primary exception
        } catch (Exception ex){
            System.out.println("you've catched this: " + ex.getMessage());
            for (Throwable th: ex.getSuppressed()){
                System.out.println(th.getMessage());
            }
        }
    }
}
