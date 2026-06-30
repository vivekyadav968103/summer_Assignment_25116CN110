package Day_26;

import java.util.Scanner;

public class question_no_104 {
    public static void main(String[] args) {

        //to Create quiz application.

        Scanner sc = new Scanner(System.in);
        int score = 0;

        //question no 1
        System.out.println("1. What is the capital of the India?");
        System.out.println("a. Mumbai");
        System.out.println("b. New Delhi");
        System.out.println("c. Lucknow");

        System.out.print("Option : ");
        char ans = sc.next().charAt(0);
        if(ans == 'b' || ans == 'B')
            score++;

        //question no 2
        System.out.println("2. What is national animal of the India?");
        System.out.println("a. Tiger");
        System.out.println("b. Lion");
        System.out.println("c. Elephant");

        System.out.print("Option : ");
        ans = sc.next().charAt(0);
        if(ans == 'a' || ans == 'A')
            score++;

        //question no 3
        System.out.println("3. Which planet is known as Rzed planet?");
        System.out.println("a. Venus");
        System.out.println("b. Mars");
        System.out.println("c. Jupitar");

        System.out.print("Option : ");
        ans = sc.next().charAt(0);
        if(ans == 'b' || ans == 'B')
            score++;

        //question no 4
        System.out.println("4. What is the output of 10 + 20?");
        System.out.println("a. 40");
        System.out.println("b. 30");
        System.out.println("c. 10");

        System.out.print("Option : ");
        ans = sc.next().charAt(0);
        if(ans == 'b' || ans == 'B')
            score++;

        System.out.println("!!! Quiz Completed !!!");
        System.out.println("Your Score is " + score);
    }
}
