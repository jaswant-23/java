package leetcode.easy;

import java.util.Arrays;

public class freq_arr {
    /*
     * 1636. Sort Array by Increasing Frequency
     * Easy
     * Topics
     * Companies
     * Hint
     * 
     * Given an array of integers nums, sort the array in increasing order based on
     * the frequency of the values. If multiple values have the same frequency, sort
     * them in decreasing order.
     * 
     * Return the sorted array.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [1,1,2,2,2,3]
     * Output: [3,1,1,2,2,2]
     * Explanation: '3' has a frequency of 1, '1' has a frequency of 2, and '2' has
     * a frequency of 3.
     * 
     * Example 2:
     * 
     * Input: nums = [2,3,1,3,2]
     * Output: [1,3,3,2,2]
     * Explanation: '2' and '3' both have a frequency of 2, so they are sorted in
     * decreasing order.
     * 
     * Example 3:
     * 
     * Input: nums = [-1,1,-6,4,5,-6,1,4,1]
     * Output: [5,-1,4,4,-6,-6,1,1,1]
     * 
     * 
     * 
     * Constraints:
     * 
     * 1 <= nums.length <= 100
     * -100 <= nums[i] <= 100
     * 
     */
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 2, 3 };
        int[] ans = frequencySort(arr);
        System.out.println(Arrays.toString(ans));

    }

    public static int[] frequencySort(int[] nums) {
        int[] freq = new int[100];
        int max = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                freq[nums[i]]++;
                if (max < nums[i]) {
                    max = nums[i];
                }
            }
        }
        // System.out.println(Arrays.toString(freq));
        int c = 0;
        for (int i = max; i >= 0; i--) {
            if (freq[i] > 0) {
                for (int j = 0; j < freq[i]; j++) {
                    nums[c++] = i;
                }
            }
        }
        return nums;
    }
}
