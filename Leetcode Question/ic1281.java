import java.util.Scanner;

public class ic1281 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int product = 1;

        while (n != 0) {
            product = product * (n % 10);
            n = n / 10;
        }
        System.out.println(product);
        int sum = 0;
         
        while (n != 0)
        {
            sum = sum + n % 10;
            n = n/10;
        }
        System.out.println(sum);
        
        scanner.close();
    }
}
