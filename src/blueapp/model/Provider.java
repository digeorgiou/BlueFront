package blueapp.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Provider {
    int providerId;
    String providerName;
    List<ProviderMaterial> providerMaterials;
    List<Purchase> purchases;
    String VAT;
    String DOY;
    String address;
    String phoneNumber;

    public Provider() {
    }

    public Provider(int providerId, String providerName,
                    List<ProviderMaterial> providerMaterials,
                    List<Purchase> purchases, String VAT,
                    String DOY,
                    String address, String phoneNumber) {

        this.providerId = providerId;
        this.providerName = providerName;
        this.providerMaterials = new ArrayList<>(providerMaterials);
        this.purchases = new ArrayList<>(purchases);
        this.VAT = VAT;
        this.DOY = DOY;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Provider (Provider provider){
        this.providerId = provider.getProviderId();
        this.providerName = provider.getProviderName();
        this.providerMaterials = provider.getProviderMaterials();
        this.VAT = provider.getVAT();
        this.DOY = provider.getDOY();
        this.address = provider.getAddress();
        this.phoneNumber = provider.getPhoneNumber();
        this.purchases = provider.getPurchases();
    }

    public int getProviderId() {
        return providerId;
    }

    public void setProviderId(int providerId) {
        this.providerId = providerId;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public ArrayList<ProviderMaterial> getProviderMaterials() {
        return new ArrayList<>(providerMaterials);
    }

    public void setProviderProducts(ArrayList<ProviderMaterial> providerMaterials) {
        this.providerMaterials = new ArrayList<>(providerMaterials);
    }

    public List<Purchase> getPurchases() {
        return new ArrayList<>(this.purchases);
    }

    public void setPurchases(List<Purchase> purchases) {
        this.purchases = new ArrayList<>(purchases);
    }

    public String getVAT() {
        return VAT;
    }

    public void setVAT(String VAT) {
        this.VAT = VAT;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDOY() {
        return DOY;
    }

    public void setDOY(String DOY) {
        this.DOY = DOY;
    }

    @Override
    public String toString() {
        return "Κωδικός Προμηθευτή: " + getProviderId() + ", Προμηθευτής: " + getProviderName()
                +", Τηλέφωνο: " + getPhoneNumber() + "\n"
                + ", ΑΦΜ: " + getVAT() + ", ΔΟΥ: " + getDOY() + ", Διεύθυνση:" +
                " " + getAddress();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;

        if (!(obj instanceof Provider that)) return false;
        return Objects.equals(getAddress(), that.getAddress())
                && Objects.equals(getProviderId(), that.getProviderId())
                && Objects.equals(getVAT(), that.getVAT())
                && Objects.equals(getProviderName(), that.getProviderName())
                && Objects.equals(getPhoneNumber(), that.getPhoneNumber())
                && Objects.equals(getProviderMaterials(),
                that.getProviderMaterials())
                && Objects.equals(getPurchases(),that.getPurchases())
                && Objects.equals(getDOY(), that.getDOY());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAddress(),getDOY(),getProviderId(),
                getProviderName(),getProviderMaterials(), getPurchases(),getVAT(),
                getPhoneNumber());
    }
}
