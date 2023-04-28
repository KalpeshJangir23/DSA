package StriverQuestion;
import java.util.Scanner;

public class A1553 {
    public static void main(String[] args) {
        int num;
        

        Scanner s = new Scanner(System.in);

        int notestCase = s.nextInt();
        while (notestCase != 0) {
            int count = 0;
            num = s.nextInt();
            int mod = num % 10;

            if (mod < 9) {
                count = num / 10;
            } else {
                count = (num / 10) + 1;
            }
            System.out.println(count);
            notestCase--;
        }
    }
}
