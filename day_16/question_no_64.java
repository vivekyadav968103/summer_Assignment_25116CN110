package Day_16;

import java.util.Scanner;

public class question_no_64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // to remove duplicate element.

        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++){

            boolean duplicate = false;
            for (int j = 0; j < i; j++) {
                if(arr[i] == arr[j]){
                    duplicate = true;
                }
            }
            if(!duplicate)
                System.out.print(arr[i] + " ");
        }
    }
}
