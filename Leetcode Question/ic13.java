import java.util.Scanner;

/**
 * ic13
 */
public class ic13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char[] ch = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }
  
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i] + " ");

        }
    }
}