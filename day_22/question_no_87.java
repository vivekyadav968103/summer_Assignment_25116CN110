package Day_22;

import java.util.Scanner;

public class question_no_87 {
    public static void main(String[] args) {

        // to check the frequency of given character.

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String str = sc.nextLine();

        System.out.print("Enter the character to check : ");
        char ch = sc.next().charAt(0);

        str = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch)
                count++;
        }
        System.out.println("Frequency of " + ch + " = " + count);
    }
}
