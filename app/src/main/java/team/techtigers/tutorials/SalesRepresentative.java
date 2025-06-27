package team.techtigers.tutorials;

/**
 * Class representing a sales representative.
 */
public class SalesRepresentative extends Employee {
    private final double salesAmount;
    private double bonusPercentage;

    /**
     * Creates a new SalesRepresentative instance.
     */
    public SalesRepresentative() {
        super("", 0.0);
        this.salesAmount = 0.0;
        this.bonusPercentage = 0.0;
    }

    /**
     * Creates a new SalesRepresentative instance with specified details.
     *
     * @param fullName    The full name of the sales representative.
     * @param salary      The base salary of the sales representative in US dollars.
     * @param salesAmount The total sales amount in US dollars.
     */
    public SalesRepresentative(String fullName, double salary, double salesAmount) {
        super(fullName, salary); // Call the constructor of the Employee class
        this.salesAmount = salesAmount;
        this.bonusPercentage = 0.0; // Initialize bonus percentage to zero
    }

    /**
     * Gets the amount of sales made by the sales representative.
     *
     * @return The representative's sales amount in US dollars.
     */
    public double getSalesAmount() {
        return salesAmount;
    }

    /**
     * Calculates the bonus percentage based on the total sales amount.
     *
     * @param totalSales The total sales amount in US dollars.
     */
    public void calculateBonus(double totalSales) {
        if (totalSales == 0) {
            bonusPercentage = 0.0; // If total sales is zero, no bonus
            return;
        }

        // Calculate the bonus percentage based on sales amount
        bonusPercentage = (this.salesAmount / totalSales) * 100;
        if (bonusPercentage > 20) {
            bonusPercentage = 20; // Cap at 20%
        }
    }

    /**
     * Displays the details of the sales representative, including their name,
     * sales amount, and bonus percentage.
     */
    @Override
    public void showDetails() {
        super.showDetails(); // Call the showDetails method from Employee class
        System.out.printf(
                "\n\tBonus earned: %,.2f percent %n",
                bonusPercentage
        );
    }
}
