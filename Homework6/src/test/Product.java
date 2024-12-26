package test;

public class Product {
    private String type;

    private double price;

    private boolean sale;

    public Product(String type, double price, boolean sale) {
        this.type = type;
        this.price = price;
        this.sale = sale;
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

    @Override
    public String toString() {
        return "Product{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", sale=" + sale +
                '}';
    }
}
