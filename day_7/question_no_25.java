package Day_7;

import java.util.Scanner;

public class question_no_25 {
    public static int factorial(int x){
        
        if(x==0){
            return 1;
        }
        return x * factorial(x-1);
    }
    public static void main(String[] args) {

        //to find factorial of given number.
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        System.out.println("factorial of " + num + " = " + factorial(num));

    }
}
