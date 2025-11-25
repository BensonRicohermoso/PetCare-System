package petcare;

public class Pet extends Entity implements Displayable {
    private String name;
    private String species;
    private int age;
    private String vaccinationStatus;
    private Owner owner;

    public Pet(String name, String species, int age, String vaccinationStatus, Owner owner) {
        super(); // Call parent constructor
        this.name = name;
        this.species = species;
        this.age = age;
        this.vaccinationStatus = vaccinationStatus;
        this.owner = owner;
    }

    // ENCAPSULATION - Getters
    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public String getVaccinationStatus() {
        return vaccinationStatus;
    }

    public Owner getOwner() {
        return owner;
    }

    // ENCAPSULATION - Setter
    public void setVaccinationStatus(String vaccinationStatus) {
        this.vaccinationStatus = vaccinationStatus;
    }

    // POLYMORPHISM - Implementing abstract method from Entity
    @Override
    public String getDisplayInfo() {
        return "Pet: " + name + " (" + species + ") [" + id + "]";
    }

    // POLYMORPHISM - Implementing interface method from Displayable
    @Override
    public String toDisplayString() {
        return "Pet: " + name + " (" + species + ", " + age + " yrs)\n"
                + "Vaccination: " + vaccinationStatus + "\n"
                + owner.toString();
    }

    // POLYMORPHISM - Overriding Object's toString()
    @Override
    public String toString() {
        return toDisplayString();
    }
}