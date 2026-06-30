package Day_27;
import java.util.Scanner;

// to Create student record management system.

class Student {
    int roll;
    String name;
    float marks;
}

public class question_no_105{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Student s[] = new Student[100];

        for(int i = 0; i < 100; i++){
            s[i] = new Student();
        }

        int n = 0, ch;

        do{
            System.out.println("\n----- Student Record Management System -----");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch(ch){
                case 1:
                    System.out.print("Enter Roll No: ");
                    s[n].roll = sc.nextInt();

                    System.out.print("Enter Name: ");
                    s[n].name = sc.next();

                    System.out.print("Enter Marks: ");
                    s[n].marks = sc.nextFloat();

                    n++;
                    System.out.println("Student Record Added Successfully.");
                    break;

                case 2:
                    if(n == 0){
                        System.out.println("No Records Found.");
                    }
                    else{
                        System.out.println("\nStudent Records:");
                        for(int i = 0; i < n; i++){

                            System.out.println("Roll No : " + s[i].roll);
                            System.out.println("Name    : " + s[i].name);
                            System.out.println("Marks   : " + s[i].marks);
                            System.out.println();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll No to Search: ");
                    int search = sc.nextInt();
                    boolean found = false;

                    for(int i = 0; i < n; i++){

                        if(s[i].roll == search){

                            System.out.println("Record Found");
                            System.out.println("Roll No : " + s[i].roll);
                            System.out.println("Name    : " + s[i].name);
                            System.out.println("Marks   : " + s[i].marks);
                            found = true;
                            break;
                        }
                    }

                    if(!found){
                        System.out.println("Student Record Not Found.");
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