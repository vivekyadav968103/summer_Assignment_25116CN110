package Day_28;

import java.util.Scanner;

// to Create library management system. 

class Library {
    int bookId;
    String bookName;
    String author;
}

public class question_no_109 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Library b[] = new Library[100];

        for(int i = 0; i < 100; i++) {
            b[i] = new Library();
        }

        int n = 0, ch;

        do {
            System.out.println("\n----- Library Management System -----");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch(ch) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    b[n].bookId = sc.nextInt();

                    System.out.print("Enter Book Name: ");
                    b[n].bookName = sc.next();

                    System.out.print("Enter Author Name: ");
                    b[n].author = sc.next();

                    n++;
                    System.out.println("Book Added Successfully.");
                    break;

                case 2:
                    if(n == 0){
                        System.out.println("No Books Available.");
                    }
                    else{
                        System.out.println("\nBook Details:");
                        for(int i = 0; i < n; i++) {
                            System.out.println("Book ID     : " + b[i].bookId);
                            System.out.println("Book Name   : " + b[i].bookName);
                            System.out.println("Author Name : " + b[i].author);
                            System.out.println();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID to Search: ");
                    int search = sc.nextInt();
                    boolean found = false;

                    for(int i = 0; i < n; i++) {
                        if(b[i].bookId == search) {
                            System.out.println("Book Found");
                            System.out.println("Book ID     : " + b[i].bookId);
                            System.out.println("Book Name   : " + b[i].bookName);
                            System.out.println("Author Name : " + b[i].author);

                            found = true;
                            break;
                        }
                    }

                    if(!found) {
                        System.out.println("Book Not Found.");
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
