package petcare;

public class Appointment extends Entity implements Displayable {
    private Pet pet;
    private String date;
    private String reason;

    public Appointment(Pet pet, String date, String reason) {
        super(); // Call parent constructor
        this.pet = pet;
        this.date = date;
        this.reason = reason;
    }

    // ENCAPSULATION - Getters
    public Pet getPet() {
        return pet;
    }

    public String getDate() {
        return date;
    }

    public String getReason() {
        return reason;
    }

    // POLYMORPHISM - Implementing abstract method from Entity
    @Override
    public String getDisplayInfo() {
        return "Appointment for " + pet.getName() + " on " + date + " [" + id + "]";
    }

    // POLYMORPHISM - Implementing interface method from Displayable
    @Override
    public String toDisplayString() {
        return "Appointment for " + pet.getName() +
                " on " + date +
                " | Reason: " + reason;
    }

    // POLYMORPHISM - Overriding Object's toString()
    @Override
    public String toString() {
        return toDisplayString();
    }
}