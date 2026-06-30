package Day_27;

import java.util.Scanner;

// to Create marksheet generation system.

class Marksheet {
    int roll;
    String name;
    int m1, m2, m3, total;
    float per;
}

public class question_no_108 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        Marksheet s[] = new Marksheet[100];

    for(int i = 0; i < 100; i++){
            s[i] = new Marksheet();
        }

        int n = 0, ch;

        do{
            System.out.println("\n----- Marksheet Generation System -----");
            System.out.println("1. Add Student Marks");
            System.out.println("2. Display Marksheet");
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

                    System.out.print("Enter Marks of Maths: ");
                    s[n].m1 = sc.nextInt();

                    System.out.print("Enter Marks of Physics: ");
                    s[n].m2 = sc.nextInt();

                    System.out.print("Enter Marks of Chemistry: ");
                    s[n].m3 = sc.nextInt();

                    s[n].total = s[n].m1 + s[n].m2 + s[n].m3;
                    s[n].per = s[n].total / 3.0f;

                    n++;
                    System.out.println("Marksheet Generated Successfully.");
                    break;

                case 2:
                    if(n == 0){
                        System.out.println("No Records Found.");
                    }
                    else{
                        System.out.println("\nStudent Marksheet:");
                        for(int i = 0; i < n; i++){
                            System.out.println("Roll No    : " + s[i].roll);
                            System.out.println("Name       : " + s[i].name);
                            System.out.println("Maths  : " + s[i].m1);
                            System.out.println("Physics  : " + s[i].m2);
                            System.out.println("Chemistry  : " + s[i].m3);
                            System.out.println("Total Marks: " + s[i].total);
                            System.out.println("Percentage : " + s[i].per + "%");
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
                            System.out.println("Roll No    : " + s[i].roll);
                            System.out.println("Name       : " + s[i].name);
                            System.out.println("Maths  : " + s[i].m1);
                            System.out.println("Physics  : " + s[i].m2);
                            System.out.println("Chemistry  : " + s[i].m3);
                            System.out.println("Total Marks: " + s[i].total);
                            System.out.println("Percentage : " + s[i].per + "%");

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
