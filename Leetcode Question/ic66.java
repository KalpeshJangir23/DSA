import java.util.Arrays;

public class ic66 {
    public static void main(String[] args) {
        int[] digit = { 1, 2, 3 };
        int i, k = 0;
        int j = 0;
        Arrays.sort(digit);
        System.out.println(digit[digit.length-1]);
        for (i = 0; i < digit.length-1; i++) {
            k = 10 * k + digit[i];
            System.out.println(k);
        }
        System.out.println(k);
        k = k + 1;
        System.out.println(k);
        int[] arr = new int[digit.length];
        
        while(k >0) { 
           int d = k % 10;
           arr[arr.length - j -1] = d;
          k = k / 10;
          j++;
        }
        System.out.println("");

        for (j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }

    }
}
