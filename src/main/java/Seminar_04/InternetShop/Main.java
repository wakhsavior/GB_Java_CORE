package Seminar_04.InternetShop;

public class Main {
    public static void main(String[] args) {
        Customer.addNewCustomer("Andrey");
        Customer.addNewCustomer("Sergey");
        Customer.addNewCustomer("Petr");
        Customer.addNewCustomer("Dmitry");
        Customer.addNewCustomer("Alexey");
        Product.addNewProduct("Milk");
        Product.addNewProduct("Sugar");
        Product.addNewProduct("Banana");
        Product.addNewProduct("Apple");
        Product.addNewProduct("Potatoes");

        try {
            Product.searchProductByName("Milk").changeProductCount(10);
            Product.searchProductByName("Sugar").changeProductCount(20);
            Product.searchProductByName("Banana").changeProductCount(40);
            Product.searchProductByName("Apple").changeProductCount(10);
            Product.searchProductByName("Potatoes").changeProductCount(50);
//            Product.searchProductByName("AAA").changeProductCount(10);
            Product.showAllProducts();
            Order.createOrder("Sergey");
            Order.searchOrderByCustomerName("Sergey").addProductToOrder("Milk", 10);
            Order.searchOrderByCustomerName("Sergey").addProductToOrder("Sugar", 10);
            Order.searchOrderByCustomerName("Sergey").addProductToOrder("Banana", 10);
            Order.createOrder("Alexey");
            Product.showAllProducts();
            Order.searchOrderByCustomerName("Alexey").addProductToOrder("Apple", 10);
            Order.searchOrderByCustomerName("Alexey").addProductToOrder("Sugar", 10);
            Order.searchOrderByCustomerName("Alexey").addProductToOrder("Potatoes", 10);
        } catch (ProductErrorException e) {
            throw new RuntimeException(e);
        } catch (CustomerErrorException e) {
            throw new RuntimeException(e);
        } catch (OrderErrorException e) {
            throw new RuntimeException(e);
        }

        Customer.showAllCustomers();
        Product.showAllProducts();
        Order.showAllOrders();


    }
}
