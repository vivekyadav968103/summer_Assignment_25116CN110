package Day_16;

import java.util.Scanner;

public class question_no_62 {
    public static void main(String[] args) {

        // to Find maximum frequency element.


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxCount = 0;
        int maxElement = 0;

        for(int i = 0; i < arr.length; i++){
            int count = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
                if(count > maxCount){
                    maxCount = count;
                    maxElement = arr[i];
                }
            }
        }
        System.out.println("Max frequent element = " + maxElement + " and frequency = " + maxCount);
    }
}
