package IMP_QUESTION_IN_LC_CODEFORCES;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class la {
    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        HashSet<Integer> Hset = new HashSet<Integer>(list);
        int i = 0;
        int j = 0;
        int k = 0;

        for ( i = 0; i < nums.length; i++) {
            for ( j = 0; j < nums.length; j++) {
                for ( k = 0; k < nums.length; k++) {
                    if (i != j && i != k && j != k && nums[i] + nums[j] + nums[k] == 0) {
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        list2.addAll(i, list);
                    }
                }
            }
            list2.addAll(i, list);

            for (int j2 = 0; j2 < nums.length; j2++) {
                System.out.print(list2.get(j2) + " ");
            }
        }
    }
}