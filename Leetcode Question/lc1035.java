import java.util.*;
public class lc1035 {
    public static void main(String[] args) {
        int[] nums1 = {1,3,7,1,7,5};
        int[] nums2 = {1,9,2,5,1};
        Set<Integer> hash_set = new HashSet<Integer>();
        Set<Integer> hash_set1 = new HashSet<Integer>();
        for (int i = 0; i < nums2.length; i++) {
            hash_set1.add(nums2[i]);
        }
        for (int i = 0; i < nums1.length; i++) {
            hash_set.add(nums1[i]);
        }
        hash_set.retainAll(hash_set1);
        int result = hash_set.size();
    }
}
