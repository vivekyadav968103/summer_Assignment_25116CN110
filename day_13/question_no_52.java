package Day_13;

import java.util.Scanner;

public class question_no_52 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the array element : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int countEven = 0, countOdd = 0;
        for(int k = 0; k < arr.length; k++){
            if(arr[k] % 2 == 0)
                countEven++;
            if(arr[k] % 2 != 0)
                countOdd++;
        }
        System.out.println("Number of even element = " + countEven);
        System.out.println("Number of odd element = " + countOdd);
    }
}
