package blueapp.model;

public class ProviderMaterial {

    private Material material; // Many-to-one relationship with Material
    private Provider provider; // Many-to-one relationship with Provider

    public ProviderMaterial() {
    }

    public ProviderMaterial(Material material, Provider provider) {
        this.material = new Material(material);
        this.provider = new Provider(provider);
    }


    public Material getMaterial() {
        return new Material(material);
    }

    public void setMaterial(Material material) {
        this.material = new Material(material);
    }

    public Provider getProvider() {
        return new Provider(provider);
    }

    public void setProvider(Provider provider) {
        this.provider = new Provider(provider);
    }
}
