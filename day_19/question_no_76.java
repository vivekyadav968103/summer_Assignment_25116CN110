package Day_19;

import java.util.Scanner;

public class question_no_76 {
    public static void main(String[] args) {

        // to Find diagonal sum. 
        
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
        int sum = 0;
        if (row != cols) {
            System.out.println("Diagonal sum can only be calculated for a square matrix.");
        }
        else{
            for (int i = 0; i < row; i++) {
                sum += array[i][i];
            }
            System.out.print("Sum of digonal element : " + sum);
        }
        
    }
}
