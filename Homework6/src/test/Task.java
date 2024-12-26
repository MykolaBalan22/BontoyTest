package test;

import java.util.List;

public class Task {

    private final List<Product> products;

    public Task(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProductsByCategory(String type, double price) {
        return products.stream()
                .filter(product -> product.getType().equals(type))
                .filter(product -> product.getPrice() > price)
                .toList();
    }

    @Override
    public String toString() {
        return products.toString();
    }
}
