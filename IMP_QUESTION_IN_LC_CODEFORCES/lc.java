package IMP_QUESTION_IN_LC_CODEFORCES;

public class lc {
    public static void main(String[] args) {
        int count = 0;
        String str = "5303914400F9211";
        int index = 11;

        String lastThree = str.substring(index, index+2);
        int value = Integer.parseInt(lastThree);
        if (value > 60 ) {
            count++;
        }
        System.out.println(count);
        for (int i = 0; i < args.length; i++) {
            
        }

    }
}
