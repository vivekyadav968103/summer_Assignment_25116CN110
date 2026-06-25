package Day_21;

import java.util.Scanner;

public class question_no_84 {
    public static void main(String[] args) {

        // to Convert lowercase to uppercase.

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String str = sc.nextLine();

        StringBuilder upperCase = new StringBuilder();
        
        for(char ch : str.toCharArray()){
            if(ch >= 'a' && ch <= 'z'){
                ch = (char)(ch - 32);
            }
            upperCase.append(ch);
        }
        System.out.println(upperCase);
    }
}
