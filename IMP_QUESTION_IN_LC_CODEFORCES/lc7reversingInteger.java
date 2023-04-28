package IMP_QUESTION_IN_LC_CODEFORCES;

import java.util.Scanner;
import java.util.*;

public class lc7reversingInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int i = 0;
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            x = Math.abs(x);
        }
        String lengthofx = Integer.toString(x);
        Stack<Integer> stack = new Stack<Integer>();
        while (i < lengthofx.length()) {
            int rem = x % 10;
            stack.push(rem);
            x = x / 10;
            i++;
        }
        long reversedNum = 0; // Use long to avoid integer overflow
        int multiplier = 1;
        while (!stack.isEmpty()) {
            reversedNum += stack.pop() * multiplier;
            multiplier *= 10;
        }
        if (isNegative) {
            reversedNum *= -1;
        }

        if (reversedNum > Integer.MAX_VALUE || reversedNum < Integer.MIN_VALUE) {
            reversedNum = 0;
        }
        System.out.println(reversedNum);
    }
}
// String string_number = Integer.toString(number);
