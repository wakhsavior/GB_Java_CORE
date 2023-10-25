package Seminar_01_HW;

import java.util.Date;


/**
 * Класс заметки, автоматически генерирует дату создания заметки, текст заметки хранит в переменном типа String
 * В Классе переопределен метор toString для форматирования заметок в удобном формате для вывода на экран и записи в файл
 *
 */
public class Note {
    private static int currentId;
    private int id;
    private Date createDate;
    private String note;
    {
        id = currentId + 1;
        currentId++;
    }

    public Note(String note) {
        this.createDate = new Date();
        this.note = note;
    }

    @Override
    public String toString() {
        return id + ": " +
                Main.dateFormatter.format(createDate) +
                " --> " + note;
    }
}
