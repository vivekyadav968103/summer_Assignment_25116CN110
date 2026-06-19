package Day_13;

import java.util.Scanner;

public class question_no_50 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the array element : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int k = 0; k < arr.length; k++){
            sum += arr[k];
        }
        int avg = sum / arr.length;
        System.out.println("Sum of the element = " +  sum);
        System.out.println("Average of the element = " +  avg);
    }
}
