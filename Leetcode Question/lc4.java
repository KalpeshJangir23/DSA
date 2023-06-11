import java.util.ArrayList;
import java.util.Collections;

public class lc4 {

    public static void main(String[] args) {
        int[] nums1 = {1};
        int[] nums2 = {2};
        ArrayList<Integer> al = new ArrayList<Integer>();

        for (int i = 0; i < nums1.length; i++) {
            al.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            al.add(nums2[i]);
        }
        Collections.sort(al);

        int n = al.size();
        double[] result = new double[n];
        for (int i = 0; i < n; i++) {
            result[i] = al.get(i);
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + "  ");
        }
        double median = 0.0;

        if (n % 2 == 0) {
            median = (result[n/2 - 1] + result[n/2]) / 2.0;
        } else {
            median = result[n/2];
        }
        System.out.println(" ");
        System.out.println(n);
        System.out.println(" ");
        System.out.println(median);
    }

}
