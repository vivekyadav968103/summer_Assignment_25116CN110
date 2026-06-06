package Day_5;

import java.util.*;
public class question_no_20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int large = 1;
        for (int i = 2; i <= num; i++) {
            while (num % i == 0) { 
                large = i;
                num /= i;
            }
        }
        System.out.println("Largest Prime Factor : " + large);
    }
}
