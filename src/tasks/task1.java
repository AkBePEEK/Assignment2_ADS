package tasks;

import java.util.Scanner;

import java.util.Scanner;

public class task1 {
    /**
     * This method finds the minimum value among a series of integers entered by the user.
     * Time complexity: O(n), where n is the input number.
     * @param sc Scanner object for user input
     */
    public static void solution(Scanner sc) {
        // Read the total number of elements 'n' and the initial value of 'b' from input
        int n = sc.nextInt(); // Total number of elements
        int b = sc.nextInt(); // Initial value of 'b'

        // Loop through the elements, starting from the second element (index 0-based)
        for (int i = 0; i < n - 1; i++) {
            // Read the next element 'm' from input
            int m = sc.nextInt();

            // Check if the current element 'm' is less than the current minimum 'b'
            // If so, update the minimum value 'b' to the value of 'm'
            if (b > m)
                b = m;
        }

        // Print the final minimum value 'b'
        System.out.println(b);
    }
}