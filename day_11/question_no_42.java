package Day_11;

import java.util.Scanner;

public class question_no_42 {

    public static void max(int x, int y){
        if(x > y){
            System.out.println("Maximum = " + x);
        }
        else{
            System.out.println("Maximum = " + y);
        }
    }
    public static void main(String[] args) {

        //to find maximum number using function.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();
        
        max(a, b);
    }
}
