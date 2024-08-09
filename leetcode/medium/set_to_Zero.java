package leetcode.medium;

import java.util.Arrays;

public class set_to_Zero {
    public static void main(String[] args) {
        int[][] arr = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        // int ind = 0, jnd = 0;
        int rows = arr.length;
        int cols = arr[0].length;
        
        // Use two arrays to mark the rows and columns that need to be zeroed
        boolean[] rowZero = new boolean[rows];
        boolean[] colZero = new boolean[cols];
        
        // First pass to find all zeros and mark the corresponding rows and columns
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == 0) {
                    rowZero[i] = true;
                    colZero[j] = true;
                }
            }
        }
        
        // Set the identified rows to zero
        for (int i = 0; i < rows; i++) {
            if (rowZero[i]) {
                for (int j = 0; j < cols; j++) {
                    arr[i][j] = 0;
                }
            }
        }
        
        // Set the identified columns to zero
        for (int j = 0; j < cols; j++) {
            if (colZero[j]) {
                for (int i = 0; i < rows; i++) {
                    arr[i][j] = 0;
                }
            }
        }

        for (int[] b : arr) {
            System.out.println(Arrays.toString(b));
        }
    }
}
