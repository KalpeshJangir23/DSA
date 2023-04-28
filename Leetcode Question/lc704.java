public class lc704 {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        int start = 0;
    
        int val = 0;
        while (start<nums.length) {
           
            if(nums[start] == target){
                val = start;
                start++;         
                break;       
            }
            else {
                val = -1;
                

            }

        }
        System.out.println(val); 
    }
}
