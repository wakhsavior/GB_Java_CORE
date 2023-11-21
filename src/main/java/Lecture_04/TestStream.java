package Lecture_04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.FormatFlagsConversionMismatchException;

public class TestStream {
    TestStream()throws IOException{
        System.out.println("Construct OK");
        throw new IOException();
    }
    int read() throws FileNotFoundException{
        new FileInputStream("file.txt");
        System.out.println("read OK");
        return 1;
    }
    public void close() throws IOException{
        System.out.println("close OK");
        throw new IOException();
    }

    public static void main(String[] args) {
        TestStream stream = null;
        try {
            stream = new TestStream();
            int a= stream.read();
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();;
        }finally {
            if (stream!=null) {
                try {
                    stream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
