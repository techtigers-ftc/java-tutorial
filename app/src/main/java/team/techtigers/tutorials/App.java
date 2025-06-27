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
        short shortVal = Short.MAX_VALUE;
        int intVal = Integer.MAX_VALUE;
        long longVal = Long.MAX_VALUE;
        double doubleVal = 22.0 / 7.0;
        float floatVal = (float) 22 / 7;
        boolean boolVal = false;
        char charVal = 'A';
        byte byteVal = 65;
        String strVal = "Hello World!";

        System.out.println("---\n");

        System.out.println("Short value   : " + shortVal);
        System.out.println("Int value     : " + intVal);
        System.out.println("Long value    : " + longVal);
        System.out.println("---\n");

        System.out.println("Float value   : " + floatVal);
        System.out.println("Double value  : " + doubleVal);
        System.out.println("---\n");

        System.out.println("Boolean value : " + boolVal);
        System.out.println("---\n");

        System.out.println("Char value    : " + charVal);
        System.out.println("Byte value    : " + byteVal);
        System.out.println("---\n");

        System.out.println("String value  : " + strVal);
        System.out.println("---\n");

        /* ---
         * Exercises:
         * ----------
         * 1. What is the smallest value for a short/int/long?
         *
         * 2. The integer value is currently set to its maximum value.
         *    What do you get when you try to increment it (increase its value
         *    by 1)?
         *    Note: You can increment a value by using the `++` operator.
         *    For example, intVal++; will increment the value of intVal by 1.
         *
         * 3. What do you get if you now try to decrement it (decrease its value
         *    by 1)?
         *    Note: You can decrement a value by using the `--` operator.
         *
         * 4. Based on the results of the previous exercises, how many different
         *    values can you store in a short?
         *
         * 5. Explore the the limits and ranges of the other data types.
         *
         * 6. You can declare a variable without assigning it a value like this:
         *      int uninitializedInt;
         *    What happens if you try to print the value of this variable?
         * --- */
    }
}
