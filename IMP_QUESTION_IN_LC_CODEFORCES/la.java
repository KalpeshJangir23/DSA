package IMP_QUESTION_IN_LC_CODEFORCES;

import java.util.Scanner;

/**
 * la
 */
public class la {

    static int addtwonumber(int a,int b){
        return a + b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(addtwonumber(a, b));

        if (a>b) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}