import java.util.*;
public class question_no_03 {
    public static void main(String[] args) {

        //to find the factorial of given number.

        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + n + " is " + fact);
    }
}
