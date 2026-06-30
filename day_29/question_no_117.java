package Day_30;

// to Create student record system using arrays and strings. 

import java.util.Scanner;

public class question_no_117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] rollNo = new int[100];
        String[] name = new String[100];
        double[] marks = new double[100];

        int count = 0, choice;

        do {
            System.out.println("\n===== STUDENT RECORD SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Marks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll Number: ");
                    rollNo[count] = sc.nextInt();

                    sc.nextLine(); // Clear buffer
                    System.out.print("Enter Student Name: ");
                    name[count] = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    marks[count] = sc.nextDouble();

                    count++;
                    System.out.println("Student Record Added Successfully.");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No student records found.");
                    } else {
                        System.out.println("\nRoll No\tName\t\tMarks");
                        for (int i = 0; i < count; i++) {
                            System.out.println(rollNo[i] + "\t" + name[i] + "\t\t" + marks[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll Number to Search: ");
                    int searchRoll = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (rollNo[i] == searchRoll) {
                            System.out.println("Student Found:");
                            System.out.println("Roll No: " + rollNo[i]);
                            System.out.println("Name: " + name[i]);
                            System.out.println("Marks: " + marks[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Record Not Found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Roll Number to Update Marks: ");
                    int updateRoll = sc.nextInt();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (rollNo[i] == updateRoll) {
                            System.out.print("Enter New Marks: ");
                            marks[i] = sc.nextDouble();
                            System.out.println("Marks Updated Successfully.");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Record Not Found.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting Student Record System...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);
    }
}