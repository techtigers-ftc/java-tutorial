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
        int[] scoreList = new int[10];

        // Note that array indices start from 0 and go to length - 1
        System.out.println("---\n");
        System.out.println("Adding scores to array");
        scoreList[0] = 95;
        scoreList[1] = 75;
        scoreList[2] = 87;
        scoreList[3] = 74;
        scoreList[4] = 88;
        scoreList[5] = 91;
        scoreList[6] = 76;
        scoreList[7] = 81;
        scoreList[8] = 93;
        scoreList[9] = 69;
        System.out.println("---\n");

        System.out.println("Number of scores: " + scoreList.length);
        System.out.println("First score   : " + scoreList[0]);
        System.out.println("Second score  : " + scoreList[1]);
        System.out.println("Third score   : " + scoreList[2]);
        System.out.println("Fourth score  : " + scoreList[3]);
        System.out.println("Fifth score   : " + scoreList[4]);
        System.out.println("Sixth score   : " + scoreList[5]);
        System.out.println("Seventh score : " + scoreList[6]);
        System.out.println("Eighth score  : " + scoreList[7]);
        System.out.println("Ninth score   : " + scoreList[8]);
        System.out.println("Tenth score   : " + scoreList[9]);
        System.out.println("---\n");

        /* ---
         * Exercises:
         * ----------
         * 1. Rewrite this code to use a for loop to add the scores to the
         *    array, and to print the scores.
         *
         * 2. Consider the following code:
         *    int [] numbers = new int[] {315, 821, 123, 456, 789, 234, 567, 890};
         *    Calculate the sum of all the elements in the array
         *
         * 3. Consider the following code:
         *    int [] numbers = new int[] {315, 821, 123, 456, 789, 234, 567, 890};
         *    Count the number of elements in the array that are even numbers
         *
         * 4. Consider the code shown below
         *    char[] steps = new char[] {'>', '>', '=', '<', '<', '=', '<', '>', '>', '<', '<', '<', '>', '>'};
         *    int counter = 0;
         *
         *    Now consider the following rules:
         *     - A step value of '>' increments the counter by 1
         *     - A step value of '<' decrements the counter by 1
         *     - A step value of '=' does not change the counter
         *
         *    Write a program that calculates the final value of the counter
         *    when the items in the steps array are applied in order.
         * --- */
    }
}
