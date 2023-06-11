package StringQuestion;

public class palindrome {
    public static void main(String[] args) {
        String s = " ";

        s = s.replaceAll("[^a-zA-Z]", ""); 
        s = s.toLowerCase();
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        System.out.println(arr);
        boolean isPalindrome = true;
        int i = 0;
        int j = arr.length-1;
        while (j > i) {
            if (arr[i] != arr[j]) {
                isPalindrome = false;  // Not a palindrome
                break;
            }
            i++;
            j--;
        }
        System.out.println(isPalindrome);
        //System.out.println(arr);
    }
}
