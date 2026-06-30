package Day_26;

import java.util.Random;
import java.util.Scanner;

public class question_no_101 {
    public static void main(String[] args) {

        // to Create number guessing game

        Scanner sc = new Scanner(System.in);

        Random random = new Random();

        int number = random.nextInt(100) + 1;

        System.out.println("===Number Guessing Game===");
        System.out.println("I have choosen the number between 1 to 100");

        int guess;
        int atempt = 0;

        do { 
            System.out.print("Enter the guessed number : ");
            guess = sc.nextInt();
            atempt++;

            if(guess > number)
                System.out.println("To high");
            else if(guess < number)
                System.out.println("To low");
            else
                System.out.println("\nCongratulations! You have guessed the number in " + atempt + " atempt");
        } while (number != guess);
    }
}
