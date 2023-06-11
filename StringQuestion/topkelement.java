
package StringQuestion;

import java.util.*;

/**
 * topkelement
 */
public class topkelement {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 2, 3 };
        int k = 2;
        ArrayList<Integer> arr = new ArrayList<Integer>();

        
        int count = 0;
        for (int l = 0; l < nums.length; l++) {
            for (int i = 0; i < nums.length; i++) {
                
            
            while (i < nums.length) {
                if (nums[l] == nums[i]) {
                    count++;
                    
                }
                if (count >= k) {
                    arr.add(nums[l]);
                }
            

            }
        }
            
        }
        System.out.println(arr);

    }
}
