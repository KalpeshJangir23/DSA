public class lc238 {

    public static void main(String[] args) {
        int[] nums = { -1, 1, 0, -3, 3 };
        int result[] = new int[nums.length];

        int p = 1;

        for (int i = 0; i < nums.length; i++) {
            result[i] = p;
            p = p * nums[i];
        }
        p = 1;
        System.out.println("       ");
        for (int i = nums.length - 1; i >= 0; i--) {

            result[i] = result[i] * p;
            p = p * nums[i];

        }
        
        // return result;

    }
}
