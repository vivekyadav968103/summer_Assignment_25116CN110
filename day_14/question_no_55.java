package Day_14;

import java.util.Scanner;

public class question_no_55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // to find second largest element of array.

        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the array element : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int max1 = 0, max2 = 0;
        if(arr[0] > arr[1]){
            max1 = arr[0];
            max2 = arr[1];
        }
        else{
            max1 = arr[1];
            max2 = arr[0];
        }
        for(int i = 2; i < arr.length; i++){
            if(arr[i] > max1){
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i] > max2){
                max2 = arr[i];
            }
        }
        System.out.println("Second largest element = " + max2);
    }
}
