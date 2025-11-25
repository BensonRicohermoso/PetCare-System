package petcare;

/**
 * Interface demonstrating ABSTRACTION and POLYMORPHISM
 * Defines a contract for objects that can be displayed
 */
public interface Displayable {
    // Abstract method that must be implemented
    String toDisplayString();

    // Default method (Java 8+) - provides default implementation
    default void printDisplay() {
        System.out.println(toDisplayString());
    }
}