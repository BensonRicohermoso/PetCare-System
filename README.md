PetCare Management System
Description/Overview
The PetCare Management System is a comprehensive Java-based console application designed to streamline the management of veterinary clinic records. This system provides an efficient solution for tracking pet information, owner details, and appointment scheduling in a single integrated platform.
The program addresses the challenge of maintaining organized pet care records by offering a user-friendly interface with CRUD (Create, Read, Update, Delete) operations. It features colorful console animations, intuitive menu navigation, and persistent data storage through file management. The system is ideal for small to medium-sized veterinary clinics, pet care centers, or animal shelters that need a straightforward record-keeping solution without the complexity of database systems.

OOP Concepts Applied
This project demonstrates all four core principles of Object-Oriented Programming:

1. Encapsulation

Implementation: All entity classes (Pet, Owner, Appointment) use private fields with public getter and setter methods.
Purpose: Protects data integrity by controlling access to class attributes and preventing unauthorized direct manipulation.
Example:

java private String name;
public String getName() { return name; } 2. Inheritance

Implementation: All entity classes extend the abstract Entity base class using the extends keyword.
Purpose: Promotes code reusability and establishes "is-a" relationships between classes.
Example:

java public class Pet extends Entity { ... }
public class Owner extends Entity { ... }
public class Appointment extends Entity { ... }

Benefit: Each entity inherits common properties like id and the generateId() method from the parent class.

3. Polymorphism

Implementation:

All entity classes implement the Displayable interface using the implements keyword
Multiple method overriding using @Override annotation

Purpose: Allows objects to be treated uniformly while maintaining their specific behaviors.
Example:

java public class Pet extends Entity implements Displayable {
@Override
public String getDisplayInfo() { ... }
@Override
public String toDisplayString() { ... }
@Override
public String toString() { ... }
} 4. Abstraction

Implementation:

Abstract class Entity with abstract method getDisplayInfo()
Interface Displayable with abstract method toDisplayString()

Purpose: Hides complex implementation details and exposes only essential features through contracts.
Example:

java public abstract class Entity {
public abstract String getDisplayInfo();
}

public interface Displayable {
String toDisplayString();
}

```

---

## Program Structure

### Class Diagram
```

┌──────────────────────┐
│ <<abstract>> │
│ Entity │
├──────────────────────┤
│ # id: String │
├──────────────────────┤
│ + generateId() │
│ + getDisplayInfo()\* │
└──────────────────────┘
△
│ extends
│
┌─────┴─────┬─────────────┐
│ │ │
┌───┴────┐ ┌───┴────┐ ┌────┴──────┐
│ Pet │ │ Owner │ │Appointment│
└────────┘ └────────┘ └───────────┘
│ │ │
└───────────┴─────────────┘
│ implements
▽
┌──────────────────────┐
│ <<interface>> │
│ Displayable │
├──────────────────────┤
│ + toDisplayString() │
│ + printDisplay() │
└──────────────────────┘

### Class Descriptions

1. **Entity.java (Abstract Class)**

   - Base class for all entities
   - Provides common `id` field and `generateId()` method
   - Declares abstract method `getDisplayInfo()`

2. **Displayable.java (Interface)**

   - Defines contract for displayable objects
   - Requires implementation of `toDisplayString()`
   - Provides default `printDisplay()` method

3. **Owner.java**

   - Stores owner information (name, contact, address)
   - Extends `Entity` and implements `Displayable`
   - Provides getters/setters for all fields

4. **Pet.java**

   - Stores pet information (name, species, age, vaccination status)
   - Contains reference to `Owner` object
   - Extends `Entity` and implements `Displayable`

5. **Appointment.java**

   - Manages appointment scheduling
   - Contains reference to `Pet` object, date, and reason
   - Extends `Entity` and implements `Displayable`

6. **PetCareSystem.java (Main Class)**
   - Entry point of the application
   - Handles user interaction through menu system
   - Manages file I/O operations for data persistence
   - Provides CRUD operations for pet records

### Class Relationships

- **Inheritance:** `Pet`, `Owner`, and `Appointment` all inherit from `Entity`
- **Implementation:** All three classes implement the `Displayable` interface
- **Composition:** `Pet` has-a `Owner`, `Appointment` has-a `Pet`
- **Aggregation:** `PetCareSystem` manages multiple entity objects

---

## How to Run the Program

### Prerequisites

- Java Development Kit (JDK) 11 or higher
- Command line terminal (CMD, PowerShell, Terminal, or Bash)

### Step-by-Step Instructions

#### **Step 1: Organize Your Files**

Ensure your project has the following structure:

YourProject/
├── src/
│ └── petcare/
│ ├── Entity.java
│ ├── Displayable.java
│ ├── Owner.java
│ ├── Pet.java
│ ├── Appointment.java
│ └── PetCareSystem.java
Step 2: Navigate to Source Directory
Open your terminal and navigate to the src directory:
bashcd path/to/YourProject/src
Step 3: Compile the Program
Compile all Java files in the petcare package:
bashjavac petcare/\*.java
If successful, you'll see no error messages and .class files will be generated.
Step 4: Run the Program
Execute the main class:
bashjava petcare.PetCareSystem

#### **Alternative: Using an IDE**

**Eclipse:**

1. Import project → Right-click on `PetCareSystem.java`
2. Run As → Java Application

**IntelliJ IDEA:**

1. Open project → Right-click on `PetCareSystem.java`
2. Run 'PetCareSystem.main()'

**VS Code:**

1. Open folder → Click "Run" button above `main()` method
2. Or press `F5` with `PetCareSystem.java` open

<<<<<<< HEAD

## =======

> > > > > > > 41a90b7 (WIP: local edits before reorganizing into package)

## Sample Output

### Welcome Screen

<<<<<<< HEAD

=======

```
>>>>>>> 41a90b7 (WIP: local edits before reorganizing into package)

┌─────────────────────────────────────────────────────────────────────────────┐
│ │
│ ██▀▀█ ██▀▀▀ █▀▀▀█▀▀▀ ██▀▀▀ ██▀▀█ ██▀▀█ ██▀▀▀ │
│ ██▄▄█ ██▄▄ █ ██ ██▄▄█ ██▄▄▀ ██▄▄ │
│ ██ ██▀▀ █ ██ ██ █ ██ ▀█ ██▀▀ │
│ ██ ██▄▄▄ █ ██▄▄▄ ██ █ ██ █ ██▄▄▄ │
│ │
│ Welcome to the PetCare System! │
│ │
│ (\_\_/) │
│ ( •.•) │
│ / > ♥ │
└─────────────────────────────────────────────────────────────────────────────┘

<<<<<<< HEAD
### Main Menu

=======
```

### Main Menu

```
>>>>>>> 41a90b7 (WIP: local edits before reorganizing into package)

┌─────────────────────────────────────────────────────────────────────────────┐
│ PetCare Menu │
│─────────────────────────────────────────────────────────────────────────────│
│ 1. Create Record │
│ 2. View All Records │
│ 3. Update Record │
│ 4. Delete Record │
│ 5. Exit │
└─────────────────────────────────────────────────────────────────────────────┘
Choose an option:

<<<<<<< HEAD


### Creating a Record

=======
```

### Creating a Record

```
>>>>>>> 41a90b7 (WIP: local edits before reorganizing into package)

Adding New Pet Record
Enter Pet Name: Max
Enter Species: Dog
Enter Age: 3
Enter Vaccination Status: Up-to-date
Enter Owner Name: John Smith
Enter Owner Contact Number: +1-555-0123
Enter Owner Address: 123 Main St, Springfield
Enter Appointment Date (yyyy-MM-dd): 2024-12-15
Enter Reason: Annual checkup
⠋ Saving record...
✓ Record added successfully!

<<<<<<< HEAD


### Viewing Records

=======
```

### Viewing Records

```
>>>>>>> 41a90b7 (WIP: local edits before reorganizing into package)

╔══════════════════════════════════════════════╗
║ PetCare Records Database ║
╚══════════════════════════════════════════════╝

Record #1
Pet: Max (Dog, 3 yrs)
Vaccination: Up-to-date
Owner: John Smith
Contact: +1-555-0123
Address: 123 Main St, Springfield
Appointment: 2024-12-15 | Annual checkup

<<<<<<< HEAD


### Exit Animation



=======
```

### Exit Animation

```

---
>>>>>>> 41a90b7 (WIP: local edits before reorganizing into package)

/ **_| _** **\_ **| | |** \_ \_ \_**| |
| | _ / _ \ / _ \ / _` | '_ \| | | |/ _ \ |
| |_| | (_) | (_) | (_| | |_) | |_| | **/\_|
\_\_**|\_**/ \_**/ \__,_|\_.**/ \_\_, |\_**(\_)
|\_\_\_/

      /\_/\
     ( ^.^ )   *wave*
      > ^ <

Exiting system...

Features
✅ Create Records - Add new pet records with complete owner and appointment information
✅ View Records - Display all stored pet records in a formatted, colorful layout
✅ Update Records - Modify vaccination status for existing pets
✅ Delete Records - Remove pet records from the system
✅ Persistent Storage - Data saved to petcare_records.txt file
✅ Animated UI - Welcome screen, loading spinners, and exit animation
✅ Color-Coded Output - ANSI colors for better readability
✅ Input Validation - Prevents errors through proper data handling
✅ OOP Architecture - Fully implements all four OOP principles

Author and Acknowledgement
Author: [Benson Ricohermoso]
Student ID: [24-02452]
Course: [Information Technology]
Institution: [Batangas State University]
Date: November 2025
Acknowledgements

Thanks to my instructor for guidance on OOP principles and Java best practices
Inspired by real-world veterinary clinic management needs
ANSI color implementation referenced from standard Java console styling techniques

Future Enhancements
Planned Features

Database Integration

Migrate from file-based storage to SQLite/MySQL database
Implement proper data relationships and constraints

Advanced Search Functionality

Search by owner name, pet species, or appointment date
Filter records by vaccination status

Appointment Reminders

Email/SMS notifications for upcoming appointments
Automated reminder system

Medical History Tracking

Complete medical records for each pet
Treatment history and prescription management

GUI Implementation

JavaFX or Swing-based graphical interface
More intuitive user experience

Multi-user Support

User authentication and authorization
Role-based access control (Admin, Veterinarian, Receptionist)

Reporting System

Generate monthly/yearly reports
Statistics on appointments and vaccinations

Billing Integration

Invoice generation for services
Payment tracking

Technical Improvements

Exception handling enhancement
Unit testing implementation
Logging system for debugging
Configuration file for customization
Data validation improvements (date format, phone numbers)

References

Java Documentation
Oracle. (2024). Java SE Documentation. Retrieved from https://docs.oracle.com/en/java/
Object-Oriented Programming Concepts
Deitel, P., & Deitel, H. (2023). Java How to Program (12th ed.). Pearson.
File I/O in Java
Oracle Java Tutorials. Reading, Writing, and Creating Files. Retrieved from https://docs.oracle.com/javase/tutorial/essential/io/
ANSI Color Codes
Stack Overflow Community. ANSI Color Codes for Java Console Applications.

License
This project is created for educational purposes as part of academic coursework. Feel free to use and modify for learning purposes with proper attribution.

Contact
For questions, suggestions, or bug reports, please contact:

Email: [bensonricohermoso@gmail.com]
GitHub: [https://github.com/BensonRicohermoso]

Last Updated: November 25, 2024
```
