package Day_17;

public class question_no_67 {
    public static void main(String[] args) {

        // to find intersection of the array. 
        
        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 4, 5};

        for (int i = 0; i < arr1.length; i++) {

            boolean alreadyPrinted = false;
            for (int k = 0; k < i; k++) {
                if (arr1[i] == arr1[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }
            if (alreadyPrinted) {
                continue;
            }

            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }
    }
}
