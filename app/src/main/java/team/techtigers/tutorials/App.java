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
        int index;

        System.out.println("---\n");
        System.out.println("for loop (0-9):");
        for (index = 0; index < 10; index++) {
            System.out.println("index = " + index);
        }

        System.out.println("---\n");
        System.out.println("while loop (0-9):");
        index = 0;
        while (index < 10) {
            System.out.println("index = " + index);
            index++;
        }

        /* ---
         * Exercises:
         * ----------
         * 1. Write a for loop that prints only even numbers from 0 to 10. Can
         *    you do this with a while loop as well?
         *
         * 2. Build a countdown program that counts down from 10 to 0
         *
         * 3. Write a program that prints the multiplication table for 5 from 1
         *    to 20.
         *
         *    5 x 1 = 5
         *    5 x 2 = 10
         *    5 x 3 = 15
         *    5 x 4 = 20
         *    ...
         *
         * 4. Assume that there is a limit to the result of the multiplication
         *    operation. Now rewrite the multiplication table program to stop
         *    either after 20 iterations or when the result exceeds the limit
         *    value.
         *
         *    Note: Do not pre calculate the iterations required to reach the
         *    limit value. For example, if the limit is 50, the program should
         *    not calculate that the limit will be reached at 10 iterations and
         *    stop the loop at 10. Instead, it should start at 1 and stop when
         *    the result exceeds the limit value.
         * --- */
    }
}
