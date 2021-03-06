package OCAtasks.assesment1.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Created by veronika on 06.04.2019.
 */
public class WritingFromChannelToBuffer {


        public static void main (String [] args)
                throws IOException {

            String testFile = "testfile.txt";
            Path filePath = Paths.get(testFile);

            writeFile(filePath);

            readFile(filePath);
        }

        private static void writeFile(Path filePath)
                throws IOException {

            String input = "Let us go and eat!";
            System.out.println("Text written to file [" + filePath.getFileName() + "]: " + input);

            byte [] inputBytes = input.getBytes();
            ByteBuffer writeBuffer = ByteBuffer.wrap(inputBytes);

            FileChannel writeChannel = FileChannel.open(filePath, StandardOpenOption.CREATE, StandardOpenOption.WRITE);

            int noOfBytesWritten = writeChannel.write(writeBuffer);

            System.out.println(noOfBytesWritten);

            writeChannel.close();
        }

        private static void readFile(Path filePath)
                throws IOException {

            FileChannel readChannel = FileChannel.open(filePath);

            ByteBuffer readBuffer = ByteBuffer.allocate(24);
            int noOfBytesRead = readChannel.read(readBuffer);

            byte [] bytes = readBuffer.array();
            String output = new String(bytes).trim();

            System.out.println("Text read from file [" + filePath.getFileName() + "]: " + output);

            readChannel.close();
        }
}
