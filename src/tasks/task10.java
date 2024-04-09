package tasks;

import java.util.Scanner;

public class task10 {
    /**
     * This method calculates the greatest common divisor (GCD) of two integers 'a' and 'b' recursively.
     * Time complexity: O(log(min(a, b))), where 'a' and 'b' are the input integers.
     * The recursive algorithm uses Euclid's algorithm,
     * resulting logarithmic time complexity.
     *
     * @param a The first integer
     * @param b The second integer
     * @return The GCD of 'a' and 'b'
     */
    public static int gcd(int a, int b) {
        // Base case: if 'b' is 0, return 'a' as the GCD
        if (b == 0)
            return a;

        // Recursive case: calculate the GCD using Euclid's algorithm
        return gcd(b, a % b);
    }

    /**
     * This method reads two integers 'a' and 'b' from the user, then calculates and prints their greatest common divisor (GCD).
     *
     * @param sc Scanner object for user input
     */
    public static void solution(Scanner sc) {
        // Read the values of 'a' and 'b' from input
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Calculate the GCD using the gcd method
        int result = gcd(a, b);

        // Print the calculated GCD
        System.out.println(result);
    }
}
