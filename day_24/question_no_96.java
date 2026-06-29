package Day_24;

import java.util.Scanner;

public class question_no_96 {
    public static void main(String[] args) {

        //  to Remove duplicate characters.

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the sentance : ");
        StringBuilder str = new StringBuilder(sc.nextLine());

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)){
                    str.deleteCharAt(j);
                    j--;
                }
            }
        }
        System.out.println(str);
    }
}
