package blueapp.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Sale {
        private long id;
        private LocalDateTime date;
        private String paymentMethod;
        private Customer customer; // Many-to-one relationship with Customer
        private List<SalesItem> salesItems; // One-to-many relationship with SalesItems


    // Constructors


    public Sale() {
    }

    public Sale(long id, LocalDateTime date, double totalRecommendedAmount, double totalAmount,
                String paymentMethod, Customer customer, List<SalesItem> salesItems) {
        this.id = id;
        this.date = date;
        this.paymentMethod = paymentMethod;
        this.customer = customer;
        this.salesItems = salesItems;
    }

    // Getters and setters


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }



    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Customer getCustomer() {
        return new Customer(customer);
    }

    public void setCustomer(Customer customer) {
        this.customer = new Customer(customer);
    }

    public List<SalesItem> getSalesItems() {
        return new ArrayList<>(salesItems);
    }

    public void setSalesItems(List<SalesItem> salesItems) {
        if(salesItems == null) {
            this.salesItems = new ArrayList<>();
        }else {
            this.salesItems = new ArrayList<>(salesItems);
        }
    }

    // Method to calculate total recommended amount dynamically
    public double getTotalRecommendedAmount() {
        return salesItems.stream()
                .mapToDouble(SalesItem::getRecommendedPrice)
                .sum();
    }

    // Method to calculate total amount dynamically
    public double getTotalAmount() {
        return salesItems.stream()
                .mapToDouble(SalesItem::getFinalSellingPrice)
                .sum();
    }

    // equals(), hashCode(), and toString()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Sale that)) return false;
        return Objects.equals(getId(), that.getId())
                && Objects.equals(getDate(),that.getDate())
                && Objects.equals(getPaymentMethod(), that.getPaymentMethod())
                && Objects.equals(getCustomer(), that.getCustomer())
                && Objects.equals(getSalesItems(),that.getSalesItems());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(),getDate(),getCustomer(),getSalesItems()
        ,getTotalAmount(),getTotalRecommendedAmount(),getPaymentMethod());
    }

    @Override
    public String toString() {
        return "Κωδικός Πώλησης: " + getId() + ", Ημερομηνία: " + getDate() +
                ", Πελάτης: " + getCustomer().getFirstname() + getCustomer().getLastname() +
                "\nΜέθοδος Πληρωμής: " + getPaymentMethod() + ", Συνολικό " +
                "ποσό πληρωμής: " + getTotalAmount();
    }

    public String toStringFull() {
        String itemsString = salesItems.stream()
                .map(SalesItem::toString)
                .collect(Collectors.joining("\n"));
        return this.toString() + "Λίστα προϊόντων: \n" +  itemsString;
    }
}
