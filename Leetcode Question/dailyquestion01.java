public class dailyquestion01 {
    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "pq";
        int l1 = word1.length();
        int l2 = word2.length();
        int fl = l1 + l2;

        char[] arr1 = new char[l1];
        char[] arr2 = new char[l2];
        char[] arrf = new char[fl];

        for (int i = 0; i < l1; i++) {
            arr1[i] = word1.charAt(i);
        }
        for (int i = 0; i < l2; i++) {
            arr2[i] = word2.charAt(i);
        }

        // for (int i = 0; i < fl-1; i++) {
        //     arrf[i] = (char) (arr1[i] );
        // }

        String str = new String(arr1);
        System.out.println(str);
    }
}
