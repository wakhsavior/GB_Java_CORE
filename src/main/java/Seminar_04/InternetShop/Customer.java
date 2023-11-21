package Seminar_04.InternetShop;

import java.util.ArrayList;
import java.util.List;


public class Customer {
    private static List<Customer> customers = new ArrayList<>();
    private static int customersCount;
    private String name;
    private final int id;
    {
        customersCount++;
    }
    private Customer (String name){
        this.name = name;
        this.id = customersCount;
    }
    public static void addNewCustomer(String name){
        Customer customer = new Customer(name);
        customers.add(customer);
    }

    public static List<Customer> getCustomers() {
        return customers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Customer searchCustomerById(int id){
        Customer currentCustomer = null;
        for (Customer customer: customers) {
            if (customer.getId() == id){
                currentCustomer = customer;
            }
        }
        return currentCustomer;
    }

    public int getId() {
        return id;
    }

    public static int getCustomersCount() {
        return customersCount;
    }
    public static Customer searchCustomerByName(String name){
        Customer currentCustomer = null;
        for (Customer customer: customers) {
            if (customer.getName().equals(name)){
                currentCustomer = customer;
            }
        }
        return currentCustomer;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
    public static void showAllCustomers(){
        for (Customer customer: customers) {
            System.out.println(customer);
        }
    }
}
