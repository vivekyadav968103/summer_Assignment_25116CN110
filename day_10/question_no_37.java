package Day_10;

public class question_no_37 {
    public static void main(String[] args) {

        // to print the pattern.
        //         * 
        //       * * * 
        //     * * * * * 
        //    * * * * * * * 
        //  * * * * * * * * * 
        
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k <= n - 1 - i; k++) {
                System.out.print("  ");
            }
            for (int j = 0; j < (2*i) +1; j++) {
                System.out.print('*' + " ");
            }
            System.out.println();
        }
    }
}
