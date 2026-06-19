package Day_11;

import java.util.Scanner;

public class question_no_41 {
    public static int sum(int x, int y){
        return x + y;
    }
    public static void main(String[] args) {

        // to find the sum of two number using function.
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();

        System.out.println("Sum = " + sum(a, b));
    }
}
