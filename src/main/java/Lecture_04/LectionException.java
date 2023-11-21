package Lecture_04;

import java.io.IOException;

public class LectionException {
    public static void methodA(){
        RuntimeException e = new RuntimeException();
        throw e;
    }

    public void methodB(){
        try {
            throw new IOException();
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
    public void methodC() throws IOException{
        throw new IOException();
    }
    public void methodD() {
        try {
            throw new IOException();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        LectionException.methodA();
    }
}
