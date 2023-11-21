package Seminar_04;

public class WrongPasswordException extends Exception{
    public WrongPasswordException(String message){
        super(message);

    }
    public WrongPasswordException(){}
}
