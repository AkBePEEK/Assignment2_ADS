package tasks;

import java.util.Scanner;

public class task5 {
    public static void solution(Scanner sc) {
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }
    /**
     * This method calculates the nth number of Fibonacci series
     * It uses recursive approach.
     * Time complexity: O(2^n), where n is the given number.
     * The recursive algorithm iterates through two additional recursive calls,
     * resulting exponential time complexity.
     *
     * @param n The index of the Fibonacci number to calculate
     * @return The nth Fibonacci number
     */
    public static int fibonacci(int n) {
        // Base case: If n is less than 2, return 1
        if (n < 2) return 1;

        // Recursive case: Calculate the nth Fibonacci number by summing the (n-1)th and (n-2)th Fibonacci numbers
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}