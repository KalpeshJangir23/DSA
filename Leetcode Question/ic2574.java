import org.w3c.dom.ls.LSException;

public class ic2574 {
    public static void main(String[] args) {
        int[] nums = { 10, 4, 8, 3 };
        int[] leftSum = new int[nums.length]; 
        int[] rightSum = new int[nums.length]; 
        int[] answer = new int[nums.length];
        leftSum[0] = 0;
        rightSum[nums.length - 1] = 0;
        for(int i = 0 ; i < nums.length - 1 ; i++)
        {
            leftSum[i + 1] = leftSum[i] + nums[i];
        }
        for(int i = nums.length - 1 ; i > 0 ; i--)
        {
            rightSum[i - 1] = rightSum[i] + nums[i]; 
        }
        for(int i = 0 ; i < nums.length ; i++)
        {
            answer[i] = (int)Math.abs(leftSum[i] - rightSum[i]);
        }
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}
