package Day_24;

import java.util.Scanner;

public class question_no_95 {
    public static void main(String[] args) {

        // to Find longest word. 

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the sentance : ");
        String str = sc.nextLine();

        String[] words = str.split(" ");

        int maxCount = 0;
        int idx = 0;

        for(int i = 0; i < words.length; i++){
            if(maxCount < words[i].length()){
                maxCount = words[i].length();
                idx = i;
            }
        }
        System.out.println("longest word = " + words[idx] + "\nlength = " + maxCount);
    }
}
