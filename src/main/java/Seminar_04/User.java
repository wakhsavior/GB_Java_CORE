package Seminar_04;

import java.util.Scanner;

public class User {
    private String login;
    private String password;
    public static boolean createLogin(String login, String password, String confirmPassword) throws WrongLoginException,WrongPasswordException{
        if (login.length()>=20){
            throw new WrongLoginException(String.format("Длина логина %d превышает максимальное 19 символов",login.length()));
        }if (password.length()>=20 || !password.equals(confirmPassword)){
            throw new WrongLoginException(String.format("Пароль не соответсвует требованиям"));
        }
        User user = new User(login,password);
        return true;
    }
    private User(String login, String password){
        this.login = login;
        this.password = password;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите логин: ");
        String login = scn.nextLine();
        System.out.println("Введите пароль: ");
        String password = scn.nextLine();
        System.out.println("Повторите ввод пароля: ");
        String confirmPassword = scn.nextLine();
        try {
            createLogin(login,password,confirmPassword);
        } catch (WrongLoginException e) {
            e.printStackTrace();
        } catch (WrongPasswordException e) {
            e.printStackTrace();
        }

    }
}
