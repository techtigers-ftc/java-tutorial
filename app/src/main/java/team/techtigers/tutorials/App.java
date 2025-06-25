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
    }
}
