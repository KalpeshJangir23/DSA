package StriverQuestion;

import java.util.Arrays;

public class findingthelargestelementinanarray {
    public static void main(String[] args) {
        int[] nums = {2,5,189,3,0};
        int[] copy = new int[nums.length];
        for (int i = 0; i < copy.length; i++) {
            copy[i] = nums[i];
        }
        Arrays.sort(nums);
        int k =nums.length;
        System.out.println(nums[k-1]);
        System.out.println("  ");
        // Agar index value bhi pooch le
        for (int i = 0; i < copy.length; i++) {
            if (copy[i]==nums[k-1]) {
                System.out.println(i);
            }
        }

        
     }
}
