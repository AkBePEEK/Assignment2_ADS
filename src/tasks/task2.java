package tasks;

import java.util.Scanner;

public class task2 {
    /**
     * This method calculates the average of 'n' numbers entered by the user.
     * Time complexity: O(n), where n is the input number.
     * The loop runs from 0 to the given number,
     * resulting in linear time complexity.
     *
     * @param sc Scanner object for user input
     */
    public static void solution(Scanner sc) {
        // Read the total number of elements 'n' from input
        int n = sc.nextInt(); // Total number of elements

        // Initialize a variable to store the sum of all numbers
        float ans = 0;

        // Loop through 'n' numbers entered by the user
        for (int i = 0; i < n; i++) {
            // Read the next number from input
            int num = sc.nextInt();

            // Add the number to the sum
            ans += num;
        }

        // Calculate the average by dividing the sum by the total number of elements
        float average = ans / n;

        // Print the average
        System.out.println(average);
    }
}