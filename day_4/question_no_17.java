package Day_5;

import java.util.*;
public class question_no_17{
    public static void main(String[] args) {
        
        // to check perfect number. 

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int num_cpy = num;
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if(num_cpy % i == 0){
                sum += i;
            }
        }
        if(num == sum){
            System.out.println(num + " is perfect number");
        }
        else{
            System.out.println(num +  " is not perfect number");
        }
    }
}