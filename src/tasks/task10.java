package tasks;

import java.util.Scanner;

public class task10 {
    public static void solution(Scanner sc) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a, b));
    }
    public static int gcd(int a, int b){
        if (b == 0) return a;
        return gcd(b, a%b);
    }
}
