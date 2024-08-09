package gfg.potd;

// import java.util.Arrays;
// import java.util.HashMap;
// import java.util.Map;

public class matrix_sumK {
    /*
     * Back to Explore Page
     * Count pairs Sum in matrices
     * EasyAccuracy: 45.66%Submissions: 31K+Points: 2
     * 
     * 200+ people shotlisted last month for SDE Internship. Grab your spot this
     * month via GfG Weekly Contest!
     * banner
     * 
     * Given two sorted matrices mat1 and mat2 of size n x n of elements. Each
     * matrix contains numbers arranged in strictly ascending order, with each row
     * sorted from left to right, and the last element of a row being smaller than
     * the first element of the next row. You're given a target value, x, your task
     * is to find and count all pairs {a, b} such that a is from mat1 and b is from
     * mat2 where sum of a and b is equal to x.
     * 
     * Example 1:
     * 
     * Input:
     * n = 3, x = 21
     * mat1 = {{1, 5, 6},
     * {8, 10, 11},
     * {15, 16, 18}};
     * mat2 = {{2, 4, 7},
     * {9, 10, 12},
     * {13, 16, 20}}
     * OUTPUT: 4
     * Explanation: The pairs whose sum is found to be 21 are (1, 20), (5, 16), (8,
     * 13), (11, 10).
     * 
     * Example 2:
     * 
     * Input:
     * n = 2, x = 10
     * mat1 = {{1, 2},
     * {3, 4}}
     * mat2 = {{4, 5},
     * {6, 7}}
     * Output: 2
     * Explanation: The pairs whose sum found to be 10 are (4, 6), (3, 7).
     * 
     * User Task:
     * Your task is to complete the function countPairs() which takes 4 arguments
     * mat1, mat2, n, x, and returns the count of pairs whose sum equals to x. You
     * don't need to take any input or print anything.
     * 
     * Expected Time Complexity: O(n2).
     * Expected Auxiliary Space: O(1).
     * 
     * Constraints:
     * 1 ≤ mat1[i][j] , mat2[i][j] ≤ 105
     * 1 ≤ n ≤ 100
     * 1 ≤ x ≤ 105
     */
    public static void main(String[] args) {
        /*
         * In this problem, we have 2 matrices, and we need to calculate the number of
         * pairs whose sum equals k.
         */
        int n = 3;
        int x = 21;
        int[][] mat1 = { { 1, 5, 6 },
                { 8, 10, 11 },
                { 15, 16, 18 } };
        int[][] mat2 = { { 2, 4, 7 },
                { 9, 10, 12 },
                { 13, 16, 20 } };

        // System.out.println(countPairs(mat1, mat2, n, x));

        System.out.println("Here is the no. of pairs:->" + countpairs_Myself(mat1, mat2, n, x));
    }

    static int countpairs_Myself(int m1[][], int m2[][], int n, int x) {
        int count = 0;
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1.length; j++) {
                int sub = x - m1[i][j];
                for (int k = 0; k < m2.length; k++) {
                    for (int l = 0; l < m2.length; l++) {
                        if (sub == m2[k][l]) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;

        // int count=0;
        // Map<Integer, Integer> map = new HashMap<>();
        // for(int i=0;i<mat1.length;i++){
        //     for(int j=0;j<mat1[0].length;j++){
        //         map.put(mat1[i][j], mat1[i][j]);
        //     }
        // }
        //  for(int i=0;i<mat2.length;i++){
        //     for(int j=0;j<mat2[0].length;j++){
        //         int k =x-mat2[i][j];
        //         if(map.containsKey(k)){
        //             count++;
        //         }
            
        //     }
        // }
        // return count;
    }

    static int countPairs(int mat1[][], int mat2[][], int n, int x) {
        int count = 0;
        int row = 0, col = n - 1;
        int row2 = n - 1, col2 = 0;

        while (row < n && col >= 0 && row2 >= 0 && col2 < n) {
            int sum = mat1[row][col] + mat2[row2][col2];
            if (sum == x) {
                count++;
                col--;
                row2++;
            } else if (sum < x) {
                row++;
            } else {
                col2++;
            }
        }

        return count;
    }
}
