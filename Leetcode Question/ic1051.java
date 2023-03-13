import java.util.Arrays;

public class ic1051 {
    public static void main(String[] args) {
        int[] nums = {1,1,4,2,1,3};
        int[] expected = new int[nums.length];
        int count = 0;
        for (int i = 0; i < expected.length; i++) {
           expected[i] = nums[i] ;
        }
        for (int i = 0; i < expected.length; i++) {
            System.out.print(expected[i]);
        }
        Arrays.sort(expected);
        System.out.println("");
        for (int i = 0; i < expected.length; i++) {
            System.out.print(expected[i]);
        }
        for (int i = 0; i < expected.length; i++) {
            if (nums[i]!=expected[i]) {
                count++;
                
            }
            
        }
        System.out.println("[[[]]]");
        System.out.println(count);


    }
}
