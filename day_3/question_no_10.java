package Day_3;

import java.util.*;
public class question_no_10 {
    public static void main(String[] args) {
        
        //to print the prime number in given range.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= n; j++) {
                if(i % j == 0){
                    count++;
                }
            }
            if(count == 2){
            System.out.println(i);
            }
        }

    }
}
