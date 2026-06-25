package Day_20;

import java.util.Scanner;

public class question_no_80 {
    public static void main(String[] args) {

        // to Find column-wise sum of the matrix. 


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

        int[] colSum = new int[col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                colSum[i] += matrixA[j][i];
            }
        }
        System.out.println("Sum of columns are : ");
        for (int i = 0; i < col; i++) {
            System.out.println("Column" + (i+1) + " = " + colSum[i]);
        } 
    }
}
