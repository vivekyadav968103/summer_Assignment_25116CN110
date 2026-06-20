package Day_17;

import java.util.Arrays;

public class question_no_65 {
    public static void main(String[] args) {

        // to merge the two given array.
        
        int[] arr1 = {3, 5, 2, 9, 1};
        int[] arr2 = {7, 5, 3, 0};

        int[] mergeArr = new int[arr1.length + arr2.length];
        
        for (int i = 0; i < arr1.length; i++) {
            mergeArr[i] = arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            mergeArr[arr1.length + j] = arr2[j];
        }
        System.out.println(Arrays.toString(mergeArr));
    }
}
