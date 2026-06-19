package Day_13;

import java.util.Scanner;

public class question_no_49 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the array element : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Element of the array : ");
        for(int k = 0; k < arr.length; k++){
            System.out.print(" " + arr[k]);
        }
        //System.out.println(Arrays.toString(arr));
        // another method to print the element of array.
    }
}
