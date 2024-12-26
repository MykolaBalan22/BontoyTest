package test;

import java.util.List;
import java.util.NoSuchElementException;

public class Task {

    private final List<Product> products;

    public Task(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProductsByCategory(String category, double price) {
        return products.stream()
                .filter(product -> product.getType().equals(category))
                .filter(product -> product.getPrice() > price)
                .toList();
    }

    public List<Product> getProductsByCategoryWithDiscount(String category, int discount) {
        return products.stream()
                .filter(product -> product.getType().equals(category))
                .filter(Product::isSale)
                .peek(product -> product.setPrice(product.getPrice() - product.getPrice() / discount))
                .toList();
    }

    public Product getCheapestProductFromCategory(String category) throws Exception{
        return products.stream()
                .filter(product -> product.getType().equals(category))
                .min((p1,p2)->(int)(p1.getPrice()-p2.getPrice()))
                .orElseThrow(()-> new Exception(String.format("Продукт %s не знайдено", category)));
    }

    @Override
    public String toString() {
        return products.toString();
    }
}
