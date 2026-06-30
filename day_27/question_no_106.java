package Day_27;

import java.util.Scanner;

// to Create employee management system.

class Employee {
    int id;
    String name;
    float salary;
}

public class question_no_106 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        Employee e[] = new Employee[100];

        for(int i = 0; i < 100; i++){
            e[i] = new Employee();
        }

        int n = 0, ch;

        do{
            System.out.println("\n----- Employee Management System -----");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch(ch){
                case 1:
                    System.out.print("Enter Employee ID: ");
                    e[n].id = sc.nextInt();

                    System.out.print("Enter Employee Name: ");
                    e[n].name = sc.next();

                    System.out.print("Enter Salary: ");
                    e[n].salary = sc.nextFloat();

                    n++;
                    System.out.println("Employee Record Added Successfully.");
                    break;

                case 2:
                    if(n == 0){
                        System.out.println("No Records Found.");
                    }
                    else{
                        System.out.println("\nEmployee Records:");
                        for(int i = 0; i < n; i++){
                            System.out.println("Employee ID : " + e[i].id);
                            System.out.println("Name        : " + e[i].name);
                            System.out.println("Salary      : " + e[i].salary);
                            System.out.println();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to Search: ");
                    int search = sc.nextInt();
                    boolean found = false;

                    for(int i = 0; i < n; i++){
                        if(e[i].id == search){

                            System.out.println("Record Found");
                            System.out.println("Employee ID : " + e[i].id);
                            System.out.println("Name        : " + e[i].name);
                            System.out.println("Salary      : " + e[i].salary);
                            found = true;
                            break;
                        }
                    }

                    if(!found){
                        System.out.println("Employee Record Not Found.");
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