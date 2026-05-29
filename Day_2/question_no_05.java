import java.util.*;
public class question_no_05 {
    public static void main(String[] args) {
        
        //to find the sum of the digits of given number.

        Scanner sc = new Scanner(System.in);
        System.out.print("ENter the number : ");
        int n = sc.nextInt();
        int rem, sum = 0;

        while(n > 0){
            rem = n % 10;
            sum += rem;
            n /= 10;
        }
        System.out.println("Sum of digits = " + sum);
    }
}
