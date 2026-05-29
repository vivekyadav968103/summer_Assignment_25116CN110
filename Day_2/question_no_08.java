import java.util.Scanner;

public class question_no_08 {
    public static void main(String[] args) {
        
        // to check whether the number is palindrome or not.
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter te number : ");
        int n = sc.nextInt();
        int digit, rev = 0;
        int n_cpy = n;
        
        while(n_cpy > 0){
            digit = n_cpy % 10;
            rev = rev*10 + digit;
            n_cpy /= 10;
        }
        if(rev == n){
            System.out.println("Number is Palindrome");
        }
        else{
            System.out.println("Number is not palindrome");
        }
    }
}
