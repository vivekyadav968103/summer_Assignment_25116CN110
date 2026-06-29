package Day_25;

import java.util.Scanner;

public class question_no_98 {
    public static void main(String[] args) {

        //to Find common characters in string.
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string : ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string : ");
        String str2 = sc.nextLine();

        System.out.print("Common character : ");
        for (int i = 0; i < str1.length(); i++) {

            boolean printed = false;

            for (int k = 0; k < i; k++) {
                if(str1.charAt(i) == str2.charAt(k)){
                    printed = true;
                    break;
                }
            }
            if(printed)
                continue;

            for (int j = 0; j < str2.length(); j++) {
                if(str1.charAt(i) == str2.charAt(j)){
                    System.out.print(str1.charAt(i) + " ");
                    break;
                }
            }
        }
    }
}
