package Day_16;

import java.util.Arrays;
import java.util.Scanner;

public class question_no_63 {
    public static void main(String[] args) {

        //  to Find pair with given sum.

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the element : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter the targeted sum : ");
        int target = sc.nextInt();

        int[] pair = new int[2];
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i] + arr[j] == target){
                    pair[0] = i;
                    pair[1] = j;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(pair));
    }
}
