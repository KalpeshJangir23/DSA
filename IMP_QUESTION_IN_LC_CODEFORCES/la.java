package IMP_QUESTION_IN_LC_CODEFORCES;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class la {
    public static void main(String[] args) {
        int[] arr = { 2,3,4,7,11 };
        int k = 5;

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = 1; i <= 1000; i++) {
            list1.add(i);
        }

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            list2.add(arr[i]);
        }

        for (int i = 0; i < list2.size(); i++) {
            list1.remove(Integer.valueOf(list2.get(i)));
        }

        int y = list1.get(k - 1);
        System.out.println(y);

    }
}