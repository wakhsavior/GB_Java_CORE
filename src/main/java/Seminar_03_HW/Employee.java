package Seminar_03_HW;

import java.util.*;
import java.util.regex.Pattern;

public class Employee implements Comparable<Employee> {
    public static Scanner scn = new Scanner(System.in);
    public static Random rnd = new Random();
    private String date;
    private int salary;
    private String name;

    public String getDate() {
        return date;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public Employee(String name, String date) {
        this.date = date;
        this.salary = rnd.nextInt(30000,100000);
        this.name = name;
    }



    private static int convertStringToDate(String strDate) {
        String resDate = "";
        if (!Pattern.matches("\\d{4}-\\d{2}-\\d{2}", strDate)) {
            throw new RuntimeException(String.format("Дата %s не соответствует  формату yyyy-mm-dd", strDate));
        } else {
            String[] string = strDate.split("-");

            for (String s : string) {
//                System.out.println(s);
                resDate += s;
            }
        }
        return Integer.valueOf(resDate);
    }
    public void increaseSalary(int changeSalary){
        this.salary = this.salary + changeSalary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name=" + name +
                " /birthDate=" + date +
                " /salary=" + salary +
                '}';
    }
    @Override
    public int compareTo(Employee o) {
        int thisDate = convertStringToDate(this.date);
        int objectDate = convertStringToDate(o.date);
        return thisDate - objectDate;
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите Имя сотрудника: ");
            String name = scn.nextLine();
            System.out.println("Введите дату рождения сотрудника (yyyy-mm-dd): ");
            String birthDate = scn.nextLine();
            Employee employee = new Employee(name,birthDate);
            employees.add(employee);
        }
        System.out.println("Введите Имя менеджера: ");
        String name = scn.nextLine();
        System.out.println("Введите дату рождения менеджера (yyyy-mm-dd): ");
        String birthDate = scn.nextLine();
        Manager manager = new Manager(name,birthDate);
        employees.add(manager);
        Collections.sort(employees);
        System.out.println("До повышения ЗП:");
        for (Employee employee: employees) {
            System.out.println(employee);
        }
        Manager.increaseSalary(employees);
        System.out.println("После повышения ЗП:");
        for (Employee employee: employees) {
            System.out.println(employee);
        }
    }


}


