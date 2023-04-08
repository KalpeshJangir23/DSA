package StriverQuestion.day01;

import java.util.Scanner;

public class setMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter matrix size");
        int k = 0;
        int a = 0;
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[] x1 = new int[k];
        int[] x2 = new int[a];
        System.out.println("enter date");
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("matrix input has taken");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    k = i;
                    a = j;
                    

                }
            }
        }
        System.out.println(k + " " + a);
        
        for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
        matrix[k][j] = 0;
        matrix[i][a] = 0;
        }
        }
        System.out.println("print the new matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();

    }
}
