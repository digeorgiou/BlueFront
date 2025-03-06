package blueapp.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Customer {
    private int customerId;
    private String firstname;
    private String lastname;
    private String phoneNumber;
    private String address;
    private String email;
    private String DOY;
    private String VAT;
    private List<Sale> sales;

    public Customer(Customer customer) {
        this.customerId = customer.getCustomerId();
        this.phoneNumber = customer.getPhoneNumber();
        this.lastname = customer.getLastname();
        this.firstname = customer.getLastname();
        this.DOY = customer.getDOY();
        this.VAT = customer.getVAT();
        this.address = customer.getAddress();
        this.email = customer.getEmail();
        this.sales = customer.getSales();
    }

    public Customer() {
    }
    
    

    public Customer(int customerId, String firstname, String lastname, String phoneNumber, String address, String email,
			String dOY, String vAT) {
		super();
		this.customerId = customerId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.email = email;
		DOY = dOY;
		VAT = vAT;
	}

	public int getCustomerId() {

        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getPhoneNumber() {

        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDOY() {
        return DOY;
    }

    public void setDOY(String DOY) {
        this.DOY = DOY;
    }

    public String getVAT() {
        return VAT;
    }

    public void setVAT(String VAT) {
        this.VAT = VAT;
    }

    public List<Sale> getSales() {
        return new ArrayList<>(sales);
    }

    public void setSales(List<Sale> sales) {
        this.sales = new ArrayList<>(sales);
    }

    @Override
    public String toString() {
        return getCustomerId()+ " " + getFirstname() + " " +  getLastname();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;

        if (!(obj instanceof Customer that)) return false;
        return Objects.equals(getCustomerId(), that.getCustomerId())
                && Objects.equals(getPhoneNumber(), that.getPhoneNumber())
                && Objects.equals(getFirstname(), that.getFirstname())
                && Objects.equals(getLastname(), that.getLastname())
                && Objects.equals(getAddress(), that.getAddress())
                && Objects.equals(getEmail(), that.getEmail())
                && Objects.equals(getDOY(), that.getDOY())
                && Objects.equals(getVAT(), that.getVAT())
                && Objects.equals(getSales(),that.getSales());

    }

    @Override
    public int hashCode() {
        return Objects.hash(getCustomerId(),getPhoneNumber(),getFirstname()
        ,getLastname(), getSales(), getAddress(), getDOY(), getEmail(),
                getVAT());
    }
}
