# Employee Management System

A console-based **Employee Management System** developed using **Core Java** and **Object-Oriented Programming (OOP)** concepts.

The application allows users to manage different types of employees such as **Managers, Developers, and Testers** through a simple menu-driven console interface.

## Features

- Add Employee
- Display Employees
- Search Employee
- Update Employee
- Delete Employee
- Calculate Total Payroll
- Support for Manager, Developer, and Tester employee types
- Employee-specific salary calculation
- Menu-driven console interface
- Uses Java Collections
- Uses Abstract Classes
- Uses Interfaces
- Demonstrates Inheritance and Polymorphism

## Technologies Used

- Java
- Core Java
- Object-Oriented Programming
- ArrayList
- Scanner
- Abstract Classes
- Interfaces
- Inheritance
- Polymorphism
- Encapsulation
- Method Overriding
- Git
- GitHub

## OOP Concepts Used

### Encapsulation

Employee attributes are declared as private and accessed using getters and setters.

### Abstraction

The `Employee` class is an abstract class that contains common employee information and behavior.

The salary calculation is defined as an abstract method and implemented by the respective employee classes.

### Inheritance

The following classes inherit from the `Employee` class:

- Manager
- Developer
- Tester

### Polymorphism

The project uses an `Employee` reference to work with different employee types.

The appropriate overridden methods are called at runtime based on the actual employee object.

### Method Overriding

The employee subclasses override methods such as:

- `calculateSalary()`
- `displayDetails()`
- `printReport()`

### Interface

The `Printable` interface is implemented by the employee classes to provide report printing functionality.

## Employee Types

The system supports three types of employees.

### Manager

A Manager has a base salary and bonus.

```text
Total Salary = Base Salary + Bonus


Project Structure
Employee Management System/
│
├── src/
│   │
│   ├── main/
│   │   └── Main.java
│   │
│   ├── model/
│   │   ├── Employee.java
│   │   ├── Manager.java
│   │   ├── Developer.java
│   │   ├── Tester.java
│   │   └── Printable.java
│   │
│   └── Service/
│       └── EmployeeService.java
│
├── module-info.java
│
└── README.md
