package Day_4;

import java.util.*;
public class question_no_16 {
    public static int num_of_digits(int num){
        int count = 0;
        while(num > 0){
            num /= 10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {

        //to print Armstrong number in given range.
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting range : ");
        int start_range = sc.nextInt();
        System.out.print("Enter the ending range : ");
        int end_range = sc.nextInt();

        System.out.println("The Armstrong number in range " + start_range + " to " + end_range + " are : ");

        for (int num = start_range; num <= end_range; num++) {
            int original = num;
            int count = num_of_digits(num);
            int sum = 0;

            while (original > 0) { 
                int digit = original % 10;
                sum += (int)Math.pow(digit, count);
                original /= 10;
            }

            if(num == sum){
                System.out.println(num);
            }
        }
    } 
}
