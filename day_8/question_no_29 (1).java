package Day_8;

public class question_no_29 {
    public static void main(String[] args) {

        // to print the pattern..
        // * 
        // * * 
        // * * * 
        // * * * * 
        //* * * * *
        
        char ch = '*';
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
