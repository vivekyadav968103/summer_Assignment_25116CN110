package Day_27;

import java.util.Scanner;

//  to Create salary management system.

class Salary {
    int id;
    String name;
    float basic, hra, da, total;
}

public class question_no_107 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        Salary s[] = new Salary[100];

        for(int i = 0; i < 100; i++){
            s[i] = new Salary();
        }

        int n = 0, ch;

        do{
            System.out.println("\n----- Salary Management System -----");
            System.out.println("1. Add Employee Salary");
            System.out.println("2. Display Salary Details");
            System.out.println("3. Search Employee");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch(ch){
                case 1:
                    System.out.print("Enter Employee ID: ");
                    s[n].id = sc.nextInt();

                    System.out.print("Enter Employee Name: ");
                    s[n].name = sc.next();

                    System.out.print("Enter Basic Salary: ");
                    s[n].basic = sc.nextFloat();

                    System.out.print("Enter HRA: ");
                    s[n].hra = sc.nextFloat();

                    System.out.print("Enter DA: ");
                    s[n].da = sc.nextFloat();

                    s[n].total = s[n].basic + s[n].hra + s[n].da;

                    n++;
                    System.out.println("Salary Record Added Successfully.");
                    break;

                case 2:
                    if(n == 0){
                        System.out.println("No Records Found.");
                    }
                    else{
                        System.out.println("\nSalary Records:");
                        for(int i = 0; i < n; i++){
                            System.out.println("Employee ID : " + s[i].id);
                            System.out.println("Name        : " + s[i].name);
                            System.out.println("Basic Salary: " + s[i].basic);
                            System.out.println("HRA         : " + s[i].hra);
                            System.out.println("DA          : " + s[i].da);
                            System.out.println("Total Salary: " + s[i].total);
                            System.out.println();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to Search: ");
                    int search = sc.nextInt();
                    boolean found = false;

                    for(int i = 0; i < n; i++){
                        if(s[i].id == search){
                            System.out.println("Record Found");
                            System.out.println("Employee ID : " + s[i].id);
                            System.out.println("Name        : " + s[i].name);
                            System.out.println("Basic Salary: " + s[i].basic);
                            System.out.println("HRA         : " + s[i].hra);
                            System.out.println("DA          : " + s[i].da);
                            System.out.println("Total Salary: " + s[i].total);

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
