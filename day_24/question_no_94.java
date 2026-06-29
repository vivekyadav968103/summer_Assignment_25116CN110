package Day_24;

import java.util.Scanner;

public class question_no_94 {
    public static void main(String[] args) {

        // to Compress a string. 

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the sentance : ");
        String str = sc.nextLine();

        str = str + " ";

        int count = 1;

        for (int i = 0; i < str.length() - 1; i++) {

            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                System.out.print(str.charAt(i));
                System.out.print(count);
                count = 1;
            }
        }
    }
}
