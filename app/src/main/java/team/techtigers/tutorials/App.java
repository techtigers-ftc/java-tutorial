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
        int intA = 10;
        int intB = 20;
        double doubleA = 10.5;
        double doubleB = 20.5;
        boolean boolA = true;
        boolean boolB = false;

        System.out.println("---\n");

        System.out.println("int operations (a, b): (" + intA + ",  " + intB + ")");
        System.out.println("addition                 a + b  = " + (intA + intB));
        System.out.println("subtraction              a - b  = " + (intA - intB));
        System.out.println("multiplication           a * b  = " + (intA * intB));
        System.out.println("division                 a / b  = " + (intA / intB));
        System.out.println("modulus                  a % b  = " + (intA % intB));
        System.out.println("compare equal            a == b = " + (intA == intB));
        System.out.println("compare not equal        a != b = " + (intA != intB));
        System.out.println("compare greater          a > b  = " + (intA > intB));
        System.out.println("compare lesser           a < b  = " + (intA < intB));
        System.out.println("compare greater or equal a >= b = " + (intA >= intB));
        System.out.println("compare lesser or equal  a <= b = " + (intA <= intB));

        System.out.println("---\n");

        System.out.println("double operations (a, b): (" + doubleA + ",  " + doubleB + ")");
        System.out.println("modulus                  a % b  = " + (intA % intB));
        System.out.println("addition                 a + b  = " + (doubleA + doubleB));
        System.out.println("subtraction              a - b  = " + (doubleA - doubleB));
        System.out.println("multiplication           a * b  = " + (doubleA * doubleB));
        System.out.println("division                 a / b  = " + (doubleA / doubleB));
        System.out.println("modulus                  a % b  = " + (doubleA % doubleB));
        System.out.println("compare equal            a == b = " + (doubleA == doubleB));
        System.out.println("compare not equal        a != b = " + (doubleA != doubleB));
        System.out.println("compare greater          a > b  = " + (doubleA > doubleB));
        System.out.println("compare lesser           a < b  = " + (doubleA < doubleB));
        System.out.println("compare greater or equal a >= b = " + (doubleA >= doubleB));
        System.out.println("compare lesser or equal  a <= b = " + (doubleA <= doubleB));
        System.out.println("---\n");

        System.out.println("mixed operations (a, b): (" + doubleA + ",  " + intB + ")");
        System.out.println("addition                 a + b  = " + (doubleA + intB));
        System.out.println("subtraction              a - b  = " + (doubleA - intB));
        System.out.println("multiplication           a * b  = " + (doubleA * intB));
        System.out.println("division                 a / b  = " + (doubleA / intB));
        System.out.println("modulus                  a % b  = " + (doubleA % intB));
        System.out.println("compare equal            a == b = " + (doubleA == intB));
        System.out.println("compare not equal        a != b = " + (doubleA != intB));
        System.out.println("compare greater          a > b  = " + (doubleA > intB));
        System.out.println("compare lesser           a < b  = " + (doubleA < intB));
        System.out.println("compare greater or equal a >= b = " + (doubleA >= doubleB));
        System.out.println("compare lesser or equal  a <= b = " + (doubleA <= doubleB));
        System.out.println("---\n");

        System.out.println("boolean operations (a, b): (" + boolA + ",  " + boolB + ")");
        System.out.println("AND                    a AND b  = " + (boolA && boolB));
        System.out.println("OR                     a OR b   = " + (boolA || boolB));
        System.out.println("XOR                    a XOR b  = " + (boolA ^ boolB));
        System.out.println("NOT                    NOT a    = " + (!boolA));
        System.out.println("---\n");

        System.out.println("Assignment statements (a, b): (" + intA + ",  " + intB + ")");
        int c = intA + intB;
        System.out.println("c = a + b;                   c  = " + c);
        c = c + 1;
        System.out.println("c = c + 1;                   c  = " + c);
        c += 1;
        System.out.println("c += 1;                      c  = " + c);
        c++;
        System.out.println("c++;                         c  = " + c);

        c = c - 1;
        System.out.println("c = c - 1;                   c  = " + c);
        c -= 1;
        System.out.println("c -= 1;                      c  = " + c);
        c--;
        System.out.println("c--;                         c  = " + c);

        c = c * 2;
        System.out.println("c = c * 2;                   c  = " + c);
        c *= 2;
        System.out.println("c *= 2;                      c  = " + c);

        c = c / 2;
        System.out.println("c = c / 2;                   c  = " + c);
        c /= 2;
        System.out.println("c /= 2;                      c  = " + c);
        System.out.println("---\n");

        /* ---
         * Exercises:
         * ----------
         * 1. Can you use the add operator (+) between two different data
         *    types? For example, can you add an int and a double? How about
         *    a boolean and an int? Try it out and see what happens.
         *
         * 2. Can you compare two different data types? For example, can you
         *    compare an int and a double? How about a boolean and an int?
         *    Can you explain the results?
         *
         * 3. Can you use the modulus operator (%) with a double? What about
         *    a boolean? Try it out and see what happens.
         *
         * 4. Consider the following code snippet:
         *    double result = 10 / 3;
         *    What do you think the value of `result` will be? Why?
         *
         * 5. Now try running the code snippet below:
         *    int x = 10.0 / 2.0;
         *    Does this work? Why or why not?
         * --- */
    }
}
