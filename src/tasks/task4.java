package tasks;

import java.util.Scanner;

public class task4 {
    public static void solution(Scanner sc) {
        int n = sc.nextInt();
        System.out.println(factorial(n, n));
    }
    public static int factorial(int n, int ans){
        if (n == 1) return ans;
        return factorial(n - 1,ans * (n-1));
    }
}