package Day_21;

import java.util.Scanner;

public class question_no_81 {
    public static void main(String[] args) {

        // to print the length of the string without using str.length().

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String str = sc.nextLine();

        System.out.println("Length of string is " + strlength(str));
    }

    public static int strlength(String str){
        int count = 0;
        for(char ch : str.toCharArray()){
            count++;
        }
        return count;
    }
}
