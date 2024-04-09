package tasks;

import java.util.Scanner;
import static java.lang.Math.sqrt;

public class task3 {
    public static void solution(Scanner sc) {
        int n = sc.nextInt();
        System.out.println(prime(n));
    }
    public static String prime(int n){
        for (int i=2;i<sqrt(n); i++){
            if (n % i == 0) return "Composite";
        }
        return "Prime";
    }
}