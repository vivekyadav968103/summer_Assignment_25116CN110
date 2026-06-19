package Day_10;

public class question_no_39 {
    public static void main(String[] args) {

        // to print the pattern.
        //         1 
        //       1 2 1 
        //     1 2 3 2 1 
        //   1 2 3 4 3 2 1 
        // 1 2 3 4 5 4 3 2 1 
        
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int k = 0; k <= n - 1 - i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }
}
