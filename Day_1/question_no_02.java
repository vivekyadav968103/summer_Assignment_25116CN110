
import java.util.Scanner;

public class question_no_02 {
    public static void main(String[] args) {
        
        //to print tht multiplication table.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
}
