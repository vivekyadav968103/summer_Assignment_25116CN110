package Day_3;

import java.util.*;;

public class question_no_11 {
    public static void main(String[] args) {
        
        //to find GCD of two number.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();
        int gcd = 0;

        for (int i = 1; i <= a && i <= b; i++) {
            if(a % i == 0 && b % i == 0){
                gcd = i;
            }
        }
        System.out.println("GCD is " + gcd);
    }
}
