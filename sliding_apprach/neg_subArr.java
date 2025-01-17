package sliding_apprach;

import java.util.Arrays;

public class neg_subArr {

    /*
     * First negative integer in every window of size k
     * MediumAccuracy: 48.61%Submissions: 146K+Points: 4
     * 
     * Find better job opportunities this summer via Job-A-Thon Hiring Challenge!
     * banner
     * 
     * Given an array A[] of size N and a positive integer K, find the first
     * negative integer for each and every window(contiguous subarray) of size K.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input :
     * N = 5
     * A[] = {-8, 2, 3, -6, 10}
     * K = 2
     * Output :
     * -8 0 -6 -6
     * Explanation :
     * First negative integer for each window of size k
     * {-8, 2} = -8
     * {2, 3} = 0 (does not contain a negative integer)
     * {3, -6} = -6
     * {-6, 10} = -6
     * 
     * 
     * Example 2:
     * 
     * Input :
     * N = 8
     * A[] = {12, -1, -7, 8, -15, 30, 16, 28}
     * K = 3
     * Output :
     * -1 -1 -7 -15 -15 0
     * 
     * 
     * 
     * Your Task:
     * You don't need to read input or print anything. Your task is to complete the
     * function printFirstNegativeInteger() which takes the array A[], its size N
     * and an integer K as inputs and returns the first negative number in every
     * window of size K starting from the first till the end. If a window does not
     * contain a negative integer , then return 0 for that window.
     * 
     * 
     * Expected Time Complexity: O(N)
     * Expected Auxiliary Space: O(K)
     * 
     * Constraints:
     * 1 <= N <= 105
     * -105 <= A[i] <= 105
     * 1 <= K <= N
     */
    public static void main(String[] args) {
        int[] arr = { -8, 2, 3, -6, 10 };
        int k = 2;
        System.out.println(Arrays.toString(sub_arr_k_eng(arr, k)));
    }

    public static long[] sub_arr_k_eng(int[] arr, int k) {
        long[] ans = new long[arr.length];
        int c = 0;
        for (int i = 0; i < ans.length - k+1; i++) {
            for (int j = i; j < k + i; j++) {
                if (arr[j] < 0) {
                    ans[c] = arr[j];
                    c++;
                }
                ans[c] = 0;
                c++;
            }
        }
        return ans;
    }
}
