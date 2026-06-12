package Day_9;

public class question_no_35 {
    public static void main(String[] args) {

        // to print the pattern..
        // A 
        // B B 
        // C C C 
        // D D D D 
        // E E E E E 

         
        for (int i = 0; i < 5; i++) {

            char ch = (char)('A' + i);

            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
