package Day_28;

import java.util.Scanner;

// to Create contact management system. 

class Contact {
    int id;
    String name;
    String phone;
}

public class question_no_112 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Contact c[] = new Contact[100];

        for(int i = 0; i < 100; i++) {
            c[i] = new Contact();
        }

        int n = 0, ch;

        do {
            System.out.println("\n----- Contact Management System -----");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch(ch) {
                case 1:
                    System.out.print("Enter Contact ID: ");
                    c[n].id = sc.nextInt();

                    System.out.print("Enter Name: ");
                    c[n].name = sc.next();

                    System.out.print("Enter Phone Number: ");
                    c[n].phone = sc.next();

                    n++;
                    System.out.println("Contact Added Successfully.");
                    break;

                case 2:
                    if(n == 0) {
                        System.out.println("No Contacts Found.");
                    }
                    else {
                        System.out.println("\nContact Details:");
                        for(int i = 0; i < n; i++) {
                            System.out.println("Contact ID   : " + c[i].id);
                            System.out.println("Name         : " + c[i].name);
                            System.out.println("Phone Number : " + c[i].phone);
                            System.out.println();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Contact ID to Search: ");
                    int search = sc.nextInt();
                    boolean found = false;

                    for(int i = 0; i < n; i++) {
                        if(c[i].id == search) {
                            System.out.println("Contact Found");
                            System.out.println("Contact ID   : " + c[i].id);
                            System.out.println("Name         : " + c[i].name);
                            System.out.println("Phone Number : " + c[i].phone);

                            found = true;
                            break;
                        }
                    }

                    if(!found) {
                        System.out.println("Contact Not Found.");
                    }
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while(ch != 4);
    }
}
