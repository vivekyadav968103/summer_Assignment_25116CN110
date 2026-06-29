package Day_25;

import java.util.Arrays;

public class question_no_97 {
    public static void main(String[] args) {

        //to Merge two sorted arrays. 
        
        int[] arr1 = {1, 3, 6, 9, 10};      // sorted array
        int[] arr2 = {2, 5, 7, 8};
        int[] mergeArr = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;
        
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                mergeArr[k] = arr1[i];
                k++;
                i++;
            }
            else{
                mergeArr[k] = arr2[j];
                k++;
                j++;
            }
        }
        while(i < arr1.length){
            mergeArr[k++] = arr1[i++];
        }
        while(j < arr2.length){
            mergeArr[k++] = arr2[j++];
        }

        System.out.println(Arrays.toString(mergeArr));
    }
}
