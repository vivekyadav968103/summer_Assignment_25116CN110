package Day_6;

import java.util.*;
public class question_no_23 {
    public static void main(String[] args) {

        //to count set bits in a number.

        Scanner sc = new Scanner(System.in);
        System.out.print("Entert the number : ");
        int num = sc.nextInt();

        int count = 0;

        while (num != 0) {
            count += num % 2; 
            num /= 2;
        }
                System.out.print("Binary Number : " + count);

    }
}
