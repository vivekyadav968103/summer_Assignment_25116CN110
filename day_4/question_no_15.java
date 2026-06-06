package Day_4;

import java.util.*;
public class question_no_15{
    public static void main(String[] args) {

        //to check Armstrong number.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number number : ");
        int n = sc.nextInt();

        int n_cpy1 = n;
        int count = 0;
        while(n_cpy1 > 0){
            n_cpy1 = n_cpy1/ 10;
            count++;
        }
        int sum = 0, digit;
        n_cpy1 = n;
        while(n_cpy1 > 0){
            digit = n_cpy1 % 10;
            sum += (int)Math.pow(digit, count);
            n_cpy1 /= 10;
        }
        if(n == sum){
            System.out.println(n + " is Armstrong number");
        }
        else{
            System.out.println(n + " is not Armstrong number");
        }
    }
}
