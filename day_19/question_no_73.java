package Day_19;

import java.util.Scanner;

public class question_no_73 {
    public static void main(String[] args) {

        //to Add matrices.
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the no of rows of first matrix : ");
        int row1 = in.nextInt();

        System.out.print("Enter the no of column of first matrix : ");
        int cols1 = in.nextInt();

        int array1[][] = new int[row1][cols1];

        System.out.println("Enter the element of the of first matrix ");
        for (int i = 0; i < row1; i++){
            for (int j = 0; j < cols1; j++) {
                array1[i][j] = in.nextInt();
            }
        }

        System.out.print("Enter the no of rows of second matrix : ");
        int row2 = in.nextInt();

        System.out.print("Enter the no of column of second matrix : ");
        int cols2 = in.nextInt();

        int array2[][] = new int[row2][cols2];

        System.out.println("Enter the element of the of second matrix ");
        for (int i = 0; i < row2; i++){
            for (int j = 0; j < cols2; j++) {
                array2[i][j] = in.nextInt();
            }
        }
        int sum[][] = new int[row1][cols1];

        if(row1 != row2 && cols1 != cols2){
            System.out.println("!! Additaion of the matrices is not possible !!");
        }
        else{
            System.out.println("sum of the matrices is..");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < cols1; j++) {
                    sum[i][j] = array1[i][j] + array2[i][j];
                    System.out.print(sum[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
