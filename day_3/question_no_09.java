package Day_3;
import java.util.*;
public class question_no_09 {
    public static void main(String[] args) {
        //to check whether the number is prime or not.
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the number : ");
         int n = sc.nextInt();
         int count = 0;

         for (int i = 1; i <= n; i++) {
             if(n % i == 0){
                count++;
             }
         }
         if(count == 2){
            System.out.println(n + " is prime number");
         }
         else{
            System.out.println(n + " is not prime number");
         }
    }
}
