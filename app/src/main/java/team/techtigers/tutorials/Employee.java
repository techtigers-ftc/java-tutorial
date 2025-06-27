package team.techtigers.tutorials;

/**
 * Class representing an employee.
 * <p>
 * Note: This is a relatively simple base class that has been introduced to
 * demonstrate the concept of inheritance in Java. In a real-world application,
 * this class would likely contain more complex logic and attributes.
 * </p>
 */
public class Employee {
    protected String fullName;
    protected double salary;

    /**
     * Creates a new Employee instance.
     */
    public Employee(String fullName, double salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    /**
     * Displays the details of the employee, including their name and base
     * salary.
     */
    public void showDetails() {
        System.out.printf(
                "%-5s has a base salary of $ %,.2f",
                fullName,
                salary
        );
    }
}
