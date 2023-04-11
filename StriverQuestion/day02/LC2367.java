package StriverQuestion.day02;

public class LC2367 {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 4, 6, 7, 10 };
        int diff = 3;
        int count = 0;
        

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[j]-nums[i]==diff && nums[k] - nums[j] == diff){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
        // if (A.length < 3) {

        // }

        // for (int j = 1; j < A.length - 1; j++)
        // {

        // int i = j - 1, k = j + 1;

        // while (i >= 0 && k < A.length)
        // {

        // if (A[i] + A[k] == 2 * A[j])
        // {
        // if () {

        // }

        // k++; i--;
        // }
        // else if (A[i] + A[k] < 2 * A[j]) {
        // k++;
        // }
        // else {
        // i--;
        // }
        // }
        // }
        // }


            }
}