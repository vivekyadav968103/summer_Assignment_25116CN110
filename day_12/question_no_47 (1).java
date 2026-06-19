package Day_12;

import java.util.Scanner;

public class question_no_47 {

    public static void Fibonacci(int n){
        int a = 0, b = 1;
        for(int i = 0; i < n; i++){
            int sum = a + b;
            System.out.print(" " + a);
            a = b;
            b = sum;
        }
    }
    public static void main(String[] args) {

        // to print fibonacci series using function.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        System.out.print("Fibonacci series --- ");
        Fibonacci(num);
    }
}
