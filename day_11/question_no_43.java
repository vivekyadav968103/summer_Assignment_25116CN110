package Day_11;

import java.util.Scanner;

public class question_no_43 {
    
    public static void prime(int x){
        int count = 0;
        for (int i = 2; i <= x; i++) {
            if(x % i == 0){
                count++;
            }
        }
        if(count == 1){
            System.out.println(x + " is prime number");
        }
        else{
            System.out.println(x + " is not prime number");
        }
    }
    public static void main(String[] args) {

        // to check the prime number using function.
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = sc.nextInt();

        prime(a);
    }
}
