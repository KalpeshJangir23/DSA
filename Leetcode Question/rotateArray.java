import java.util.Scanner;

public class rotateArray {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6};
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        k = k % nums.length;
        int n = nums.length - 1;
        while (k != 0) {
            int temp = nums[n];
            for (int i = n; i > 0; i--) {
               nums[i] = nums[i - 1];
            }
            nums[0] = temp;
            k--;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

}
