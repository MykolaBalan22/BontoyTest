package test;

import java.time.LocalDate;

public class Product {
    private String type;

    private double price;

    private boolean sale;

    private LocalDate addedDate;

    public Product(String type, double price, boolean sale, LocalDate addedDate) {
        this.type = type;
        this.price = price;
        this.sale = sale;
        this.addedDate = addedDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isSale() {
        return sale;
    }

    public void setSale(boolean sale) {
        this.sale = sale;
    }

    public LocalDate getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(LocalDate addedDate) {
        this.addedDate = addedDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", sale=" + sale +
                ", addedDate=" + addedDate +
                '}';
    }
}
