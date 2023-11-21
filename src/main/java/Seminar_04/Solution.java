package Seminar_04;

import java.util.Scanner;

/*
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        strings = new String[6];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scn.nextLine();
        }
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] == null) {
                continue;
            }
            boolean compare = false;
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i].equals(strings[j])) {
                    System.out.println(i + " " + j);
                    strings[j] = null;
                    compare = true;
                }
            }
            if (compare) {
                strings[i] = null;
            }
        }
        //напишите тут ваш код
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}

