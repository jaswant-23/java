package gfg.potd;

import java.util.Arrays;

public class diagonal_Matrix {
    /*
     * Print matrix in diagonal pattern
     * EasyAccuracy: 67.77%Submissions: 8K+Points: 2
     * 
     * 200+ people shotlisted last month for SDE Internship. Grab your spot this
     * month via GfG Weekly Contest!
     * banner
     * 
     * Given a square matrix mat[][] of n*n size, the task is to determine the
     * diagonal pattern which is a linear arrangement of the elements of the matrix
     * as depicted in the following example:
     * 
     * Example 1:
     * 
     * Input:
     * n = 3
     * mat[][] = {{1, 2, 3},
     * {4, 5, 6},
     * {7, 8, 9}}
     * Output: {1, 2, 4, 7, 5, 3, 6, 8, 9}
     * Explaination:
     * Starting from (0, 0): 1,
     * Move to the right to (0, 1): 2,
     * Move diagonally down to (1, 0): 4,
     * Move diagonally down to (2, 0): 7,
     * Move diagonally up to (1, 1): 5,
     * Move diagonally up to (1, 2): 3,
     * Move to the right to (2, 1): 6,
     * Move diagonally up to (0, 2): 8,
     * Move diagonally up to (2, 2): 9
     * There for the output is {1, 2, 4, 7, 5, 3, 6, 8, 9}.
     * 
     * Example 2:
     * 
     * Input:
     * n = 2
     * mat[][] = {{1, 2},
     * {3, 4}}
     * Output: {1, 2, 3, 4}
     * Explaination:
     * Starting from (0, 0): 1,
     * Move to the right to (0, 1): 2,
     * Move diagonally down to (1, 0): 3,
     * Move to the right to (1, 1): 4
     * There for the output is {1, 2, 3, 4}.
     * 
     * Your Task:
     * You only need to implement the given function matrixDiagonally() which takes
     * a matrix mat[][] of size n*n as an input and returns a list of integers
     * containing the matrix diagonally. Do not read input, instead use the
     * arguments given in the function.
     * 
     * Expected Time Complexity: O(n*n).
     * Expected Auxiliary Space: O(1).
     * Constraints:
     * 1 <= n <= 100
     * -100 <= elements of matrix <= 100
     */

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };


        System.out.println("Here is the matrix by my function");
        int[] ans = Anti_diagonal_Trav(matrix,matrix.length);
        System.out.println(Arrays.toString(ans));

        int row = 0, col = 0;

        while (col < matrix.length) {
            int r = row;
            int c = col;
            while (r < matrix.length && c >= 0) {
                System.out.print(matrix[r][c] + " ");
                r++;
                c--;
            }
            col++;
        }
        col = matrix.length - 1;
        row = 1;
        while (row < matrix.length) {
            int r = row;
            int c = col;
            while (r < matrix.length && c >= 0) {
                System.out.print(matrix[r][c] + " ");
                r++;
                c--;
            }
            row++;
        }
    }
    public static int[] Anti_diagonal_Trav(int mat[][],int n){
        int size = n*n;
        int[] ans = new int[size];
        int t =0;
        int row=0,col=0;
        while (col<n) {
            int r=row;
            int c=col;
            while(r < n && c>=0){
                ans[t] = mat[r][c];
                t++;
                r++;
                c--;
            }
            col++;
        }

        // For the second part of the matrix

         row = 1;
         col = n-1;
         while (row<n) {
            int r=row;
            int c = col;
            while(r< mat.length && c>=0){
                ans[t]=mat[r][c];
                t++;
                r++;
                c--;
            }
            row++;
         }

        return ans;
    }
}
