package tasks;

import java.util.Scanner;

public class task9 {
    /**
     * This method calculates the binomial coefficient C(k, n) recursively.
     * Time complexity: O(2^n), where 'n' is the number of trials.
     * The recursive algorithm iterates through two additional recursive calls,
     * resulting exponential time complexity.
     *
     * @param k The number of successes
     * @param n The number of trials
     * @return The binomial coefficient C(k, n)
     */
    public static int binomial_coefficient(int k, int n) {
        // Base cases: if k equals n or k equals 0, return 1
        if (k == n || k == 0)
            return 1;

        // Recursive case: calculate the binomial coefficient using Pascal's triangle formula
        return binomial_coefficient(k - 1, n - 1) + binomial_coefficient(k, n - 1);
    }

    /**
     * This method reads two integers 'n' and 'k' from the user, then calculates and prints the binomial coefficient.
     *
     * @param sc Scanner object for user input
     */
    public static void solution(Scanner sc) {
        // Read the values of 'n' and 'k' from input
        int n = sc.nextInt(); // Number of trials
        int k = sc.nextInt(); // Number of successes

        // Calculate the binomial coefficient using the binomial_coefficient method
        int solution = binomial_coefficient(k, n);

        // Print the calculated binomial coefficient
        System.out.println(solution);
    }
}
