package team.techtigers.tutorials;

/**
 * Class representing a sales representative.
 */
public class SalesRepresentative {
    public String fullName;
    public double salesAmount;
    public double salary;
    public double bonusPercentage;

    /**
     * Creates a new SalesRepresentative instance.
     */
    public SalesRepresentative() {
        this.fullName = "";
        this.salesAmount = 0.0;
        this.salary = 0.0;
        this.bonusPercentage = 0.0;
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
    public void showDetails() {
        System.out.printf(
            "%-5s sold $ %,.2f, earning a bonus of %,.2f percent %n",
            fullName,
            salesAmount,
            bonusPercentage
        );
    }
}
