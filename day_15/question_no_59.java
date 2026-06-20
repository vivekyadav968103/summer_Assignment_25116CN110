package Day_15;

import java.util.Arrays;
import java.util.Scanner;

public class question_no_59 {
   public static void main(String[] args) {

        // to rotate the array element right.
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int temp = arr[n-1];
        for (int j = n - 1; j > 0; j--) {
            arr[j] = arr[j - 1];
        }
        arr[0] = temp;

        System.out.println(Arrays.toString(arr));
    } 
}
