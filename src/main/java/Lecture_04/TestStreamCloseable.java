package Lecture_04;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestStreamCloseable implements Closeable {

    TestStreamCloseable() throws IOException {
        System.out.println("Construct OK");
        throw new IOException();
    }

    int read() throws FileNotFoundException {
        new FileInputStream("file.txt");
        System.out.println("read OK");
        return 1;
    }

    @Override
    public void close() throws IOException {
        System.out.println("close OK");
        throw new IOException();
    }

    public static void main(String[] args) {
        try (TestStreamCloseable stream = new TestStreamCloseable()) {
            int a = stream.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
