package Seminar_04.InternetShop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Order {
    private static List<Order> orders = new ArrayList<>();
    private static int ordersCount;
    private final int id;
    private Customer customer;
    private Map<Product, Integer> orderMap;

    {
        ordersCount++;
    }

    public int getId() {
        return id;
    }

    public void addProductToOrder(String productName, int count)
            throws OrderErrorException,ProductErrorException {
        Product product = Product.searchProductByName(productName);

        if (product == null){
            throw new ProductErrorException("Запрашиваемый продукт не найден");
        }
        if (!product.changeProductCount(-count)) {
            throw new OrderErrorException("Недопустимое количество товара");
        }
        orderMap.put(product, count);

    }

    Order(Customer customer) {
        this.customer = customer;
        this.id = ordersCount;
        this.orderMap = new HashMap<>();
    }

    public static Order createOrder(String customerName)
            throws CustomerErrorException {
        Customer customer = Customer.searchCustomerByName(customerName);
        if (customer == null) {
            throw new CustomerErrorException("Запрашиваемый пользователь не найден");
        }

        Order order = new Order(customer);
        orders.add(order);
        return order;
    }

    public static Order searchOrderByCustomerName(String name)throws CustomerErrorException{
        Order currentOrder = null;
        for (Order order : orders) {
            if (order.customer.getName().equals(name)) {
                currentOrder = order;
            }
        }
        if (currentOrder == null) {
            throw new CustomerErrorException(String.format(
                    "Для пользователя %s не найден заказ", name));
        } else {
            return currentOrder;
        }
    }
    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customer=" + customer +
                ", orderMap=" + orderMap +
                '}';
    }
    public static void showAllOrders(){
        for (Order order: orders) {
            System.out.println(order);
        }
    }
}
