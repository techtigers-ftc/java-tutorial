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
        // This variable is available to all scopes in this method.
        System.out.println("---\n");
        System.out.println("[Outer scope]");

        int outerScope = 5;
        System.out.println("- Outer scope value     : " + outerScope);
        {
            System.out.println("  [Inner scope]");

            // This variable is available only in this inner scope and any
            // inner scopes defined within this scope.
            int innerScope = 20;

            System.out.println("    - Outer scope value     : " + outerScope);
            System.out.println("    - Inner scope value     : " + innerScope);

            {
                System.out.println("    [Innermost scope]");

                // This variable is available only in this innermost scope.
                int innermostScope = 100;

                System.out.println("      - Outer scope value     : " + outerScope);
                System.out.println("      - Inner scope value     : " + innerScope);
                System.out.println("      - Innermost scope value : " + innermostScope);
            }
        }

        /* ---
         * Exercises:
         * ----------
         * 1. Try to print the value of the innermostScope variable in the outer
         *    scope (after the innermost scope block). What happens? Why?
         *
         * 2. Can you redeclare a variable in an inner scope that has the same
         *    name as a variable in an outer scope? If so, what happens?
         * --- */
    }
}
