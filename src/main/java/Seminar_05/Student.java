package Seminar_05;

import java.util.*;

/**
 * Урок 5. Тонкости работы
 * 1 Имеется список студентов. Каждый студент имеет имя, список оценок и специальность.
 * Найдите первых 5 студентов специальности "Информатика" с средним баллом выше 4.5, отсортированных по убыванию среднего балла.
 * В решении не использовать циклы! Только StreamAPI
 * class Student {
 * private String name;
 * private List<Double> grades;
 * private String specialty;
 * <p>
 * public double getAverageGrade() {...}
 * <p>
 * }
 */

public class Student {
    private String name;
    private List<Double> grades;
    private String specialty;

    public double getAverageGrade() {
        double summ = 0L;
        return grades.stream().mapToDouble(x -> x).sum() / grades.size();

    }

    public Student(String name, List<Double> grades, String speciality) {
        this.name = name;
        this.grades = grades;
        this.specialty = speciality;

    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades + " Aver= " + getAverageGrade() +
                ", specialty='" + specialty + '\'' +
                '}';
    }

    public String getSpecialty() {
        return specialty;
    }
}

class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Артем", Arrays.asList(5.0, 4.5, 6.6, 5.4), "Физика"));
        students.add(new Student("Игорь", Arrays.asList(5.0, 7.2, 3.4, 5.4, 4.2), "Информатика"));
        students.add(new Student("Максим", Arrays.asList(5.0, 6.2, 6.6, 5.4, 5.3), "Физика"));
        students.add(new Student("Илья", Arrays.asList(5.0, 7.2, 6.6, 5.4, 4.5, 5.2), "Информатика"));
        students.add(new Student("Виталий", Arrays.asList(5.6, 2.2, 6.3, 5.4, 5.3), "Физика"));
        students.add(new Student("Денис", Arrays.asList(5.0, 7.2, 6.2, 6.4, 7.2), "Физика"));
        students.add(new Student("Вадим", Arrays.asList(5.0, 6.5, 3.2, 4.3, 7.0, 7.1), "Информатика"));
        students.add(new Student("Семен", Arrays.asList(5.0, 7.3, 6.2, 5.4, 5.0, 6.1, 7.2), "Физика"));
        students.add(new Student("Роман", Arrays.asList(6.0, 7.2, 7.6, 5.4, 6.2, 5.2, 8.0), "Информатика"));
        students.add(new Student("Мария", Arrays.asList(5.4, 7.6, 6.3, 5.4, 7.3, 8.3, 7.5), "Физика"));
        students.add(new Student("Светлана", Arrays.asList(5.0, 7.5, 6.3, 5.4, 5.0, 5.6, 7.2), "Информатика"));
        students.add(new Student("Альбина", Arrays.asList(6.0, 7.5, 6.6, 5.4, 6.2, 7.1, 4.4), "Физика"));
        students.add(new Student("Ванентина", Arrays.asList(5.0, 8.2, 3.6, 5.4, 6.0, 7.3, 8.2), "Информатика"));
        students.add(new Student("Евгения", Arrays.asList(5.0, 7.2, 6.6, 5.4, 7.2, 8.2, 5.6, 4.0), "Физика"));
        students.add(new Student("Татьяна", Arrays.asList(5.0, 7.2, 6.6, 5.4, 5.6, 4.6, 3.5, 8.6), "Информатика"));
        students.add(new Student("Семен", Arrays.asList(5.0, 4.2, 3.5, 2.4, 4.5, 4.6, 3.5, 4.6), "Информатика"));

        for (Student student : students
        ) {
            System.out.println((int) student.getAverageGrade());

        }
        students.stream().
                filter(x -> x.getSpecialty() == "Информатика").
                filter(x -> x.getAverageGrade() > 4.5).
                sorted((x1, x2) -> (x1.getAverageGrade() - x2.getAverageGrade()) < 0.0 ? 1 : -1).
                limit(5).
                forEach(System.out::println);

    }
}

