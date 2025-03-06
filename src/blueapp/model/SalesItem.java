package blueapp.model;


import java.util.Objects;

public class SalesItem {
    private long salesItemId;
    private int quantity;
    private double discountPercentage; // Discount percentage (e.g., 10.0 for 10%)
    private double recommendedPrice; // Recommended price = product.getPrice() * quantity
    private double finalSellingPrice; // Final selling price = recommendedPrice - (recommendedPrice * (discountPercentage / 100))
    private Sale sale; // Many-to-one relationship with Sale
    private Product product; // Many-to-one relationship with Product

    // Constructors
    public SalesItem() {
    }

    public SalesItem(long salesItemId, int quantity, double discountPercentage, Sale sale, Product product) {
        this.salesItemId = salesItemId;
        this.quantity = quantity;
        this.discountPercentage = discountPercentage;
        this.product = product;
        this.recommendedPrice = product.getPrice() * quantity; // Calculate recommended price
        this.finalSellingPrice = calculateFinalSellingPrice(); // Calculate final selling price
        this.sale = sale;
    }

    // Getters and Setters
    public long getSalesItemId() {
        return salesItemId;
    }

    public void setSalesItemId(long salesItemId) {
        this.salesItemId = salesItemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        this.recommendedPrice = this.product.getPrice() * quantity; // Recalculate recommended price
        this.finalSellingPrice = calculateFinalSellingPrice(); // Recalculate final selling price
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {

        this.discountPercentage = discountPercentage;
        this.finalSellingPrice = calculateFinalSellingPrice(); // Recalculate final selling price
    }

    public double getRecommendedPrice() {
        return recommendedPrice;
    }

    // No setter for recommendedPrice because it is calculated

    public double getFinalSellingPrice() {
        return finalSellingPrice;
    }

    // No setter for finalSellingPrice because it is calculated

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    public Product getProduct() {
        return new Product(product);
    }

    public void setProduct(Product product) {
        this.product = product;
        this.recommendedPrice = product.getPrice() * this.quantity; // Recalculate recommended price
        this.finalSellingPrice = calculateFinalSellingPrice(); // Recalculate final selling price
    }

    // Helper method to calculate final selling price
    private double calculateFinalSellingPrice() {
        return recommendedPrice - (recommendedPrice * (discountPercentage / 100));
    }

    @Override
    public String toString() {
        return "{" +
                "Κωδικός προϊόντος: " + getProduct().getProductId() +
                ", Όνομα προϊόντος: " + getProduct().getName() +
                ", Ποσότητα: " + getQuantity() +
                "\nΑρχική Τιμή: "  + getRecommendedPrice()+
                ", Τελική Τιμή: " + getFinalSellingPrice()+
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check if the same instance
        if (!(obj instanceof SalesItem that)) return false;

        // Compare fields
        return salesItemId == that.salesItemId &&
                quantity == that.quantity &&
                Double.compare(that.discountPercentage, discountPercentage) == 0 &&
                Double.compare(that.recommendedPrice, recommendedPrice) == 0 &&
                Double.compare(that.finalSellingPrice, finalSellingPrice) == 0 &&
                Objects.equals(sale, that.sale) &&
                Objects.equals(product, that.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salesItemId, quantity, discountPercentage,
                recommendedPrice, finalSellingPrice, sale, product);
    }

}