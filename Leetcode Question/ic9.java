import java.util.Scanner;

public class ic9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = x;
        int count = 0;
        while (x > 0) {
            x = x / 10;
            count++;
        }
        System.out.println(count);

        int[] result = new int[count];
        for (int i = 0; i < result.length; i++) {
            while (y > 0) {

                int remainder = y % 10;
                result[i] = remainder;
                System.out.print(result[i] + " ");

                y = y / 10;
                int[] reverse = new int[count]; 
                for (int j = result.length-1; j >0; j--) {
                    reverse[j]=remainder;
                }
                for (int j = 0; j < reverse.length; j++) {
                    System.out.print(reverse[j]+" ");
                }
            }

        }
    }
}
