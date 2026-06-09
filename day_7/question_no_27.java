package Day_7;

import java.util.*;
public class question_no_27 {

    public static int sumOfDigit(int x){
        if(x==0){
            return 0;
        }
        int sum = (x % 10) + sumOfDigit(x / 10);
        return sum;
    }
    public static void main(String[] args) {

        //to find the sum of digits.(using recursion function)

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        System.out.println("Sum of digits = " + sumOfDigit(num));

    }
}
