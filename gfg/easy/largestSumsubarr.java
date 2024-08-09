package gfg.easy;


public class largestSumsubarr {
    /*
     * Largest subarray with 0 sum
     * MediumAccuracy: 41.84%Submissions: 266K+Points: 4
     * 
     * 200+ people shotlisted last month for SDE Internship. Grab your spot this
     * month via GfG Weekly Contest!
     * banner
     * 
     * Given an array having both positive and negative integers. The task is to
     * compute the length of the largest subarray with sum 0.
     * 
     * Example 1:
     * 
     * Input:
     * N = 8
     * A[] = {15,-2,2,-8,1,7,10,23}
     * Output: 5
     * Explanation: The largest subarray with
     * sum 0 will be -2 2 -8 1 7.
     * 
     * Your Task:
     * You just have to complete the function maxLen() which takes two arguments an
     * array A and n, where n is the size of the array A and returns the length of
     * the largest subarray with 0 sum.
     * 
     * Expected Time Complexity: O(N).
     * Expected Auxiliary Space: O(N).
     * 
     * Constraints:
     * 1 <= N <= 105
     * -1000 <= A[i] <= 1000, for each valid i
     */

     public static void main(String[] args) {
        int[] A = {15,-2,2,-8,1,7,10,23};
        System.out.println(minSumSubArr(A));
     }

     public static int minSumSubArr(int[] arr){
        int n = arr.length;
        int sum = 0;
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            sum =arr[i];
           for (int j = i+1; j < arr.length; j++) {
               sum+=arr[j];
               count++;
               if(sum>=0){ 
                i=n;
                break;
               }
           }

        }
        return count;
     }
}
