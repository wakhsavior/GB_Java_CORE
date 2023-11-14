package Seminar_03_HW;

import java.util.List;

public class Manager extends Employee{

    public Manager(String date, String name) {
        super(date, name);
    }
    public static void increaseSalary(List<Employee> employees){
        for (Employee employee: employees) {
//            System.out.println(employee instanceof Manager);
            if(!(employee instanceof Manager)){
                employee.increaseSalary(rnd.nextInt(1000,30000));
            }
        }

    }
    @Override
    public String toString() {
        return "Manager{" +
                "name=" + super.getName() +
                " /birthDate=" + super.getDate() +
                " /salary=" + super.getSalary() +
                '}';
    }
}
