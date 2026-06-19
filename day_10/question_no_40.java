package Day_10;

public class question_no_40 {
    public static void main(String[] args) {

        // to print the pattern.
        //         A 
        //       A B A 
        //     A B C B A 
        //   A B C D C B A 
        // A B C D E D C B A 
        
        int n = 5;
        for (int i = 1; i <= n; i++) {

            for (int k = 0; k <= n - 1 - i; k++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print((char) ('A' + j) + " ");
            }
            for (int l = i - 2; l >= 0; l--) {
                
                System.out.print((char)('A' + l) + " ");
            }
            System.out.println();
        }
    }
}
