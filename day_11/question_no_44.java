package Day_11;

import java.util.Scanner;

public class question_no_44 {

public static int factorial(int n){
    int fact = 1;
    for (int i = 1; i <= n; i++) {
        fact *= i;
    }
    return fact;
}
    public static void main(String[] args) {

        // to find the factorial using function.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        System.out.print("Factorial of " + num + " is " + factorial(num));
    }
}