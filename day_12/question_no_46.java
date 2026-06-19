package Day_12;

import java.util.Scanner;

public class question_no_46 {

    public static void Armstrong(int x){
        int x_cpy = x;
        int sum = 0;

        int count = 0;
        while(x_cpy != 0){
            x_cpy /= 10;
            count++;
        }
        x_cpy = x;
        while(x_cpy != 0){
            int digit = x_cpy % 10;
            sum += Math.pow(digit, count);
            x_cpy /= 10;
        }
        if(x == sum)
            System.out.println(x + " is Armstrong number");
        else
            System.out.println(x + " is not Armstrong number");
    }
    public static void main(String[] args) {

        // to check the armstrong number using function.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        Armstrong(num);
    }
}
