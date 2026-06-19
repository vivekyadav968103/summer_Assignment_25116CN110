package Day_12;

import java.util.Scanner;

public class question_no_45 {
    public static void palindrome(int x){
        int x_cpy = x;
        int sum = 0;
        while(x_cpy != 0){
            sum = sum * 10 + (x_cpy % 10);
            x_cpy /= 10;
        }
        if(x == sum)
            System.out.println(x + " is Palindrome");
        else
            System.out.println(x + " is not Palindrome");
    }
    public static void main(String[] args) {

        // to check the palindrome using function.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        palindrome(num);
    }
}
