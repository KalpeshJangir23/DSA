public class lc2535 {
    public static void main(String[] args) {
        int[] nums = { 1, 15, 6, 3 };
        int count =0;
        int sum = 0;
        int k;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println(sum);
        int sum2 = 0;
        for (int i = 0; i < nums.length; i++) {
             if(nums[i] > 9) {
                k = nums[i]%10;
                count++;
                nums[i] = nums[i]/10;
            }
            else{sum2 =0;}
        }
        int[] nums2 = new int[count];
        for (int i = 0; i < nums.length; i++) {
            int j = 0;
            if (nums[i] > 9) {
                k = nums[i]%10;
                count++;
                nums2[j] = k;
                j++;
                nums[i] = nums[i]/10;
                System.out.println(" ");
                System.out.println(nums[i]);
            }else{
                j=0;
            }
        }
        for (int i = 0; i < nums2.length;i++) {
            System.out.println(nums2[i]);
        }
    }
}
