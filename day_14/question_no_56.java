package Day_14;

import java.util.Scanner;

public class question_no_56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // to find duplicate element in array.

        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the array element : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        System.out.print("Duplicate element are : ");
        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < j; k++) {
                if(arr[j] == arr[k]){
                    System.out.println(arr[j]);
                    count++;
                }
            }
        }
        if(count == 0)
            System.out.println("No duplicate element found");

    }
}
