import java.util.Arrays;
public class ic977 {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
         int[] square = new int[nums.length];
        for(int i=0 ;i<nums.length;i++){
            square[i] = nums[i]*nums[i];
        }
        Arrays.sort(square);
        for (int i = 0; i < square.length; i++) {
            System.out.println(square[i]);
        }
        int dd =-10;
        int a =-3;
        int c = dd/a;
        System.out.println(c);

    }
}
