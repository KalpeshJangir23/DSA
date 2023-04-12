package StriverQuestion.day02;

import java.util.Arrays;

public class lc11 {
    public static void main(String[] args) {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int[] ans = new int[height.length];
        int start = 0;
        int end = height.length - 1;
        while (end > start) {
            for (int i = 0; i < ans.length; i++) {
                if (height[end] >= height[start]) {
                    ans[i] = height[start] * (end - start);
                    start++;
                } else {
                    ans[i] = height[end] * (end - start);
                    end--;
                }
            }
        }
        Arrays.sort(ans);
        System.out.println(ans[ans.length-1]);
    }
}
