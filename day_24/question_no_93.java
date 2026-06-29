package Day_24;

import java.util.Scanner;

public class question_no_93 {
        public static void main(String[] args) {

        //to Check string rotation. 

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string : ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (str1.length() == str2.length()) {

            String temp = str1 + str1;

            if (temp.contains(str2)) {
                System.out.println("String is rotation");
            } else {
                System.out.println("String is not rotation");
            }

        } else {
            System.out.println("String is not rotation");
        }
    }
}
