package gfg.easy;

public class max_sum_k_negation {
    /*
     * Maximize sum after K negations
     * EasyAccuracy: 24.75%Submissions: 72K+Points: 2
     * 
     * Matrix Partners India: Exclusive Job-A-Thon | Apply to 15+ Companies via 1
     * Hiring Challenge | Contest LIVE right now!
     * banner
     * 
     * Given an array of integers of size N and a number K., You must modify array
     * arr[] exactly K number of times. Here modify array means in each operation
     * you can replace any array element either arr[i] by -arr[i] or -arr[i] by
     * arr[i]. You need to perform this operation in such a way that after K
     * operations, the sum of the array must be maximum.
     * 
     * 
     * Example 1:
     * 
     * Input:
     * N = 5, K = 1
     * arr[] = {1, 2, -3, 4, 5}
     * Output:
     * 15
     * Explanation:
     * We have k=1 so we can change -3 to 3 and
     * sum all the elements to produce 15 as output.
     * 
     * Example 2:
     * 
     * Input:
     * N = 10, K = 5
     * arr[] = {5, -2, 5, -4, 5, -12, 5, 5, 5, 20}
     * Output:
     * 68
     * Explanation:
     * Here we have k=5 so we turn -2, -4, -12 to
     * 2, 4, and 12 respectively. Since we have
     * performed 3 operations so k is now 2. To get
     * maximum sum of array we can turn positive
     * turned 2 into negative and then positive
     * again so k is 0. Now sum is
     * 5+5+4+5+12+5+5+5+20+2 = 68
     * 
     * 
     * Your Task:
     * You don't have to print anything, printing is done by the driver code itself.
     * You have to complete the function maximizeSum() which takes the array A[],
     * its size N, and an integer K as inputs and returns the maximum possible sum.
     * 
     * Constraints:
     * 1 ≤ N,K ≤ 105
     * -109 ≤ Ai ≤ 109
     * 
     * Expected Time Complexity: O(N*logN)
     * Expected Auxiliary Space: O(1)
     */
    public static void main(String[] args) {
        // int[] arr = {5, -2, 5, -4, 5, -12, 5, 5, 5, 20};
        int[] arr = {1, 2, 3, 4, 5};
        int k=5;
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0){
                arr[i]=arr[i]*(-1);
                k--;
            }
            sum+=arr[i];
        }
        if(k%2!=0){
            int min =Integer.MAX_VALUE;
            for (int i : arr) {
                if(min>i){
                    min =i;
                }
            }
            sum-=min;
        }
        System.out.println("Final ans:->"+sum);
    }
}
