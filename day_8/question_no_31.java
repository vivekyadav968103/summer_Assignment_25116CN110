package Day_8;

public class question_no_31 {
    public static void main(String[] args) {

        // to print the pattern..
        // A 
        // A B 
        // A B C 
        // A B C D 
        // A B C D E
                

        for (int i = 0; i < 6; i++) {
            char ch = 'A';
            for (int j = 0; j < i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }   
}
