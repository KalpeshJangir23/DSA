import java.util.Arrays;

public class ic1748 {
    public static void main(String[] args) {
        int[] arr = { 7,7,7,7 };
        int count = 0;
        int k =0;
        int sum =0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    k++;
                    count = arr[i];

                }
            }
        }

        System.out.println(count);
        System.out.println(k);
        System.out.println("");
        if (arr.length>k) {
            
        
        int[] temp = new int[arr.length-k] ;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=count){
                temp[i] = arr[i];
            }
        }
        for (int i = 0; i < temp.length; i++) {
            sum = sum +temp[i];
        }
        System.out.println(sum);
    }
    else{
        System.out.println("0");
    }
        // Arrays.sort(arr);

        // int n = arr.length;
        // if (n==0 || n==1){
        // System.out.println(n);
        // }
        // int[] temp = new int[n];
        // int j = 0;
        // for (int i=0; i<n-1; i++){
        // if (arr[i] != arr[i+1]){
        // temp[j++] = arr[i];
        // }
        // }
        // temp[j++] = arr[n-1];
        // // Changing original array
        // for (int i=0; i<j; i++){
        // arr[i] = temp[i];
        // }
        // System.out.println(j);
        // for (int i = 0; i < j; i++) {
        // System.out.println(temp[i]);
        // }
        // for (int i = 0; i < j; i++) {
        // count = count +arr[i];
        // }
        // System.out.println("[[[[[[[[[[[[[[[[[[[[[]]]]]]]]]]]]]]]]]]]");
        // System.out.println(count);
    }

    // int sum =0;
    // for (int i = 0; i < nums.length; i++) {
    // for (int j = i+1; j < nums.length; j++) {
    // if (nums[i]==nums[j]) {
    // count++;
    // }
    // }
    // }
    // System.out.println(count);
}
