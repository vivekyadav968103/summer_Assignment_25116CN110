package Day_21;

import java.util.Scanner;

public class question_no_83 {
    public static void main(String[] args) {

        // to count the number of vowel and consonant is the string.

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        
        int vowelsCount = 0;
        int ConsntCount = 0;
        str = str.toLowerCase();
        
        for(char ch : str.toCharArray()){
            
            if (ch == 'a' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'e') {
                vowelsCount++;
            }
            else if(ch == ' '){
                continue;
            }
            else if (ch >= 'a' && ch <= 'z') {
                ConsntCount++;
            }   
        }
        System.out.println("vowels = " + vowelsCount);
        System.out.println("consonant = " + ConsntCount);
    }
}
