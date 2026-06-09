package Day_6;

import java.util.Scanner;

public class question_no_22 {
    public static void main(String[] args) {
        
        //to convert binary number to decimal number.
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary number : ");
        int num = sc.nextInt();

        int decimal = 0;
        int power = 0;

        while(num != 0){
            int digit = num % 10;
            decimal += digit * (int)Math.pow(2, power);
            num /= 10;
            power++;
        }

        System.out.println("Decimal Number : " + decimal);
    }
}