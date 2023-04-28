package StriverQuestion;
import java.util.Scanner;

public class q1537 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            long s = 0;
            for (int p = 0; p < n; p++) {
                long x = scanner.nextLong();
                s += x;
            }
            System.out.println((s >= n) ? (s - n) : 1);
        }
    }
}
