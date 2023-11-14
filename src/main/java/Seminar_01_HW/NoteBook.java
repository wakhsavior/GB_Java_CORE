package main.java.Seminar_01_HW;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Класс работы с заметками, хранит заметки в List в виде экземпляров Note
 */

public class NoteBook {
    private List<Note> notes = new ArrayList<>();

    public void addNote(){
        System.out.printf("Введите новую заметку:");
        String noteString = Main.scn.nextLine();
        Note note = new Note(noteString);
        notes.add(note);
    }
    public void writeToFile(){

        try {
            FileWriter file = new FileWriter(Main.filename,true);
            for (Note note : notes) {
                file.write(note.toString());
                file.write("\n");
            }
            file.close();
        } catch (Exception e) {
            System.out.println("Ошибка при создании файла.");
        }

    }
    public void showAllNotes(){
        for (Note note : notes) {
            System.out.println(note);
        }
    }
}
