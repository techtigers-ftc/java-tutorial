// Packages are units of organization of Java programs.
// Note: Convention dictates that the package structure typically follows the
// reverse order of the author's domain name. For example, if the author's
// domain is "techtigers.team", the package name would be "team.techtigers".
package team.techtigers.tutorials;

/**
 * Class for the main application code.
 * <p>
 * Note: All code in Java must be defined in classes. This is not defined as a
 * traditional object oriented class, but is only intended as an entry point
 * into the program.
 * </p>
 */
public class App {

    /**
     * Program entrypoint.
     * <p>
     * This is a special method that is invoked when the java program is run
     * from the command line.
     * </p>
     *
     * @param args Arguments passed to the entry point from the command line.
     */
    public static void main(String[] args) {
        // This is a fictitious scenario that deals with a team of sales
        // representatives and the bonuses that they earn at the end of the year.
        // For every representative, we have a name, base salary, and the amount
        // of money that they have generated via sales.
        //
        // This program attempts to calculate what bonus percentage to apply to
        // each sales representative based on their contributions. Bonuses are
        // calculated as the percentage of total sales brought in, capped at 20%.

        SalesRepresentative[] salesRepresentatives = new SalesRepresentative[]{
                new SalesRepresentative("John", 65375, 201892.25),
                new SalesRepresentative("Shawn", 71234, 512501.97),
                new SalesRepresentative("David", 65192, 262942.78),
                new SalesRepresentative("Jerry", 69521, 198767.23),
                new SalesRepresentative("Phil", 62153, 243153.82)
        };

        System.out.println("---\n");

        // First calculate the total sales
        double totalSales = 0.0;
        for (SalesRepresentative representative : salesRepresentatives) {
            totalSales = totalSales + representative.salesAmount;
        }
        System.out.printf("Total Sales = $ %,.2f%n", totalSales);
        System.out.println("---\n");

        // Now calculate the bonus allocated to each sales rep by calling the
        // calculateBonus() function
        for (SalesRepresentative representative : salesRepresentatives) {
            representative.calculateBonus(totalSales);
            representative.showDetails();
        }
        System.out.println("---\n");
    }
}
