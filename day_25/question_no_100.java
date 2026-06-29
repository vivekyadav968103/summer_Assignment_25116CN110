package Day_25;

import java.util.Scanner;

public class question_no_100 {
    public static void main(String[] args) {

        //to Sort words by length.
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the sentance : ");
        String str = sc.nextLine();

        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            String temp;
            for (int j = i + 1; j < words.length; j++) {
                if(words[i].length() > words[j].length()){
                    temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        String result = String.join(" ", words);
        System.out.println(result);
    }
}
