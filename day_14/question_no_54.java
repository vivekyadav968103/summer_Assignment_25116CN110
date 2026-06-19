package Day_14;

import java.util.Scanner;

public class question_no_54 {
    public static void main(String[] args) {

        // to find the frequency of th element.

        Scanner sc = new Scanner(System.in);

        int[] arr = {5, 2, 5, 8, 5, 3, 5, 7, 3, 2, 12, 3, 7, 12};
        
        System.out.print("Enter the element to check frequency: ");
        int freq = sc.nextInt();
        int count = 0;
        for (int j = 0; j < arr.length; j++){
            if(arr[j] == freq){
                count++;
            }
        }
        if(count != 0)
            System.out.println("Frequency of the element = "  + count);
        else
            System.out.println("Invalid element entered!");
    }
}
