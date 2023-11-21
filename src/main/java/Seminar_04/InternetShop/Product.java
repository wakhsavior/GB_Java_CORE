package Seminar_04.InternetShop;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private static List<Product> products = new ArrayList<>();
    private static int productCount;
    private int count;
    private int id;
    private String name;

    {
        productCount++;
    }

    private Product(String name) {
        this.name = name;
        this.id = productCount;
    }

    public boolean changeProductCount(int count) {
        if (this.count + count >= 0) {
            this.count += count;
            return true;
        }
        return false;
    }

    public static int getProductCount() {
        return productCount;
    }

    public static void addNewProduct(String name) {
        Product product = new Product(name);
        products.add(product);

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static Product searchProductByName(String name) throws ProductErrorException {
        Product currentProduct = null;
        for (Product product : products) {
            if (product.getName().equals(name)) {
                currentProduct = product;
            }
        }
        if (currentProduct == null) {
            throw new ProductErrorException(String.format("Продукт с названием %s не найден в списке", name));
        } else {
            return currentProduct;
        }
    }

    public static List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Product{" +
                "count=" + count +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void showAllProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
