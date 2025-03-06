package blueapp.model;

import java.util.Objects;

public class PurchaseItem {
    private long purchaseItemId;
    private double quantity;
    private double pricePerUnit;
    private Purchase purchase; // Many-to-one relationship with Purchase
    private Material material; // Many-to-one relationship with Material


    public PurchaseItem() {
    }

    public PurchaseItem(long purchaseItemId, double quantity,
                        double pricePerUnit, Material material, Purchase purchase) {
        this.purchaseItemId = purchaseItemId;

        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
        this.material = material;
        this.purchase = purchase;
    }

    public long getPurchaseItemId() {
        return purchaseItemId;
    }

    public void setPurchaseItemId(long purchaseItemId) {
        this.purchaseItemId = purchaseItemId;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public Purchase getPurchase() {
        return new Purchase(purchase);
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = new Purchase(purchase);
    }

    public Material getMaterial() {
        return new Material(material);
    }

    public void setMaterial(Material material) {
        this.material = new Material(material);
    }

    @Override
    public String toString() {
        return "{" +
                "Κωδικός προϊόντος: " + getMaterial().getMaterialId() +
                ", Όνομα προϊόντος: " + getMaterial().getName() +
                ", Ποσότητα: " + getQuantity() +
                ", Τιμή ανά τμχ: "  + getPricePerUnit()+
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check if the same instance
        if (!(obj instanceof PurchaseItem that)) return false; // Check if null
        // or different class
        // Compare fields
        return purchaseItemId == that.purchaseItemId &&
                Double.compare(that.quantity, quantity) == 0 &&
                Double.compare(that.pricePerUnit, pricePerUnit) == 0 &&
                Objects.equals(purchase, that.purchase) &&
                Objects.equals(material, that.material);
    }


    @Override
    public int hashCode() {
        return Objects.hash(purchaseItemId, quantity, pricePerUnit, purchase, material);
    }
}
