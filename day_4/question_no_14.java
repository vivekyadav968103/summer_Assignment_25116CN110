package Day_4;

import java.util.Scanner;

public class question_no_14 {
public static void main(String[] args) {

        //to print the nth fibonacci series.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int n = sc.nextInt();

        int a = 0, b = 1, sum;
        for (int i = 2; i < n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        System.out.println(b);
    }
}
