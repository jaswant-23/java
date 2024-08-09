package gfg.potd;

public class bitwiseAND {
    /*
     * Sum of Products
     * MediumAccuracy: 46.84%Submissions: 8K+Points: 4
     * 
     * Given an array arr[] of size n. Calculate the sum of Bitwise ANDs ie:
     * calculate sum of arr[i] & arr[j] for all the pairs in the given array arr[]
     * where i < j.
     * 
     * Example 1:
     * 
     * Input:
     * n = 3
     * arr = {5, 10, 15}
     * Output:
     * 15
     * Explanation:
     * The bitwise Ands of all pairs where i<j are (5&10) = 0, (5&15) = 5 and
     * (10&15) = 10.
     * Therefore, the total sum = (0+5+10) = 15.
     * 
     * Example 2:
     * 
     * Input:
     * n = 4
     * arr = {10, 20, 30, 40}
     * Output:
     * 46
     * Explanation:
     * The sum of bitwise Ands
     * of all pairs = (0+10+8+20+0+8) = 46.
     * 
     * Your Task:
     * You don't need to read input or print anything.Your Task is to complete the
     * function pairAndSum() which takes an Integer n and an array arr[] of size n
     * as input parameters and returns the sum of bitwise Ands of all pairs.
     * 
     * Expected Time Complexity:O(n)
     * Expected Auxillary Space:O(1)
     * 
     * Constraints:
     * 1 <= n <= 105
     * 1 <= arr[i] <= 108
     */
    public static void main(String[] args) {
        long[] arr = { 5, 10, 15 };
        System.out.println(pairAndSum(arr.length, arr));
    }

    public static long pairAndSum(long n, long arr[]) {
        // code here
        long sum = 0;

        // It nice but it get time Limit Exced at 1089 test Cases;
        // for(int i =0;i<n;i++){
        // for (int j = i+1; j < arr.length; j++) {
        // if(i<j){
        // sum+=(arr[i]&arr[j]);
        // }
        // }
        // }
        int s = 0;
        int e = 1;

        for (int i = 0; i < arr.length; i++) {
            int j=i+1;
            if(i<j){
                sum+=(arr[i]&arr[j]);
            }
        }
        return sum;
    }
}
