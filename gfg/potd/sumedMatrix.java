package gfg.potd;

import java.util.ArrayList;

import gfg.easy.ArraysList;
import gfg.easy.count;

public class sumedMatrix {
    /*
     * Summed Matrix
     * Difficulty: EasyAccuracy: 46.76%Submissions: 34K+Points: 2
     * 
     * A matrix is constructed of size n*n and given an integer ‘q’. The value at
     * every cell of the matrix is given as, M(i,j) = i+j, where ‘M(i,j)' is the
     * value of a cell, ‘i’ is the row number, and ‘j’ is the column number. Return
     * the number of cells having value ‘q’.
     * 
     * Note: Assume, the array is in 1-based indexing.
     * 
     * Examples:
     * 
     * Input: n = 4, q = 7
     * Output: 2
     * Explanation: Matrix becomes
     * 2 3 4 5
     * 3 4 5 6
     * 4 5 6 7
     * 5 6 7 8
     * The count of 7 is 2.
     * 
     * Input: n = 5, q = 4
     * Output: 3
     * Explanation: Matrix becomes
     * 2 3 4 5 6
     * 3 4 5 6 7
     * 4 5 6 7 8
     * 5 6 7 8 9
     * 6 7 8 9 10
     * The count of 4 is 3.
     * 
     * Expected Time Complexity: O(1)
     * Expected Auxiliary Space: O(1)
     * 
     * Constraints:
     * 1 ≤ n,q ≤ 1018
     */
    public static void main(String[] args) {
        int n = 4, q = 7;
        // System.out.println(get_summed_matrix_Occur_q(n, q));
        System.out.println(get_sumed_occur_q(n, q));
    }

    public static long get_sumed_occur_q(long n, long q) {
        long count =0;
        // ArrayList<ArrayList<Long>> li = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            // ArrayList<Long> ltmp = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                // long sum = i+j+2;
                // ltmp.add(sum);
                if((i+j+2) ==q){
                    count++;
                }
            }
            // li.add(ltmp);
        }

        // System.out.println(li);
        return count;

    }

    public static int get_summed_matrix_Occur_q(int n, int q) {
        int[][] summed = new int[n][n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                summed[i][j] = i + j + 2;
            }
        }

        for (int[] is : summed) {
            for (int is2 : is) {
                if (is2 == q) {
                    count++;
                }
            }
        }
        return count;
    }
}
