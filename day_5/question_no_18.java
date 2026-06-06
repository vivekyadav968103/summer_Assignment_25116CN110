package Day_5;

import java.util.Scanner;

    public class question_no_18 {

        public static int fact( int x){
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args){

        // to check strong nummber.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int num_cpy = num;
        int sum = 0;

        while(num_cpy != 0){
            int digit = num_cpy % 10;
            sum += fact(digit);
            num_cpy /= 10;
        }
        if(num == sum){
            System.out.println(num + " is strong number");
        }
        else{
            System.out.println(num +  " is not strong number");
        }
    }
}
