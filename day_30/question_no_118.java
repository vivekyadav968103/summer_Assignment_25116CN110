package Day_30;

// to Create mini library system. 

import java.util.Scanner;

public class question_no_118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] bookId = new int[100];
        String[] bookName = new String[100];
        String[] author = new String[100];

        int count = 0, choice;

        do {
            System.out.println("\n===== MINI LIBRARY SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    bookId[count] = sc.nextInt();

                    sc.nextLine(); // Clear buffer
                    System.out.print("Enter Book Name: ");
                    bookName[count] = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    author[count] = sc.nextLine();

                    count++;
                    System.out.println("Book Added Successfully.");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No books available.");
                    } else {
                        System.out.println("\nBook ID\tBook Name\tAuthor");
                        for (int i = 0; i < count; i++) {
                            System.out.println(bookId[i] + "\t" + bookName[i] + "\t" + author[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID to Search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (bookId[i] == searchId) {
                            System.out.println("Book Found:");
                            System.out.println("Book ID: " + bookId[i]);
                            System.out.println("Book Name: " + bookName[i]);
                            System.out.println("Author: " + author[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book Not Found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting Mini Library System...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);
    }
}