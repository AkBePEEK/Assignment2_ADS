package tasks;
import java.util.Scanner;

public class task8 {
    public static void solution(Scanner sc) {
        String line = sc.nextLine();
        boolean ans = is_only_digits(line,0);
        System.out.println(ans ? "Yes" : "No");
    }
    public static boolean is_only_digits(String inp, int index){
        if (index >= inp.length()) return true;
        int range = inp.charAt(index);
        return range >= 48 && range <= 57 && is_only_digits(inp, index + 1);
    }
}
