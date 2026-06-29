package Day_25;

import java.util.Arrays;
import java.util.Scanner;

public class question_no_99 {
    public static void main(String[] args) {

        //to Sort names alphabetically.

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];

        System.out.print("Enter the names : ");
        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }
        
        for (int i = 0; i < names.length; i++) {
           String temp;
           for (int j = i + 1; j < names.length; j++) {

               if(names[i].charAt(0) > names[j].charAt(0)){
                    temp = names[j];
                    names[j] = names[i];
                    names[i] = temp;
               }
           }
        }
        System.out.println(Arrays.toString(names));
    }
}
