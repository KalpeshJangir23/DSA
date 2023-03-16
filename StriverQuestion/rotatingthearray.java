package StriverQuestion;

import java.util.Arrays;

public class rotatingthearray {
    public static void main(String[] args) {
        Boolean value= false;
        int[] nums = {3,4,5,1,10}; 
        int[] copy = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            copy[i] = nums[i];
        }
        int y  = nums.length%2;
        System.out.println(y);
        Arrays.sort(copy);
        int x = 0;
        if(nums.length%2 != 0){
            x = (nums.length+1)/2;
            for (int i = 0; i < copy.length; i++) {
                if (nums[i] == copy[(i+(x-1)) % nums.length]) {
                    value = true;
                }
                else{
                    System.out.println(value);
                }
            }
        }
        System.out.println(value);
    }
}
