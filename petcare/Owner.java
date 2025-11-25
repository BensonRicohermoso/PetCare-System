package petcare;

public class Owner extends Entity implements Displayable {
    private String name;
    private String contactNumber;
    private String address;

    public Owner(String name, String contactNumber, String address) {
        super(); // Call parent constructor
        this.name = name;
        this.contactNumber = contactNumber;
        this.address = address;
    }

    // ENCAPSULATION - Getters
    public String getName() {
        return name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getAddress() {
        return address;
    }

    // ENCAPSULATION - Setters
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // POLYMORPHISM - Implementing abstract method from Entity
    @Override
    public String getDisplayInfo() {
        return "Owner: " + name + " [" + id + "]";
    }

    // POLYMORPHISM - Implementing interface method from Displayable
    @Override
    public String toDisplayString() {
        return "Owner: " + name + ", Contact: " + contactNumber + ", Address: " + address;
    }

    // POLYMORPHISM - Overriding Object's toString()
    @Override
    public String toString() {
        return toDisplayString();
    }
}