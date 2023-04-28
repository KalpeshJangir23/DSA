package StriverQuestion;
import java.util.Scanner;

/**
 * A_Matching
 */
public class A_Matching {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            String template = scanner.next();
            int count = countMatchingIntegers(template);
            System.out.println(count);
        }
    }

    public static int countMatchingIntegers(String template) {
        return generateCombinations(0, new char[template.length()], template);
    }

    private static int generateCombinations(int i, char[] combination, String template) {
        if (i == combination.length) {
            String str = new String(combination);
            int num = Integer.parseInt(str);
            if (num > 0 && Integer.toString(num).equals(str)) {
                return 1;
            } else {
                return 0;
            }
        }
        int count = 0;
        if (template.charAt(i) == '?') {
            for (char digit = '1'; digit <= '9'; digit++) {
                combination[i] = digit;
                count += generateCombinations(i+1, combination, template);
            }
        } else {
            combination[i] = template.charAt(i);
            count += generateCombinations(i+1, combination, template);
        }
        return count;
    }
}