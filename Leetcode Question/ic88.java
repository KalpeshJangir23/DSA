import java.util.Scanner;
import java.util.Arrays;

public class ic88 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[] num1 = {1,2,3,0,0,0};
        int[] sums  = new int[m+n];
        int[] nums2 = {2,5,6};
        System.out.println("merge array are");
        for (int i = 0; i < m; i++) {
            sums[i] = num1[i];
        }
        for (int i = 0; i < n; i++) {
            sums[m+i] = nums2[i];
        }
        for (int i = 0; i < sums.length; i++) {
            System.out.println(sums[i]);
        }
        Arrays.sort(sums);
        System.out.println(" hehheheh");
        for (int i = 0; i < sums.length; i++) {
            System.out.println(sums[i]);
        }
        scanner.close();
    }
 }
// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         int c = m + n;
//         int temp =0;
//         int[] sums = new int[c];
//          for (int i = 0; i < m; i++) {
//             sums[i] = nums1[i];
//         }
//         for (int i = 0; i < n; i++) {
//             sums[m+i] = nums2[i];
//          }
//         // for (int i = 0; i <sums.length; i++) {     
//         //   for (int j = i+1; j <sums.length; j++) {     
//         //       if(sums[i] >sums[j]) {      
//         //          temp = sums[i];    
//         //          sums[i] = sums[j];    
//         //          sums[j] = temp;    
//         //        }     
//         //     }     
//         // } 
//         Arrays.sort(sums);
//     }
// }






// int c = m + n;
//         int temp =0;
//         int[] sums = new int[c];
//          for (int i = 0; i < m-1; i++) {
//             sums[i] = nums1[i];
//         }
//         for (int i = 0; i < n-1; i++) {
//             if(m==0){
//                 sums[i] = nums2[i];
//             }else{
//             sums[m+i] = nums2[i];}
//          }
//         for (int i = 0; i <sums.length-1; i++) {     
//           for (int j = i+1; j <sums.length-1; j++) {     
//               if(sums[i] >sums[j]) {      
//                  temp = sums[i];    
//                  sums[i] = sums[j];    
//                  sums[j] = temp;    
//                }     
//             }     
//         } 