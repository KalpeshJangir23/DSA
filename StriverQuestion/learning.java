package StriverQuestion;
import java.util.Arrays;

public class learning {
    public static void main(String[] args) {
        int[] arr = {3 ,2 ,7 ,6};
        int[] x = new int[arr.length]; 
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int val = i % 2;
            x[i] = val;
            System.out.print(val + "  ");
            int val2 = arr[i] % 2;
            arr[i] = val2;
            System.out.print(val2+ "  ");
            System.out.println("");
            Arrays.sort(x);
            Arrays.sort(arr);
            if (arr[i]== x[i]) {
                count = 0;
            }
            else{
                count++;
            }
        
        }
        System.out.println(count);

        System.out.println();
        System.out.println();

      
    }
}
