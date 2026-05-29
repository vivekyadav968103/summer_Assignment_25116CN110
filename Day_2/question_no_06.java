import java.util.*;
public class question_no_06 {
    public static void main(String[] args) {
        
        // to reverse the number.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter te number : ");
        int n = sc.nextInt();
        int digit, rev = 0;

        while(n > 0){
            digit = n % 10;
            rev = rev*10 + digit;
            n /= 10;
        }
        System.out.println("Reverse of the umber = " + rev);
    }
}
