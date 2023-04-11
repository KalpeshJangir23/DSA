package StriverQuestion.day02;

import java.util.ArrayList;

public class LC1389 {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 3, 4 };
        int[] index = { 0, 1, 4, 3, 2 };
        int[] target = new int[nums.length];

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            arr.add(index[i], nums[i]);

        }
        for (int i = 0; i < arr.size(); i++) {
            target[i] = arr.get(i);
        }
        System.out.println(" ");
        for (int i = 0; i < target.length; i++) {
            System.out.println(target[i]);
        }

    }
}
