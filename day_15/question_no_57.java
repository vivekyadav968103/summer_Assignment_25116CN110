package Day_15;

import java.util.Arrays;
import java.util.Scanner;

public class question_no_57 {
    public static void main(String[] args) {

        // to reverse the array element.
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] revArr = new int[n];

        for (int j = 0; j < n; j++) {
            revArr[j] = arr[n - 1 - j];
        }
        System.out.println(Arrays.toString(revArr));
    }
}
