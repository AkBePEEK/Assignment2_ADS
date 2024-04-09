package tasks;
import java.util.Scanner;

public class task8 {
    public static void solution(Scanner sc) {
        String line = sc.nextLine();
        boolean ans = is_only_digits(line,0);
        System.out.println(ans ? "Yes" : "No");
    }
    /**
     * This method checks if the given string consists only of digits.
     * It uses recursive approach.
     * Time complexity: O(n), where 'n' is the length of the input string.
     * The recursive algorithm iterates through each element of the string,
     * resulting in linear time complexity.
     *
     * @param inp   The input string to check
     * @param index The current index being processed
     * @return true if the string consists only of digits, false otherwise
     */
    public static boolean is_only_digits(String inp, int index) {
        // Base case: If the current index is beyond the length of the string, return true
        if (index >= inp.length())
            return true;

        // Get the ASCII value of the character at the current index
        int range = inp.charAt(index);

        // Check if the ASCII value falls within the range of digits ('0' to '9')
        // If so, recursively check the next character
        return range >= 48 && range <= 57 && is_only_digits(inp, index + 1);
    }
}
