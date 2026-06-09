package Day_6;

import java.util.*;
public class question_no_24 {
    public static void main(String[] args) {
        
        // to find x^n without using pow().

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base 'x' : ");
        int x = sc.nextInt();
        System.out.print("Enter the exponent 'n' : ");
        int n = sc.nextInt();

        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= x;
        }
        System.out.println("Result = " + result);
    }
}
