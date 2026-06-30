package Day_30;

// to Develop complete mini project using arrays, strings and functions. 

import java.util.Scanner;

public class question_no_120 {

    static int[] roll = new int[100];
    static String[] name = new String[100];
    static double[] marks = new double[100];
    static int count = 0;

    // Function to add student
    static void addStudent(Scanner sc) {
        System.out.print("Enter Roll Number: ");
        roll[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        name[count] = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks[count] = sc.nextDouble();

        count++;
        System.out.println("Student Added Successfully.");
    }

    // Function to display students
    static void displayStudents() {
        if (count == 0) {
            System.out.println("No Records Found.");
            return;
        }

        System.out.println("\nRoll No\tName\t\tMarks");
        for (int i = 0; i < count; i++) {
            System.out.println(roll[i] + "\t" + name[i] + "\t\t" + marks[i]);
        }
    }

    // Function to search student
    static void searchStudent(Scanner sc) {
        System.out.print("Enter Roll Number: ");
        int r = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (roll[i] == r) {
                System.out.println("Student Found");
                System.out.println("Roll No : " + roll[i]);
                System.out.println("Name    : " + name[i]);
                System.out.println("Marks   : " + marks[i]);
                return;
            }
        }
        System.out.println("Student Not Found.");
    }

    // Function to update marks
    static void updateMarks(Scanner sc) {
        System.out.print("Enter Roll Number: ");
        int r = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (roll[i] == r) {
                System.out.print("Enter New Marks: ");
                marks[i] = sc.nextDouble();
                System.out.println("Marks Updated Successfully.");
                return;
            }
        }
        System.out.println("Student Not Found.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MINI PROJECT =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Marks");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent(sc);
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    searchStudent(sc);
                    break;
                case 4:
                    updateMarks(sc);
                    break;
                case 5:
                    System.out.println("Exiting Project...");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

    }
}