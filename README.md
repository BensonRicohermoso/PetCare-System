# 🐾 PetCare Management System: Console Edition

## 📘 Project Overview

The **PetCare Management System** is a comprehensive, Java-based **console application** designed to streamline record-keeping within veterinary clinics or animal shelters. It offers an efficient, integrated solution for tracking essential information regarding pets, their owners, and scheduled appointments.

This system provides a **user-friendly interface** built around fundamental **CRUD (Create, Read, Update, Delete)** operations, making the maintenance of organized pet care records straightforward and efficient.

## 🎯 Key Features & Description
The application is tailored for small-to-medium-sized animal care facilities needing a robust record-keeping solution without the overhead of complex database systems.

* ✅ **CRUD Operations:** Full functionality to **Create, View, Update, and Delete** pet records.
* ✅ **Persistent Storage:** Data is automatically saved to and loaded from a local file (`petcare_records.txt`) upon startup and exit.
* ✅ **Animated UI:** Includes a welcoming screen, loading indicators, and a clean exit animation, enhancing the console experience.
* ✅ **Color-Coded Output:** Utilizes ANSI colors for improved readability and menu distinction.
* ✅ **OOP Architecture:** Fully implements and demonstrates all four core Object-Oriented Programming principles.

---

## 🧠 OOP Concepts Applied
This project serves as a clear demonstration of core OOP principles through its structured class design.

| Principle | Implementation | Purpose | Example Classes |
| :--- | :--- | :--- | :--- |
| **Encapsulation** | Private fields with public **getter** and **setter** methods in all entity classes. | Protects data integrity by controlling external access and modification of attributes. | `Pet`, `Owner`, `Appointment` |
| **Inheritance** | Entity classes (`Pet`, `Owner`, `Appointment`) **extend** the `Entity` abstract base class. | Promotes **code reusability** for common properties (like `id`) and methods (`generateId()`). | `Pet extends Entity` |
| **Polymorphism** | Entity classes **implement** the `Displayable` interface and **override** display-related methods (`getDisplayInfo()`, `toString()`). | Allows different object types to respond to the same method call with type-specific behaviors, especially for formatting output. | `@Override public String toString()` |
| **Abstraction** | Use of the **abstract class** `Entity` and the **interface** `Displayable`. | Hides complex implementation details (like ID generation or formatting logic) and exposes only necessary features through defined contracts. | `abstract class Entity`, `interface Displayable` |

---

## 🏗️ Program Structure

### Class Relationships
| Relationship | Description | Example |
| :--- | :--- | :--- |
| **Inheritance** | `Pet`, `Owner`, and `Appointment` inherit from the `Entity` abstract class. | `public class Pet extends Entity` |
| **Implementation**| All entity classes implement the `Displayable` interface for standardized output. | `implements Displayable` |
| **Composition** | `Pet` objects contain a reference to an `Owner` object; `Appointment` has a reference to a `Pet`. | `private Owner owner;` in `Pet.java` |

### Key Class Descriptions

| Class Name | Type | Responsibility |
| :--- | :--- | :--- |
| **`Entity.java`** | Abstract Class | Base class; provides common `id` field and abstract methods that subclasses must implement. |
| **`Displayable.java`**| Interface | Defines the contract for how entity objects should format and print their data to the console. |
| **`Pet.java`** | Entity Class | Stores pet-specific data (name, species, age, vaccination) and links to its owner. |
| **`Owner.java`** | Entity Class | Stores owner details (name, contact, address). |
| **`Appointment.java`**| Entity Class | Manages scheduling details (date, reason, pet reference). |
| **`PetCareSystem.java`**| Main Class | Application entry point; handles menu navigation, user input, and file I/O for data persistence. |

---

## 🖥️ How to Run the Program

### Prerequisites
* Java Development Kit (JDK) **11 or higher**.
* Command line terminal (CMD, PowerShell, or Bash).

### Step-by-Step Instructions (Terminal)

1.  **Navigate to Source:**
    ```bash
    cd path/to/YourProject/src
    ```
2.  **Compile:** Compile all Java files within the `petcare` package.
    ```bash
    javac petcare/*.java
    ```
3.  **Run:** Execute the main application class.
    ```bash
    java petcare.PetCareSystem
    ```

### Sample Output

The application features a clear, color-coded console interface, including:

* **Welcome Screen** with ASCII art.
* **Main Menu** for CRUD operation selection.
* **Prompted Input** for creating detailed records (Pet, Owner, Appointment).
* **Formatted Display** of all stored records.
* **Exit Animation** upon system termination.

---

## 👤 Author and Acknowledgement
**Author:** [Benson Ricohermoso]
**Student ID:** [24-02452]
**Course:** [Information Technology]
**Institution:** [Batangas State University]
**Date:** November 2025

**Acknowledgements:**
* Thanks to my instructor for guidance on OOP principles.
* Inspired by real-world veterinary clinic management needs.
* ANSI color implementation referenced from standard Java console styling techniques.

## 🚀 Future Enhancements
The following features are planned for future versions to transition the system into a full-scale clinical application:

### Database & Functionality
* **Database Integration:** Migrate from file-based storage to a modern database (SQLite/MySQL).
* **Advanced Search:** Implement robust searching by owner name, pet species, or appointment date.
* **Medical History Tracking:** Add dedicated modules for complete medical records and prescription management.
* **Reporting System:** Generate monthly/yearly reports for appointments and vaccinations.

### Technical & UX Improvements
* **GUI Implementation:** Develop a JavaFX or Swing-based graphical user interface for an intuitive experience.
* **Exception Handling:** Comprehensive enhancement of error handling and validation.
* **Multi-user Support:** Implement user authentication and role-based access control.

---

## Contact
For questions, suggestions, or bug reports, please contact:
* **Email:** [bensonricohermoso@gmail.com]
* **GitHub:** [https://github.com/BensonRicohermoso]

**License:** This project is created for educational purposes as part of academic coursework. Feel free to use and modify for learning purposes with proper attribution.
