package Day_23;

import java.util.Scanner;

public class question_no_89 {
    public static void main(String[] args) {

        //  to Find first non-repeating character.


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String str = sc.nextLine();

        char firstNonRepeating = ' ';

        boolean found = false;

        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if(count == 1){
                firstNonRepeating = str.charAt(i);
                found = true;
                break;
            }
        }
        if(found)
            System.out.println("First non repeating character is  " + firstNonRepeating);
        else
            System.out.println("All character are repeating.");
    }
}
