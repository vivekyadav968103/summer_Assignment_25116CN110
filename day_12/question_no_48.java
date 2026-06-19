package Day_12;

import java.util.Scanner;

public class question_no_48 {

    public static void perfectNum(int x){
        int x_cpy = x;
        int sum = 0;
        for(int i = 1; i < x; i++){
            if(x_cpy % i == 0){
                sum += i;
            }
        }
        if(x == sum)
            System.out.println(x + " is perfect number");
        else
            System.out.println(x + " is not perfect number");
    }
    public static void main(String[] args) {

        // to check the perfect number using function.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        perfectNum(num);
    }
}
