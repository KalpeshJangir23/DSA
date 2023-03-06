public class ic2529 {
    public static void main(String[] args) {
        int[] nums ={0};
        int count = 0;  
    for (int i = 0; i < nums.length; i++)
        if (nums[i] != 0)
            nums[count++] = nums[i]; 
    while (count < nums.length)
        nums[count++] = 0;  
      
    }
}
