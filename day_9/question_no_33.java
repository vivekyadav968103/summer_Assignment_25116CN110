package Day_9;

public class question_no_33 {
    public static void main(String[] args) {

        // to print the pattern..
        // * * * * * 
        // * * * * 
        // * * * 
        // * * 
        // *  

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*' + " ");
            }
            System.out.println();
        }
    }
}

