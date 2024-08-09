package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class spiral_Mat {
    /*
     * 54. Spiral Matrix
     * Medium
     * Topics
     * Companies
     * Hint
     * 
     * Given an m x n matrix, return all elements of the matrix in spiral order.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
     * Output: [1,2,3,6,9,8,7,4,5]
     * 
     * Example 2:
     * 
     * Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
     * Output: [1,2,3,4,8,12,11,10,9,5,6,7]
     * 
     * 
     * 
     * Constraints:
     * 
     * m == matrix.length
     * n == matrix[i].length
     * 1 <= m, n <= 10
     * -100 <= matrix[i][j] <= 100
     * 
     */
    public static void main(String[] args) {
        System.out.println("Here print spiral matrix");
        /*
         * Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
         * Output: [1,2,3,4,8,12,11,10,9,5,6,7]
         */
        int[][] mat = { { 1, 2, 3 ,4}, { 5, 6, 7,8 }, { 9, 10,11,12 },{13,14,15,16} };
        // System.out.println(spiral_mat(mat));
        System.out.println(spiralMat(mat));
        for (int[] is : mat) {
            System.out.println(Arrays.toString(is));
        }
    }

    public static List<Integer> spiral_mat(int[][] arr) {
        ArrayList<Integer> li = new ArrayList<>();
        int r = arr.length;
        int c = arr[0].length;
        int starrow = 0;
        int endrow = r -1;
        int starcol = 0;
        int endcol = c -1;

        while (starrow <= endrow && starcol <= endcol) {
            // first traverse the row from 0->n
            for (int col = starcol; col <= endcol; col++) {
                // System.out.print(arr[starrow][col]+" ");
                li.add(arr[starrow][col]);
            }
            starrow++;
            // Now go down
            for (int i = starrow; i <= endrow; i++) {
                // System.out.print(arr[i][endcol]+" ");
                li.add(arr[i][endcol]);
            }
            endcol--;
            
            if (starrow <= endrow) { // Check if there are still rows remaining
                for (int col = endcol; col >= starcol; col--) {
                    li.add(arr[endrow][col]);
                }
                endrow--;
            }

            // Traverse left column
            if (starcol <= endcol) { // Check if there are still columns remaining
                for (int row = endrow; row >= starrow; row--) {
                    li.add(arr[row][starcol]);
                }
                starcol++;
            }
        }
        return li;

    }
    public static List<Integer> spiralMat(int[][] arr) {
        ArrayList<Integer> li = new ArrayList<>();
        int r = arr.length;
        int c = arr[0].length;
        int startRow = 0;
        int endRow = r - 1;
        int startCol = 0;
        int endCol = c - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Traverse top row
            for (int col = startCol; col <= endCol; col++) {
                li.add(arr[startRow][col]);
            }
            startRow++;

            // Traverse right column
            for (int row = startRow; row <= endRow; row++) {
                li.add(arr[row][endCol]);
            }
            endCol--;

            // Traverse bottom row
            if (startRow <= endRow) { // Check if there are still rows remaining
                for (int col = endCol; col >= startCol; col--) {
                    li.add(arr[endRow][col]);
                }
                endRow--;
            }

            // Traverse left column
            if (startCol <= endCol) { // Check if there are still columns remaining
                for (int row = endRow; row >= startRow; row--) {
                    li.add(arr[row][startCol]);
                }
                startCol++;
            }
        }
        return li;
    }
}
//[1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10]