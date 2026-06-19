package Day_10;

public class question_no_38 {
    public static void main(String[] args) {

        // to print the pattern.
        // * * * * * * * * *
        //   * * * * * * *
        //    * * * * *
        //      * * *
        //        * 

        
        int n = 5;
        for (int i = n; i > 0; i--) {
            for (int k = 0; k <= n - i; k++) {
                System.out.print("  ");
            }
            for (int j = 0; j < (2*i) -1; j++) {
                System.out.print('*' + " ");
            }
            System.out.println();
        }
    }
}
