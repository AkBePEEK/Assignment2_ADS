package tasks;

import java.util.Scanner;

public class task6 {
    public static void solution(Scanner sc) {
        int a = sc.nextInt(), n = sc.nextInt();
        System.out.println(power(a, n));
    }
    /**
     * This method calculates the power of a base number raised to a given exponent recursively.
     * Time complexity: O(power), where power is the given exponent.
     * The recursive algorithm uses repeated multiplication operations,
     * resulting linear time complexity.
     *
     * @param base   The base number
     * @param power  The exponent
     * @return The result of base raised to the power
     */
    public static int power(int base, int power) {
        // Base case: If the exponent is 1, return the base number
        if (power == 1)
            return base;

        // Recursive case: Calculate the power using recursion
        return base * power(base, power - 1);
    }
}
