package leetcode.easy;

import leetcode.hard.firstPositve_val;

public class sum_of_xor {
    /*
     * 1863. Sum of All Subset XOR Totals
     * Easy
     * Topics
     * Companies
     * Hint
     * 
     * The XOR total of an array is defined as the bitwise XOR of all its elements,
     * or 0 if the array is empty.
     * 
     * For example, the XOR total of the array [2,5,6] is 2 XOR 5 XOR 6 = 1.
     * 
     * Given an array nums, return the sum of all XOR totals for every subset of
     * nums.
     * 
     * Note: Subsets with the same elements should be counted multiple times.
     * 
     * An array a is a subset of an array b if a can be obtained from b by deleting
     * some (possibly zero) elements of b.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [1,3]
     * Output: 6
     * Explanation: The 4 subsets of [1,3] are:
     * - The empty subset has an XOR total of 0.
     * - [1] has an XOR total of 1.
     * - [3] has an XOR total of 3.
     * - [1,3] has an XOR total of 1 XOR 3 = 2.
     * 0 + 1 + 3 + 2 = 6
     * 
     * Example 2:
     * 
     * Input: nums = [5,1,6]
     * Output: 28
     * Explanation: The 8 subsets of [5,1,6] are:
     * - The empty subset has an XOR total of 0.
     * - [5] has an XOR total of 5.
     * - [1] has an XOR total of 1.
     * - [6] has an XOR total of 6.
     * - [5,1] has an XOR total of 5 XOR 1 = 4.
     * - [5,6] has an XOR total of 5 XOR 6 = 3.
     * - [1,6] has an XOR total of 1 XOR 6 = 7.
     * - [5,1,6] has an XOR total of 5 XOR 1 XOR 6 = 2.
     * 0 + 5 + 1 + 6 + 4 + 3 + 7 + 2 = 28
     * 
     * Example 3:
     * 
     * Input: nums = [3,4,5,6,7,8]
     * Output: 480
     * Explanation: The sum of all XOR totals for every subset is 480.
     * 
     */
    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 6, 7, 8 };
        System.out.println(subsetXORSumgpt(arr));
        // subset_arr(arr);
        // System.out.println(1 ^ 3);
        // System.out.println(1 ^ 1);
        // System.out.println(subsetXORSum(arr));
    }

    public static int subsetXORSumgpt(int[] nums) {
        int n = nums.length;
        int totalSum = 0;

        // There are 2^n possible subsets
        int totalSubsets = 1 << n; // This is 2^n

        // Iterate over all possible subsets
        for (int subsetMask = 0; subsetMask < totalSubsets; subsetMask++) {
            int subsetXOR = 0;
            for (int i = 0; i < n; i++) {
                // Check if the i-th element is included in the subset
                if ((subsetMask & (1 << i)) != 0) {
                    subsetXOR ^= nums[i];
                }
            }
            totalSum += subsetXOR;
        }

        return totalSum;
    }

    // here is my aprach to get the
    public static int get_xor_subset(int[] arr) {
        int sum = 0;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum ^ arr[i];
            ans += arr[i];
        }
        ans += sum;
        // System.out.println(ans);
        // System.out.println(sum);
        if (arr.length > 2) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    ans += (arr[i] ^ arr[j]);
                    // System.out.println(ans);
                }
            }
        }
        // iner subset
        return ans;
    }

    // 0+1+3+2
    public static void subset_arr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println(arr[i] + " " + arr[j] + " ");
            }
        }
    }

    public static int subsetXORSum(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            sum += nums[i] + (nums[i] ^ nums[i + 1]);
        }
        return sum;
    }
}
