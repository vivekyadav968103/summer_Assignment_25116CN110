package Day_18;

import java.util.Arrays;

public class question_no_70 {
    public static void main(String[] args) {

        //selection sort
        
        int array[] = {8, 2, 6, 1, 5, 9, 0, 4};

        for (int i = 0; i < array.length - 1; i++){
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if(array[min] > array[j])
                    min = j;
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
