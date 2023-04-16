import java.util.Scanner;

public class A1537 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int notestCase = scanner.nextInt();
        for (int i = 0; i < notestCase; i++) {
            int length = scanner.nextInt();
            Double[] arr = new Double[length];
            double sum = 0;
            for (int j = 0; j < length; j++) {
                arr[j] = scanner.nextDouble();
            }
            for (int j = 0; j < arr.length; j++) {
                sum = sum + arr[j];
            }
            Double division = sum / length;

            if (sum < 0) {
                System.out.println("1");
            } else {
                count = (int) (sum - length);
                System.out.println(count);
            }
            
            
        }

    }
}
