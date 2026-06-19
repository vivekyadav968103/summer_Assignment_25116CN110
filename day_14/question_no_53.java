package Day_14;

import java.util.Scanner;

public class question_no_53 {
    public static void main(String[] args) {

        // linear search program.

        Scanner sc = new Scanner(System.in);

        int[] arr = {6, 3, 13, 1, 4, 3, 7, 15, 9};

        System.out.print("Enter the element to find : ");
        int numToFind = sc.nextInt();
        int check = 0;

        for(int i = 0; i < arr.length; i++){
            if(numToFind == arr[i]) {
                System.out.println("Number found at index " + i);
                check++;
            }
        }
        if(check == 0)
            System.out.println("Number not found");
    }
}
