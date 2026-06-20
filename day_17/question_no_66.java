package Day_17;

public class question_no_66 {
    public static void main(String[] args) {

        // to union two array.
        
        int[] arr1 = {1, 2, 3, 4, 7};
        int[] arr2 = {3, 4, 5, 6};

        for (int i = 0; i < arr1.length; i++) {
            boolean duplicate = false;

            for (int j = 0; j < i; j++) {
                if (arr1[i] == arr1[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                System.out.print(arr1[i] + " ");
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            boolean found = false;

            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    found = true;
                    break;
                }
            }

            for (int j = 0; j < i && !found; j++) {
                if (arr2[i] == arr2[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.print(arr2[i] + " ");
            }
        }
    }
}
