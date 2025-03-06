package blueapp.model;

public class ProductMaterial {
    private double quantityUsed;
    private Product product; // Many-to-one relationship with Product
    private Material material; // Many-to-one relationship with Material

    public ProductMaterial() {
    }

    public ProductMaterial(Product product, double quantityUsed, Material material) {

        this.product = new Product(product);
        this.quantityUsed = quantityUsed;
        this.material = new Material(material);
    }

    public Product getProduct() {
        return new Product(product);
    }

    public void setProduct(Product product) {
        this.product = new Product(product);
    }

    public double getQuantityUsed() {
        return quantityUsed;
    }

    public void setQuantityUsed(double quantityUsed) {
        this.quantityUsed = quantityUsed;
    }

    public Material getMaterial() {
        return new Material(material);
    }

    public void setMaterial(Material material) {
        this.material = new Material(material);
    }
}
