package Day_20;

import java.util.Arrays;
import java.util.Scanner;

public class question_no_77 {
    public static void main(String[] args) {

        // to Multiply the matrix A and matrix B.

        Scanner in = new Scanner(System.in);

        // MATRIX A

        System.out.print("Enter the no row of matrix A : ");
        int row1 = in.nextInt();

        System.out.print("Enter the no column of matrix A : ");
        int col1 = in.nextInt();

        int[][] matrixA = new int[row1][col1];

        System.out.print("Enter the element of the matrix A : ");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                matrixA[i][j] = in.nextInt();
            }
        }

        // MATRIX B

        System.out.print("Enter the no row of matrix B : ");
        int row2 = in.nextInt();

        System.out.print("Enter the no column of matrix B: ");
        int col2 = in.nextInt();

        int[][] matrixB = new int[row2][col2];

        System.out.print("Enter the element of the matrix B : ");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                matrixB[i][j] = in.nextInt();
            }
        }
        int[][] multAB = new int[row1][col2];

        if(col1 != row2)
            System.out.println("!! Multiplication is not possible !!");
        else{
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    for (int k = 0; k < col1; k++) {
                        multAB[i][j] += matrixA[i][k] * matrixB[k][j];
                    }
                }
            } 
            
        }
        for (int i = 0; i < row1; i++) {
            System.out.println(Arrays.toString(multAB[i]));
        }
    }
}
