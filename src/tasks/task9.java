package tasks;

import java.util.Scanner;

public class task9 {
    public static void solution(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();

        int solution = binomial_coefficient(k, n);
        System.out.println(solution);
    }
    public static int binomial_coefficient(int k, int n){
        if (k == n || k == 0) return 1;
        return  binomial_coefficient(k - 1, n -1) + binomial_coefficient(k, n - 1);
    }
}
