import java.util.Scanner;

public class ic2520 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nums = scanner.nextInt();
        int count = 0;

        while (nums > 0) {

            int k = nums % 10;
            nums = nums / 10;
            count++;

        }


        // if (num1.length>=num2.length) {
        // for (int i = 0; i < num1.length; i++) {
            
        // } 
        // else {
        //     for (int j = 0; j < args.length; j++) {
                
        //     }
               
    
        int[] kalpesh = new int[count];
        for (int i = 0; i < kalpesh.length; i++) {

            while (nums > 0) {

                int k = nums % 10;
                nums = nums / 10;
                kalpesh[i] = k;

            }
        }
        System.out.println("fucking array is here");
        for (int i = 0; i < kalpesh.length; i++) {
            System.out.println(kalpesh[i]);
        }

        scanner.close();

    }
}
