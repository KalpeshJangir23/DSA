public class ic169 {
    public static void main(String[] args) {
        int[] nums = { 1 };
        
        System.out.println(nums.length);
        int x =0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i]==nums[j]){
                    x = nums[i];
                }
                
            }
        }
        System.out.println(x);
    }

}
