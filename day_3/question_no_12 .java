package Day_3;

import java.util.Scanner;

public class question_no_12 {
    public static void main(String[] args) {
        
        //to find LCM of two number.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();

        int max = Math.max(a, b);

        while (true) {
            if(max % a == 0 && max % b == 0){
                System.out.println("LCM is " + max);
                break;
            }
            max++;
        }
    }
}