import java.util.*;


public class fourA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        if(w == 1 || w == 2){
            System.out.println("NO");
            return;
        }
        if(w % 2 == 0){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
