package blueapp.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;

public class Purchase {
    private long purchaseId;
    private double totalCost;
    private LocalDateTime purchaseDate;
    private Provider provider;
    private List<PurchaseItem> purchaseItems;

    public Purchase() {
    }

    public Purchase(long purchaseId, LocalDateTime date, double totalCost,
                    Provider provider, List<PurchaseItem> purchaseItems) {
        this.purchaseId = purchaseId;
        this.purchaseDate = date;
        this.totalCost = totalCost;
        this.provider = provider;
        this.purchaseItems = new ArrayList<>(purchaseItems);
    }

    public Purchase(Purchase purchase) {
        this.purchaseId = purchase.getPurchaseId();
        this.purchaseDate = purchase.getPurchaseDate();
        this.totalCost = purchase.getTotalCost();
        this.provider = purchase.getProvider();
        this.purchaseDate = purchase.getPurchaseDate();
        this.purchaseItems = purchase.getPurchaseItems();
    }

    public long getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(long purchaseId) {
        this.purchaseId = purchaseId;
    }


    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public LocalDateTime getPurchaseDate() {

        return purchaseDate;
    }

    public void setPurchaseDate(LocalDateTime purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Provider getProvider() {
        return new Provider(provider);
    }

    public void setProvider(Provider provider) {
        this.provider = new Provider(provider);
    }

    public List<PurchaseItem> getPurchaseItems() {
        return new ArrayList<>(purchaseItems);
    }

    public void setPurchaseItems(List<PurchaseItem> purchaseItems) {
        if(purchaseItems == null){
            this.purchaseItems = new ArrayList<>();
        }else {
            this.purchaseItems = new ArrayList<>(purchaseItems);
        }
    }

    @Override
    public String toString() {
        return "Κωδικός Αγοράς: " + getPurchaseId() + "Ημερομηνία: " + getPurchaseDate() +
                ", Προμηθευτής: " + getProvider().getProviderName() +
                "Συνολικό Ποσό: " + getTotalCost();
    }

    public String toStringFull() {
        String itemsString = purchaseItems.stream()
                .map(PurchaseItem::toString)
                .collect(Collectors.joining("\n"));
        return this.toString() + "Λίστα προϊόντων: \n" +  itemsString;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;

        if (!(obj instanceof Purchase that)) return false;
        return Objects.equals(getPurchaseItems(), that.getPurchaseItems())
                && Objects.equals(getPurchaseId(), that.getPurchaseId())
                && Objects.equals(getPurchaseDate(), that.getPurchaseDate())
                && Objects.equals(getTotalCost(), that.getTotalCost())
                && Objects.equals(getProvider(), that.getProvider());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPurchaseId(),getPurchaseDate(),
                getPurchaseItems(), getTotalCost(), getProvider());
    }
}
