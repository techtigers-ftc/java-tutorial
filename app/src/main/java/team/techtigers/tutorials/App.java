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

        /* ---
         * Exercises:
         * ----------
         * 1. Add a condition to the if-then-else statement that will warn the
         *    user if the guessed value is negative?
         *
         * 2. Update the program to give the user a hint if the guessed value
         *    is within 5 of the chosen number, while still keeping the messages
         *    that tell the user if their guess is too small or too large.
         *    Can you do this without duplicating print statements?
         *
         * 3. Change the program number to allow 2 correct answers. If the users
         *    guesses any of the numbers, they should be told that they guessed
         *    the right number. If they guess a number that does not match any of
         *    the numbers, they should be told that their guess is too small or
         *    too large compared to the closest number.
         *    For example:
         *    Assume that the chosen numbers are 42 and 50.
         *    If  the user guesses 45, they should be told that their guess is
         *    too large. This is because the closest correct number is 42, and
         *    the user's guess is greater than this value.
         *    If the user guesses 49, they should be told that their guess is
         *    too small. This is because the closest correct number is 50, and
         *    the user's guess is less than this value.
         * --- */
    }
}
