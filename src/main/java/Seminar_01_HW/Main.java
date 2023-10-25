package Seminar_01_HW;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static Scanner scn = new Scanner(System.in);
    public static NoteBook noteBook = new NoteBook();
    public static String filename = "notebook.txt";
    public static final DateFormat dateFormatter
            = new SimpleDateFormat("dd-MM-yyyy");

    public static void main(String[] args) {
        String key = "";
        do {
            noteBook.addNote();
            System.out.println("Хотите добавить еще одну заметку?");

            do {
                try {
                    key = Main.scn.nextLine();
                } catch (InputMismatchException e) {
                    scn.nextLine();
                    System.out.println("Вы ввели неверное значение ...");
                    continue;
                }
            } while (!key.toLowerCase().equals("n") && !key.toLowerCase().equals("y"));

        } while (key.toLowerCase().equals("y"));

        noteBook.showAllNotes();
        noteBook.writeToFile();
    }

}
