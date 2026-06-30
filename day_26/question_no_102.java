package Day_26;

import java.util.Scanner;

public class question_no_102 {
    public static void main(String[] args) {

        // to Create voting eligibility system.

        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter you age : ");
        int age = sc.nextInt();
        if(age >= 18)
            System.out.print("You are eligible to voting.");
        else
            System.out.println("Your are not eligible to voting.");
    }
}
