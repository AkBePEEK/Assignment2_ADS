package tasks;

import java.util.Scanner;

public class task7 {
    private static void reversed_array(Scanner sc, int n){
        if (n==0) return;
        int m = sc.nextInt();
        reversed_array(sc, n - 1);
        System.out.println(m + " ");
    }
    public static void solution(Scanner sc) {
        int n = sc.nextInt();
        sc.nextLine();
        reversed_array(sc, n);
    }
}
