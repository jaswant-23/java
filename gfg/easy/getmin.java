package gfg.easy;

import java.util.*;


public class getmin {
    /*
     * Minimize the Heights II
     * MediumAccuracy: 15.06%Submissions: 545K+Points: 4
     * 
     * Share your experience with the world! Submit your admission, interview,
     * campus or any other experience and reach an audience of millions today!
     * banner
     * 
     * Given an array arr[] denoting heights of N towers and a positive integer K.
     * 
     * For each tower, you must perform exactly one of the following operations
     * exactly once.
     * 
     * Increase the height of the tower by K
     * Decrease the height of the tower by K
     * 
     * Find out the minimum possible difference between the height of the shortest
     * and tallest towers after you have modified each tower.
     * 
     * You can find a slight modification of the problem here.
     * Note: It is compulsory to increase or decrease the height by K for each
     * tower. After the operation, the resultant array should not contain any
     * negative integers.
     * 
     * Example 1:
     * 
     * Input:
     * K = 2, N = 4
     * Arr[] = {1, 5, 8, 10}
     * Output:
     * 5
     * Explanation:
     * The array can be modified as
     * {1+k, 5-k, 8-k, 10-k} = {3, 3, 6, 8}.
     * The difference between
     * the largest and the smallest is 8-3 = 5.
     * 
     * Example 2:
     * 
     * Input:
     * K = 3, N = 5
     * Arr[] = {3, 9, 12, 16, 20}
     * Output:
     * 11
     * Explanation:
     * The array can be modified as
     * {3+k, 9+k, 12-k, 16-k, 20-k} -> {6, 12, 9, 13, 17}.
     * The difference between
     * the largest and the smallest is 17-6 = 11.
     * 
     * Your Task:
     * You don't need to read input or print anything. Your task is to complete the
     * function getMinDiff() which takes the arr[], n, and k as input parameters and
     * returns an integer denoting the minimum difference.
     * 
     * Expected Time Complexity: O(N*logN)
     * Expected Auxiliary Space: O(N)
     * 
     * Constraints
     * 1 ≤ K ≤ 109
     * 1 ≤ N ≤ 105
     * 1 ≤ Arr[i] ≤ 109
     */
    public static void main(String[] args) {
        int K = 1, N = 4;
        int[] Arr = { 7 ,7 ,3 ,5 };

        /*
         * 2
         * 4
         * 1 5 8 10
         */
        System.out.println(getMinDiff(Arr, N, K));

        System.out.println(getMinDiffMyself(Arr, N, K));
        // getMinDiff(Arr, N, K);
    }

    public static int getMinDiffMyself(int[] arr,int n,int k){
        Arrays.sort(arr);
        
        int ans = arr[n-1]=arr[0];

        int small = arr[0]+k;
        int large = arr[n-1]-k;
        int m1,m2;

        for (int i = 0; i < arr.length-1; i++) {
            m1 = Math.min(small,(arr[i+1]-k));
            m2 = Math.max(large, arr[i]+k);
            if(m1<0){
                continue;
            }
            ans = Math.min(ans,(m2-m1));
        }
        return ans;
    }

    public static int getMinDiff(int[] arr, int n, int k) {
        ArrayList<Integer> li = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] < k) {
                li.add(arr[i] + k);
            } else if (arr[i] > k) {
                li.add(arr[i] - k);
            } else {
                li.add(arr[i]);
            }
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < li.size(); i++) {
            if (li.get(i) > max) {
                max = li.get(i);
            }
            if (li.get(i) < min) {
                min = li.get(i);
            }
        }

        // System.out.println(max+"-->"+min);
        return max-min;
    }
}
