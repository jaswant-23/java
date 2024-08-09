package gfg.potd;

import java.util.Arrays;

public class paliindrome_arr_row_col {
    /*
     * Back to Explore Page
     * The Palindrome Pattern
     * Difficulty: HardAccuracy: 56.31%Submissions: 3K+Points: 8
     * 
     * Given a two-dimensional integer array arr of dimensions n x n, consisting
     * solely of zeros and ones, identify the row or column (using 0-based indexing)
     * where all elements form a palindrome. If multiple palindromes are identified,
     * prioritize the palindromes found in rows over those in columns. Within rows
     * or columns, the palindrome with the smaller index takes precedence. The
     * result should be represented by the index followed by either 'R' or 'C',
     * indicating whether the palindrome was located in a row or column. The output
     * should be space-separated. If no palindrome is found, return the string -1.
     * 
     * Examples:
     * 
     * Input:
     * arr[][] = [[1, 0, 0],
     * [0, 1, 0],
     * [1, 1, 0]]
     * Output: 1 R
     * Explanation: In the first test case, 0-1-0 is a palindrome
     * occuring in a row having index 1.
     * 
     * Input:
     * arr[][] = [[1, 0],
     * [1, 0]]
     * Output: 0 C
     * Explanation: 1-1 occurs before 0-0 in the 0th column. And there is no
     * palindrome in the two rows.
     * 
     * Expected Time Complexity: O(n2)
     * Expected Auxiliary Space: O(1)
     * 
     * Constraints:
     * 1<= arr.size <= 50
     * 0 <= arr[i][j] <= 1
     */
    public static void main(String[] args) {
        // int[][] arr = { { 1, 0, 0 }, { 0, 1, 0 }, { 1, 1, 0 } };
        int[][] arr = { { 1, 0 }};
        System.out.println(pattern(arr));

    }

    public static String pattern(int[][] arr) {
        // Code here
        String ans = "";
        int index = 0;
        for (int[] a : arr) {
            // String s1 = Arrays.toString(a);
            String s1 = "";
            for (int i : a) {
                s1 += i;
            }
            System.out.println("Here is the s1 " + s1);
            if (Str_palindrome(s1)) {
                ans = index + " R";
                break;
            }
            index++;
        }
        if (ans == "") {

            index = 0;
            for (int j = 0; j < arr.length; j++) {
                String s2 = "";
                for (int i = 0; i < arr.length; i++) {
                    s2 += arr[i][j];
                }
                if (Str_palindrome(s2)) {
                    ans = index + " C";
                }
            }
        }
        return ans;
    }

    public static boolean Str_palindrome(String s) {
        int f = 0, e = s.length() - 1;
        while (f < e) {
            if (s.charAt(f) != s.charAt(e)) {
                return false;
            }
            f++;
            e--;
        }
        return true;
    }
}
