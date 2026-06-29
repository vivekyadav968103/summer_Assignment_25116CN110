package Day_22;

import java.util.Scanner;

public class question_no_86 {
    public static void main(String[] args) {

        // to Count words in a sentence.


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the sentance : ");
        String str = sc.nextLine();

        // int countWord = 0;
        // for(char ch : str.toCharArray()){
        //     if(ch == ' ')                           //another way to count words.
        //         countWord++;
        // }
        // System.out.println(countWord + 1);

        String[] words = str.split(" ");
        
        System.out.println("Number of words = " + words.length);
    }
}
