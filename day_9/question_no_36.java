package Day_9;

public class question_no_36 {
    public static void main(String[] args) {

        // to print the pattern..
        // *****
        // *   *
        // *   *
        // *   *
        // *****  

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 5) {
                    System.out.print('*');
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    } 
}
