package Day_15;

import java.util.Arrays;
import java.util.Scanner;

public class question_no_60 {
    public static void main(String[] args) {

        //  to move zeroes of the array to end.
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int index = 0;
        for (int j = 0; j < n; j++) {
            if(arr[j] != 0){
                arr[index] = arr[j];
                index++;
            }
        }
        while(index < n){
            arr[index] = 0;
            index++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
