package Day_8;

public class question_no_32 {
    public static void main(String[] args) {

        // to print the pattern..
        // 1 
        // 2 2 
        // 3 3 3 
        // 4 4 4 4 
        // 5 5 5 5 5
        
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
