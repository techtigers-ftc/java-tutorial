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

        SalesRepresentative[] salesRepresentatives = new SalesRepresentative[5];

        salesRepresentatives[0] = new SalesRepresentative();
        salesRepresentatives[0].fullName = "John";
        salesRepresentatives[0].salary = 65375;
        salesRepresentatives[0].salesAmount = 201892.25;

        salesRepresentatives[1] = new SalesRepresentative();
        salesRepresentatives[1].fullName = "Shawn";
        salesRepresentatives[1].salary = 71234;
        salesRepresentatives[1].salesAmount = 512501.97;

        salesRepresentatives[2] = new SalesRepresentative();
        salesRepresentatives[2].fullName = "David";
        salesRepresentatives[2].salary = 65192;
        salesRepresentatives[2].salesAmount = 262942.78;

        salesRepresentatives[3] = new SalesRepresentative();
        salesRepresentatives[3].fullName = "Jerry";
        salesRepresentatives[3].salary = 69521;
        salesRepresentatives[3].salesAmount = 198767.23;

        salesRepresentatives[4] = new SalesRepresentative();
        salesRepresentatives[4].fullName = "Phil";
        salesRepresentatives[4].salary = 62153;
        salesRepresentatives[4].salesAmount = 243153.82;

        System.out.println("---\n");

        // First calculate the total sales
        double totalSales = 0.0;
        for (int index = 0; index < salesRepresentatives.length; index++) {
            SalesRepresentative representative = salesRepresentatives[index];
            totalSales = totalSales + representative.salesAmount;
        }
        System.out.printf("Total Sales = $ %,.2f%n", totalSales);
        System.out.println("---\n");

        // Now calculate the bonus allocated to each sales rep by calling the
        // calculateBonus() function
        for (int index = 0; index < salesRepresentatives.length; index++) {
            SalesRepresentative representative = salesRepresentatives[index];

            // Call function to calculate bonus
            double bonus = calculateBonus(representative.salesAmount, totalSales);

            System.out.printf(
                    "%-5s sold $ %,.2f, earning a bonus of %,.2f percent %n",
                    representative.fullName, representative.salesAmount, bonus);
        }
        System.out.println("---\n");
    }

    /**
     * Calculates the bonus allocated to a sales representative based on their
     * individual and department sales. Bonus percentages are capped at 20% and
     * If the total sales is 0, then the bonus percentage is also 0.
     *
     * @param individualSales Sales contributed by the individual in US dollars.
     * @param totalSales      Total sales in US dollars
     * @return The bonus percentage earned by the individual
     */
    private static double calculateBonus(double individualSales, double totalSales) {
        if (totalSales == 0) {
            return 0.0;
        }
        double percentage = (individualSales / totalSales) * 100;
        if (percentage > 20.0) {
            percentage = 20.0;
        }
        return percentage;
    }
}
