package Day_4;

import java.util.*;
public class question_no_13 {
    public static void main(String[] args) {

        //to print fibonacci series.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int n = sc.nextInt();

        int a = 0, b = 1, sum;
        for (int i = 0; i < n; i++) {
            System.out.print(" " + a);
            sum = a + b;
            a = b;
            b = sum;
        }
    }
}
