package tasks;

import java.util.Scanner;

public class task6 {
    public static void solution(Scanner sc) {
        int a = sc.nextInt(), n = sc.nextInt();
        System.out.println(power(a, n));
    }
    public static int power(int base, int power){
        if (power == 1) return base;
        return base*power(base, power - 1);
    }
}
