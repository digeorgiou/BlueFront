package blueapp.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Material {
    private int materialId;
    private String name;
    private int quantityInStock;
    private double unitPrice;
    private List<ProductMaterial> productMaterials; // Many-to-many relationship with Products
    private List<ProviderMaterial> providerMaterials; // Many-to-many relationship with Providers
    private List<PurchaseItem> purchaseItems; // One-to-many relationship with PurchaseItems


    public Material() {
    }
    
    

    public Material(int materialId, String name, int quantityInStock, double unitPrice) {
		this.materialId = materialId;
		this.name = name;
		this.quantityInStock = quantityInStock;
		this.unitPrice = unitPrice;
	}



	public Material(Material material){
        this.materialId = material.getMaterialId();
        this.name = material.getName();
        this.quantityInStock = material.getQuantityInStock();
        this.unitPrice = material.getUnitPrice();
        this.productMaterials = material.getProductMaterials();
        this.providerMaterials = material.getProviderMaterials();
        this.purchaseItems = material.getPurchaseItems();
    }

    public int getMaterialId() {
        return materialId;
    }

    public void setMaterialId(int materialId) {
        this.materialId = materialId;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getQuantityInStock() {

        return quantityInStock;
    }

    public void setQuantity(int quantity) {
        this.quantityInStock = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPricePerGram) {
        this.unitPrice = unitPricePerGram;
    }

    public List<ProductMaterial> getProductMaterials() {
        return new ArrayList<>(productMaterials);
    }

    public void setProductMaterials(List<ProductMaterial> productMaterials) {
        if (providerMaterials == null) {
            this.productMaterials = new ArrayList<>();
        } else {
            this.productMaterials = new ArrayList<>(productMaterials);
        }
    }

    public List<ProviderMaterial> getProviderMaterials() {
        return  new ArrayList<>(providerMaterials);
    }

    public void setProviderMaterials(List<ProviderMaterial> providerMaterials) {
        if (providerMaterials == null) {
            this.providerMaterials = new ArrayList<>(); // Initialize with an empty list if null
        } else {
            this.providerMaterials = new ArrayList<>(providerMaterials); // Create a defensive copy
        }
    }

    public List<PurchaseItem> getPurchaseItems() {
        return new ArrayList<>(purchaseItems);
    }

    public void setPurchaseItems(List<PurchaseItem> purchaseItems) {
        if (purchaseItems == null) {
            this.purchaseItems = new ArrayList<>(); // Initialize with an empty list if null
        } else {
            this.purchaseItems = new ArrayList<>(purchaseItems); // Create a defensive copy
        }
    }

    @Override
    public String toString() {
        return "Κωδικός Υλικού: " + getMaterialId() +", Όνομα: " + getName()
                + "\nΑπόθεμα: " + getQuantityInStock() + ", Τιμή ανα τμχ: " +
                + getUnitPrice() + " ευρώ" ;
    }

    @Override
    public boolean equals(Object obj) {
            if(this == obj) return true;

            if (!(obj instanceof Material that)) return false;
            return Objects.equals(getMaterialId(), that.getMaterialId())
                    && Objects.equals(getName(), that.getName())
                    && Objects.equals(getQuantityInStock(), that.getQuantityInStock())
                    && Objects.equals(getUnitPrice(), that.getUnitPrice())
                    && Objects.equals(getProductMaterials(),that.getProductMaterials())
                    && Objects.equals(getPurchaseItems(),that.getPurchaseItems())
                    && Objects.equals(getProviderMaterials(),that.getProviderMaterials());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMaterialId(),getName(),
                getQuantityInStock(),getUnitPrice(),
                getProductMaterials(),getProductMaterials(),getPurchaseItems());
    }
}
