import java.util.Scanner;


// leetcode question 01
public class lc01 {
    public static void main(String[] args) {
        int i;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the size of array");
            int size = scanner.nextInt();
            int[] nums = new int[size];
            //System.out.println("Size of the arrays is " + nums.length);

            System.out.println("Enter the value in array");
            for (i = 0; i < nums.length; i++) {
                int values =scanner.nextInt();
                nums[i] = values;
            }
            System.out.println("enter the Trageted value");
            int target = scanner.nextInt();

            for (int j = 0; j < nums.length; j++) {
                if(j == nums.length){
                    
                }
                else if (nums[j] + nums[j+1] == target) {
                    System.out.println(j + " "+ (j+1));
                }
            }
            scanner.close();
        }
       
    }
}
