package Day_22;

import java.util.Scanner;

public class question_no_85 {
    public static void main(String[] args) {
        
        // to check the string is palindrome or not.

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String str = sc.nextLine();


        isPalindrome(str);
    }
    static void isPalindrome(String str){

        //to remove case sensitivity.
        str =str.toLowerCase();

        int start = 0;
        int end = str.length() - 1;

        boolean check = false;
        while(start < end){
            if(str.charAt(start) == str.charAt(end))
                check = true;
            
            else
                check = false;

            start++;
            end--;
        }
        if(check == true)
            System.out.println("String is palindrome");
        if(check == false)
            System.out.print("String is not palindrome");
    }
}
