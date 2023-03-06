import java.util.Scanner;

public class Ic342 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("enter no");
        n  = scanner.nextInt();
        if (Math.pow(-2, 31) <= n) {
            
        
        if (n%4==0 || n<=4 && n > 0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }}
        scanner.close();
       
    }
}
