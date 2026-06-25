package Day_21;

import java.util.Scanner;

public class question_no_82 {
    public static void main(String[] args) {

        // to reverse the string.

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        
        for(int i = str.length() - 1; i >= 0 ; i--){
            System.out.print(str.charAt(i));
        }
    }
}
