package gfg.hard.hard;

public class max_sum_Circular_subArr {
    /*
     * Max Circular Subarray Sum
     * HardAccuracy: 29.37%Submissions: 100K+Points: 8
     * 
     * Find better job opportunities this summer via Job-A-Thon Hiring Challenge!
     * banner
     * 
     * Given an array arr[] of N integers arranged in a circular fashion. Your task
     * is to find the maximum contiguous subarray sum.
     * 
     * 
     * Example 1:
     * 
     * Input:
     * N = 7
     * arr[] = {8,-8,9,-9,10,-11,12}
     * Output:
     * 22
     * Explanation:
     * Starting from the last element
     * of the array, i.e, 12, and
     * moving in a circular fashion, we
     * have max subarray as 12, 8, -8, 9,
     * -9, 10, which gives maximum sum
     * as 22.
     * 
     * Example 2:
     * 
     * Input:
     * N = 8
     * arr[] = {10,-3,-4,7,6,5,-4,-1}
     * Output:
     * 23
     * Explanation: Sum of the circular
     * subarray with maximum sum is 23
     * 
     * 
     * Your Task:
     * The task is to complete the function circularSubarraySum() which returns a
     * sum of the circular subarray with maximum sum.
     * 
     * 
     * Expected Time Complexity: O(N).
     * Expected Auxiliary Space: O(1).
     * 
     * 
     * Constraints:
     * 1 <= N <= 106
     * -106 <= Arr[i] <= 106
     */
    public static void main(String[] args) {
        int[] arr ={8,-8,9,-9,10,-11,12};
        System.out.println(get_max_sumCircular_subarr(arr));
    }
    public static getMax_SubArr_circular(int[] arr){
        int max=0;
        int i =arr.length-1,j=0;
        int sum =0;
        while(i>=0 && j<arr.length){
            max=Math.max(sum,max);
            if()
        }
    }





    // It take 0(n^2)
    public static int get_max_sumCircular_subarr(int[] arr){
        int max=0;
        for (int i = arr.length-1; i >=0; i--) {
            int sum = arr[i];
            for (int j = 0; j < i; j++) {
                sum+=arr[j];
                max=Math.max(max, sum);
            }
        }
        return max;
    }
}
