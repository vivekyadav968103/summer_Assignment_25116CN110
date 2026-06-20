package Day_18;

import java.util.Arrays;

public class question_no_69 {
    public static void main(String[] args) {

        // bubble sort
        
        int array[] = {5, 3, 1, 8, 4, 6};

        for (int i = 0; i < array.length - 1; i++){
            for (int j = 0; j < array.length - i -1; j++) {
                if(array[j] > array[j +1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
