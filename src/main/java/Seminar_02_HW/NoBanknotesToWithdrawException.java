package Seminar_02_HW;

public class NoBanknotesToWithdrawException extends Exception{
    private String string;
    public NoBanknotesToWithdrawException (String message, String string){
        super(message);
        this.string = string;
    }
    public String getString(){
        return string;
    }
}
