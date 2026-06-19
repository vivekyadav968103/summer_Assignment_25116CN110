package Day_13;

import java.util.Scanner;

public class question_no_51 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the array element : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int j = 0; j < arr.length; j++){
            if(arr[j] > max){
                max = arr[j];
            }
        }
        System.out.println("Largest element of the array = " + max);

        int min = arr[0];
        for(int k = 0; k < arr.length; k++){
            if(arr[k] < min){
                min = arr[k];
            }
        }
        System.out.println("Smallest element of the array = " + min);
    }
}
