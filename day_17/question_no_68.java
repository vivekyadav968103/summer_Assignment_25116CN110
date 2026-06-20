package Day_17;

public class question_no_68 {
    public static void main(String[] args) {

        // to find common element of the given array.
        
        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 4, 5};

        boolean[] visited = new boolean[arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j] && !visited[j]) {
                    System.out.print(arr1[i] + " ");
                    visited[j] = true;
                    break;
                }
            }
        }
    }
}
