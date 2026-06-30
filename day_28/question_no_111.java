package Day_28;

import java.util.Scanner;

//  to Create ticket booking system.

class Ticket {
    int ticketNo;
    String name;
    String destination;
}

public class question_no_111 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Ticket t[] = new Ticket[100];

        for(int i = 0; i < 100; i++) {
            t[i] = new Ticket();
        }

        int n = 0, ch;

        do {
            System.out.println("\n----- Ticket Booking System -----");
            System.out.println("1. Book Ticket");
            System.out.println("2. Display Tickets");
            System.out.println("3. Search Ticket");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch(ch) {
                case 1:
                    System.out.print("Enter Ticket Number: ");
                    t[n].ticketNo = sc.nextInt();

                    System.out.print("Enter Passenger Name: ");
                    t[n].name = sc.next();

                    System.out.print("Enter Destination: ");
                    t[n].destination = sc.next();

                    n++;
                    System.out.println("Ticket Booked Successfully.");
                    break;

                case 2:
                    if(n == 0) {
                        System.out.println("No Tickets Found.");
                    }
                    else {
                        System.out.println("\nTicket Details:");
                        for(int i = 0; i < n; i++) {
                            System.out.println("Ticket No   : " + t[i].ticketNo);
                            System.out.println("Name        : " + t[i].name);
                            System.out.println("Destination : " + t[i].destination);
                            System.out.println();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Ticket Number to Search: ");
                    int search = sc.nextInt();
                    boolean found = false;

                    for(int i = 0; i < n; i++) {
                        if(t[i].ticketNo == search) {
                            System.out.println("Ticket Found");
                            System.out.println("Ticket No   : " + t[i].ticketNo);
                            System.out.println("Name        : " + t[i].name);
                            System.out.println("Destination : " + t[i].destination);

                            found = true;
                            break;
                        }
                    }

                    if(!found) {
                        System.out.println("Ticket Not Found.");
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