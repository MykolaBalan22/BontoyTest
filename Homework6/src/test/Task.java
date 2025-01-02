package test;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

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

    public Product getCheapestProductFromCategory(String category) throws Exception {
        return products.stream()
                .filter(product -> product.getType().equals(category))
                .min((p1, p2) -> (int) (p1.getPrice() - p2.getPrice()))
                .orElseThrow(() -> new Exception(String.format("Продукт %s не знайдено", category)));
    }

    public List<Product> getLastTreeAddedProduct() {
        return products.stream()
                .sorted(Comparator.comparing(Product::getAddedDate))
                .limit(3)
                .toList();
    }

    public double getSummaryProductPriceByFilter(LocalDate year, String category, double price) {
        return products.stream()
                .filter(product -> product.getPrice() <= price)
                .filter(product -> product.getType().equals(category))
                .filter(product -> product.getAddedDate().getYear() >= LocalDate.now().getYear())
                .map(Product::getPrice)
                .reduce(Double::sum)
                .orElse(-1.0);
    }

    @Override
    public String toString() {
        return products.toString();
    }
}
