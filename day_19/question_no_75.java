package Day_19;

import java.util.Scanner;

public class question_no_75 {
    public static void main(String[] args) {

        // to Transpose matrix. 
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the no of rows : ");
        int row = in.nextInt();

        System.out.print("Enter the no of column : ");
        int cols = in.nextInt();

        int array[][] = new int[row][cols];

        System.out.println("Enter the element of the matrix ");
        for (int i = 0; i < row; i++){
            for (int j = 0; j < cols; j++) {
                array[i][j] = in.nextInt();
            }
        }

        int transpose[][] = new int[cols][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = array[i][j];
            }
        }

        System.out.println("Transpose of the matrix");

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
