import java.util.Scanner;

/**
 * ic204
 */
public class ic204 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        int flag = 0;

        int j = 0;

        for (int i = 0; i <= n; i++) {
            int m = i / 2;
            if (n <= 0 || n == 1) {
                System.out.println("0");
            } else {
                for (j = 2; j <= m; j++) {
                    if (i % j == 0) {
                        
                        flag = 1;
                        break;
                    }
                    
                }
                if (flag == 0) {
                    count++;
                }
            }
        }
        System.out.println("the count value is equal to");
        System.out.println(count);
        scanner.close();

    }
 }
// public int countPrimes(int n) {
//     int count = 0;
//      int flag = 0;

//      int j = 0;

//      for (int i = 0; i <= n; i++) {
//          int m = i / 2;
//          if (n <= 0 || n == 1) {
//              return 0;
//          } 
//           else {
//              for (j = 2; j <= m; j++) {
//                  if(m>1){
//                  if (i % j == 0) {
                     
//                      flag = 1;
//                      break;
//                  }}else return 0;
//              }
//              if (flag == 0) {
//                  count++;
//              }
//          }
//      }

//      return count;