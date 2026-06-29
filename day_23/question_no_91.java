package Day_23;

import java.util.Scanner;

public class question_no_91 {
    public static void main(String[] args) {

        // to Check anagram strings.

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        str1 = str1.toLowerCase();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        int[] freq = new int[256];

        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i)]++;
            freq[str2.charAt(i)]--;
        }

        boolean anagram = true;

        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0) {
                anagram = false;
                break;
            }
        }

        if (anagram)
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}
