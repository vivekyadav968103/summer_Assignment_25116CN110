package Day_20;

import java.util.Scanner;

public class question_no_78 {
    public static void main(String[] args) {

        //  to Check symmetric matrix.

        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the square matrix of order n : ");
        int n = in.nextInt();

        int[][] matrixA = new int[n][n];

        System.out.print("Enter the element : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrixA[i][j] = in.nextInt();
            }
        }
        boolean symmetric = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
               if(matrixA[i][j] != matrixA[j][i])
                symmetric = false;
            }
        }
        if(symmetric)
            System.out.println("Matrix A is symmetric matrix");
        else
            System.out.println("Matrix A is not symmetric matrix");
    }
}
