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
        int chosenNumber = 42;

        // As you understand if-then-else statements, try changing the value of
        // guess and see how the program behaves.
        int guess = 13;

        if (guess < chosenNumber) {
            System.out.println("Your guess is too small");
        } else if (guess > chosenNumber) { // Only evaluated if the first condition is false
            System.out.println("Your guess is too large");
        } else { // Only evaluated if the first and second conditions are false
            System.out.println("You guessed the right number!");
        }
    }
}
