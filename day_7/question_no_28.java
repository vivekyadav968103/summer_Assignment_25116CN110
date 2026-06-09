package Day_7;

import java.util.Scanner;

public class question_no_28 {
    public static int reverseOfNumber(int x, int rev){
        if(x==0){
            return rev;
        }
        return reverseOfNumber(x / 10, rev * 10 + x % 10);
        
    }
    public static void main(String[] args) {

        //to reverse the number.(using recursion function)

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        System.out.println("Reverse of number = " + reverseOfNumber(num, 0));

    }
}
