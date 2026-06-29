package Day_22;

import java.util.Scanner;

public class question_no_88 {
    public static void main(String[] args) {
        
        // to Remove spaces from string.


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        StringBuilder str = new StringBuilder(sc.nextLine());

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                str.deleteCharAt(i);
                i--;
            }
        }
        System.out.print(str);
    }
}
