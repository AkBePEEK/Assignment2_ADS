package tasks;

import java.util.Scanner;

public class task1 {
    public static void solution(Scanner sc){
        int n = sc.nextInt(), b = sc.nextInt();
        for (int i=0; i<n-1; i++){
            int m = sc.nextInt();
                if (b>m) b = m;
        }
        System.out.println(b);
    }
}