package Day_16;

import java.util.Scanner;

public class question_no_61 {
    public static void main(String[] args) {

        //to find missing number of the array.

        Scanner sc = new Scanner(System.in);

        int[] arr = {1 , 2, 3, 5, 6};

        int sum1 = 0;
        for(int i = 0; i < arr.length; i++){
            sum1 += arr[i];
        }
        int n = arr.length;
        int sum2 = ((n + 1) * (n + 2)) / 2;
        int missingNum = sum2 - sum1;

        System.out.println("Missing number in the array = " + missingNum);
    }
}
