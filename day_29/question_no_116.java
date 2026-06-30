package Day_29;

// to Create inventory management system. 

import java.util.Scanner;

public class question_no_116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] id = new int[100];
        String[] name = new String[100];
        int[] quantity = new int[100];

        int count = 0, choice;

        do {
            System.out.println("\n===== INVENTORY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Search Product");
            System.out.println("4. Update Quantity");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    id[count] = sc.nextInt();

                    sc.nextLine(); // Clear buffer
                    System.out.print("Enter Product Name: ");
                    name[count] = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    quantity[count] = sc.nextInt();

                    count++;
                    System.out.println("Product Added Successfully.");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No products available.");
                    } else {
                        System.out.println("\nID\tName\t\tQuantity");
                        for (int i = 0; i < count; i++) {
                            System.out.println(id[i] + "\t" + name[i] + "\t\t" + quantity[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Product ID to Search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (id[i] == searchId) {
                            System.out.println("Product Found:");
                            System.out.println("ID: " + id[i]);
                            System.out.println("Name: " + name[i]);
                            System.out.println("Quantity: " + quantity[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Product Not Found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Product ID to Update: ");
                    int updateId = sc.nextInt();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (id[i] == updateId) {
                            System.out.print("Enter New Quantity: ");
                            quantity[i] = sc.nextInt();
                            System.out.println("Quantity Updated Successfully.");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Product Not Found.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting Inventory Management System...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);
    }
}
