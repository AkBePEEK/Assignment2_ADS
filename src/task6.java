import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), n = sc.nextInt();
        System.out.println(power(a, n));
    }
    public static int power(int base, int power){
        if (power == 1) return base;
        return base*power(base, power - 1);
    }
}
