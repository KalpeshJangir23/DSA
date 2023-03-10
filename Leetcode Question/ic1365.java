import java.util.*;
public class ic1365 {
    public static void main(String[] args) {
        int count = 0;
        int[] nums = { 8, 1, 2, 2, 3 };
        int[] result = new int[nums.length];
        Arrays.sort(nums);
         for (int i = 0; i < result.length; i++) {
            System.out.println(nums[i]);
         }

         System.out.println("[[]]");
         result[0] =0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] ) {
                  result[j] = 1;  
                }
              
                else  if (nums[j] > nums[i]) {
                    count++;
                    result[j] = count;

                } else {
                    result[j] = 0;
                }
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
