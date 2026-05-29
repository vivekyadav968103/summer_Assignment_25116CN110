import java.util.Scanner;

public class question_no_07 {
    public static void main(String[] args) {
        
        //to find the product of digits of given number.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter te number : ");
        int n = sc.nextInt();
        int digit, prod = 1;

        while(n > 0){
            digit = n % 10;
            prod *= digit;
            n /= 10;
        }
        System.out.println("Product of the digits = " + prod);
    }
}
