import java.util.*;
public class question_no_01 {
    public static void main(String[] args) {

        //to find the sum of first n number.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of first n numbers = " + sum);
    }
}
