package OCAtasks.assesment1.nio;

import java.io.IOException;
import java.nio.file.*;

/**
 * Created by veronika on 06.04.2019.
 */
public class FileCopyingMoving {

    public static void main(String[] args) {
        Path sourcePath = Paths.get("C:\\Users\\veronika\\Desktop\\demoio\\demoio2\\test1.txt");
        Path destinationPath = Paths.get("C:\\Users\\veronika\\Desktop\\demoio\\demoio2\\test2.txt");
        Path dest = Paths.get(".");
        //System.out.println(dest.resolve(destinationPath));

        try {
            Files.copy(sourcePath, destinationPath);//doesn't copy the directories with files, copies just the test1.
        } catch (FileAlreadyExistsException e) {
            //destination file already exists
        } catch (IOException e) {
            //something else went wrong
            e.printStackTrace();
        }

/*
        Path sourcePath2 = Paths.get("C:\\Users\\veronika\\Desktop\\demoio\\demoio2");
        Path destinationPath2 = Paths.get("C:\\Users\\veronika\\Desktop\\testFolder");

        try {
            Files.move(sourcePath2, destinationPath2,
                    StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}
