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
        char charVal = 'A';
        byte byteVal = 65;

        System.out.println("---\n");

        System.out.println("long (original)   : " + longVal);
        System.out.println("long --> short    : " + (short) intVal);
        System.out.println("long --> int      : " + (int) longVal);
        System.out.println("---\n");

        System.out.println("short (original)  : " + shortVal);
        System.out.println("short --> long    : " + (long) shortVal);
        System.out.println("short --> int     : " + (int) shortVal);
        System.out.println("---\n");

        System.out.println("int (original)    : " + intVal);
        System.out.println("int --> long      : " + (long) intVal);
        System.out.println("---\n");

        System.out.println("float (original)  : " + floatVal);
        System.out.println("float --> double  : " + (double) floatVal);
        System.out.println("---\n");

        System.out.println("double (original) : " + doubleVal);
        System.out.println("double --> float  : " + (float) doubleVal);
        System.out.println("---\n");

        System.out.println("char (original)  : " + charVal);
        System.out.println("char --> short   : " + (short) charVal);
        System.out.println("char --> byte    : " + (byte) charVal);
        System.out.println("---\n");

        System.out.println("byte (original)  : " + byteVal);
        System.out.println("byte --> short   : " + (short) byteVal);
        System.out.println("byte --> char    : " + (char) byteVal);
        System.out.println("---\n");

        /* ---
         * Exercises:
         * ----------
         * 1. Can you typecast an integer value to a string to an integer?
         *    Can you think of why this is or is not possible?
         *
         * 2. Why does the value of longVal change when you typecast it to a
         *    short or int, but the value of shortVal does not change when
         *    you typecast it to a long or int?
         *
         * 3. Can you typecast an int to a boolean?
         *
         * 4. A byte value of 65 is typecast to a char value of 'A'. What
         *    character do you think a byte value of 66 would be typecast to?
         *    What number would yield a char value of 'J'? Experiment with
         *    typecasting byte values to char values to find out.
         *
         * 5. Explore typecasting between other data types, such as string and
         *    int, string and double, etc.
         * --- */
    }
}
