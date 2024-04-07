import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float ans = 0;
        for (int i=0; i<n; i++){
            int num = sc.nextInt();
            ans += num;
        }
        System.out.println(ans/4);
    }
}
