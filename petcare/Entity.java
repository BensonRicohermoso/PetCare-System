package petcare;

/**
 * Abstract base class demonstrating ABSTRACTION and INHERITANCE
 * This serves as a common parent for all entities in the system
 */
public abstract class Entity {
    protected String id;

    public Entity() {
        this.id = generateId();
    }

    // Abstract method - must be implemented by subclasses (ABSTRACTION)
    public abstract String getDisplayInfo();

    // Concrete method available to all subclasses (INHERITANCE)
    protected String generateId() {
        return "ID-" + System.currentTimeMillis() + "-" + (int) (Math.random() * 1000);
    }

    public String getId() {
        return id;
    }
}