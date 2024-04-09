package tasks;

import java.util.Scanner;

public class task7 {
    /**
     * This method reads 'n' integers from the user using Scanner and prints them in reverse order recursively.
     * Time complexity: O(n), where n is the input number.
     * The recursive algorithm iterates through all numbers from n to 0,
     * resulting in linear time complexity.
     *
     * @param sc Scanner object for user input
     * @param n  The number of integers to read and print
     */
    private static void reversed_array(Scanner sc, int n) {
        // Base case: If n is 0, return (terminate recursion)
        if (n == 0)
            return;

        // Read the next integer 'm' from the user
        int m = sc.nextInt();

        // Recursive call: Read and print the remaining 'n-1' integers in reverse order
        reversed_array(sc, n - 1);

        // Print the current integer 'm'
        System.out.println(m + " ");
    }
    public static void solution(Scanner sc) {
        int n = sc.nextInt();
        sc.nextLine();
        reversed_array(sc, n);
    }
}
