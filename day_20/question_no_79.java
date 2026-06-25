package Day_20;

import java.util.Scanner;

public class question_no_79 {
    public static void main(String[] args) {

        // to Find row-wise sum of the matrix. 

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the no of rows : ");
        int row = in.nextInt();

        System.out.print("Enter the no of column : ");
        int col = in.nextInt();

        int[][] matrixA = new int[row][col];

        System.out.print("Enter the element : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrixA[i][j] = in.nextInt();
            }
        }

        int[] rowSum = new int[row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                rowSum[i] += matrixA[i][j];
            }
        }
        System.out.println("Sum of rows are : ");
        for (int i = 0; i < row; i++) {
            System.out.println("Row" + (i+1) + " = " + rowSum[i]);
        } 
    }
}
