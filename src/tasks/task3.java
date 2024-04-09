package tasks;

import java.util.Scanner;

public class task3 {
    public static void solution(Scanner sc) {
        // Read the number 'n' from input
        int n = sc.nextInt(); // Number to check

        // Print the result returned by the prime method
        System.out.println(prime(n));
    }

    /**
     * This method checks whether a given number is prime or composite.
     * Time complexity: O(sqrt(n)), where n is the input number.
     * The loop runs from 2 to the square root of the given number,
     * resulting in square root time complexity.
     *
     * @param n The number to check
     * @return "Prime" if the number is prime, "Composite" otherwise
     */
    public static String prime(int n) {
        // Loop from 2 to the square root of 'n'
        for (int i = 2; i * i <= n; i++) {
            // Check if 'n' is divisible by 'i'
            if (n % i == 0) {
                // If 'n' is divisible by 'i', it is composite
                return "Composite";
            }
        }
        // If 'n' is not divisible by any number up to its square root, it is prime
        return "Prime";
    }
}