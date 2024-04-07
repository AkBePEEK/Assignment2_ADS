import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }
    public static int fibonacci(int n){
        if (n < 2) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}