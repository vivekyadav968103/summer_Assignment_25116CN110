package Day_6;

import java.util.*;
public class question_no_21 {
    public static void main(String[] args) {
        
        //to convert decimal number to binary number number.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal number : ");
        int num = sc.nextInt();

        String binary = "";

        while (num != 0) {
            binary = (num % 2) + binary;
            num /= 2;
        }
                System.out.print("Binary Number : " + binary);

    }
}
