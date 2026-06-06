package Day_5;

import java.util.*;
public class question_no_19 {
    public static void main(String[] args) {
        
        // to print the factor of the number.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        System.out.print("The factor of the number is");
        for (int i = 1; i <= num; i++) {
            if(num % i == 0){
                System.out.print(" " + i);
            }
        }
    }
}
