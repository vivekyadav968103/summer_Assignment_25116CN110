package Day_28;

import java.util.Scanner;

// to Create bank account system. 

class Bank {
    int accNo;
    String name;
    float balance;
}

public class question_no_110
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Bank b[] = new Bank[100];

        for(int i = 0; i < 100; i++) {
            b[i] = new Bank();
        }

        int n = 0, ch;

        do {
            System.out.println("\n----- Bank Account System -----");
            System.out.println("1. Create Account");
            System.out.println("2. Display Accounts");
            System.out.println("3. Search Account");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch(ch) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    b[n].accNo = sc.nextInt();

                    System.out.print("Enter Account Holder Name: ");
                    b[n].name = sc.next();

                    System.out.print("Enter Balance: ");
                    b[n].balance = sc.nextFloat();

                    n++;
                    System.out.println("Account Created Successfully.");
                    break;

                case 2:
                    if(n == 0) {
                        System.out.println("No Accounts Found.");
                    }
                    else {
                        System.out.println("\nAccount Details:");
                        for(int i = 0; i < n; i++) {
                            System.out.println("Account No : " + b[i].accNo);
                            System.out.println("Name       : " + b[i].name);
                            System.out.println("Balance    : " + b[i].balance);
                            System.out.println();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Account Number to Search: ");
                    int search = sc.nextInt();
                    boolean found = false;

                    for(int i = 0; i < n; i++) {
                        if(b[i].accNo == search) {
                            System.out.println("Account Found");
                            System.out.println("Account No : " + b[i].accNo);
                            System.out.println("Name       : " + b[i].name);
                            System.out.println("Balance    : " + b[i].balance);

                            found = true;
                            break;
                        }
                    }

                    if(!found) {
                        System.out.println("Account Not Found.");
                    }
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while(ch != 4);;
    }
}
