import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), b = sc.nextInt();
        for (int i=0; i<n-1; i++){
            int m = sc.nextInt();
                if (b>m) b = m;
        }
        System.out.println(b);
    }
}