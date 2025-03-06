package blueapp.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Product {
    private int productId;
    private String name;
    private String description;
    private double weight;
    private String category;
    private double price;
    private int stockQuantity;
    private double minutesToMake;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private List<ProductMaterial> productMaterials; // Many-to-many relationship with Materials
    private List<SalesItem> salesItems; // One-to-many relationship with SalesItems

    public Product() {
    }

    public Product(int productId, String name, double weight,
                    String description,
                    String category,
                   double price, int stockQuantity, double minutesToMake) {
        this.productId = productId;
        this.description = description;
        this.name = name;
        this.weight = weight;
        this.category = category;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.minutesToMake = minutesToMake;
    }

    public Product(Product product){
        this.productId = product.getProductId();
        this.description = product.getDescription();
        this.name = product.getName();
        this.weight = product.getWeight();
        this.category = product.getCategory();
        this.price = product.getPrice();
        this.stockQuantity = product.getStockQuantity();
        this.minutesToMake = product.getMinutesToMake();
        this.productMaterials = product.getProductMaterials();
        this.salesItems = product.getSalesItems();
        this.createdAt = product.getCreatedAt();
        this.updatedAt = product.getUpdatedAt();
    }

    public int getProductId() {

        return productId;
    }

    public void setProductId(int productId) {

        this.productId = productId;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public double getWeight() {

        return weight;
    }

    public void setWeight(double weight) {

        this.weight = weight;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {

        this.price = price;
    }


    public int getStockQuantity() {

        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }


    public List<ProductMaterial> getProductMaterials() {
        return new ArrayList<>(productMaterials);
    }

    public void setProductMaterials(List<ProductMaterial> productMaterials) {
        if (productMaterials == null) {
            this.productMaterials = new ArrayList<>();
        } else {
            this.productMaterials = new ArrayList<>(productMaterials);
        };
    }

    public List<SalesItem> getSalesItems() {
        return new ArrayList<>(salesItems);
    }

    public void setSalesItems(List<SalesItem> salesItems) {
        if (salesItems == null) {
            this.salesItems = new ArrayList<>(); // Initialize with an empty list if
            // null
        } else {
            this.salesItems = new ArrayList<>(salesItems); // Create a defensive copy
        };
    }

    public double getMinutesToMake() {
        return minutesToMake;
    }

    public void setMinutesToMake(double minutesToMake) {
        this.minutesToMake = minutesToMake;
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Κωδικός Προϊόντος: " + getProductId() + ", Όνομα: " + getName() +
                ", Βάρος: " + getWeight() + ", Τιμή: " + getPrice() +
                "\nΑπόθεμα: " + getStockQuantity() + ", Κατηγορία: " + getCategory() +
                "Χρόνος για δημιουργία: " + getMinutesToMake() + " λεπτά"
                +"\nΠεριγραφή: " + getDescription();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;

        if (!(obj instanceof Product that)) return false;
        return Objects.equals(getProductId(), that.getProductId())
                && Objects.equals(getName(), that.getName())
                && Objects.equals(getPrice(), that.getPrice())
                && Objects.equals(getDescription(), that.getDescription())
                && Objects.equals(getWeight(), that.getWeight())
                && Objects.equals(getStockQuantity(), that.getStockQuantity())
                && Objects.equals(getMinutesToMake(), that.getMinutesToMake())
                && Objects.equals(getCategory(),that.getCategory());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(),getProductId(),getPrice(),getWeight(),
                getStockQuantity(),getMinutesToMake(),getCategory(), getDescription());
    }
}
