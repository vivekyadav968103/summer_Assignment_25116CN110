package Day_26;

import java.util.Scanner;

public class question_no_103 {
    public static void main(String[] args) {

        // to Create ATM simulation.
        
        Scanner sc = new Scanner(System.in);

        int balance = 40000;

        System.out.print("Enter the pin : ");
        int pin = sc.nextInt();

        if(pin == 4231){
            System.out.println("1. Balance Check");
            System.out.println("2. Withdrawl");
            System.out.println("3. Deposit");

            System.out.print("Enter the choice : ");
            int choice = sc.nextInt();

            if(choice == 1){
                System.out.println("Your balance is " + balance);
            }
            else if(choice == 2){
                System.out.print("Enter the amount to withdrawal: ");
                int withdrawal = sc.nextInt();

                if(withdrawal > balance)
                    System.out.println("Insufficient Balance");
                else{
                    System.out.println("\n!! Withdrawl Successful !!\n");
                    balance = balance - withdrawal;
                    System.out.println("Avalable balance is " + balance);
                }
            }
            else if(choice == 3){
                System.out.print("Enter the amout to deposit : ");
                int deposite = sc.nextInt();
                
                balance = balance + deposite;
                System.out.println("Updated balance is " + balance);
            }
            else
                System.out.println("Enter the correct choice");
        }
        else{
            System.out.println(" !! Incorrect pin !!");
        }
    }
}
