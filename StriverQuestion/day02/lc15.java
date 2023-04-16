package StriverQuestion.day02;

public class lc15 {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if (i != j && i != k && j != k && nums[i] + nums[j] + nums[k] == 0) {
                        System.out.println(nums[i] + " " + nums[j] + " " + nums[k]);
                    }
                }
            }
        }
    }
}
