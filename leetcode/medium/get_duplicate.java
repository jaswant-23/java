package leetcode.medium;

import java.util.Arrays;

public class get_duplicate {
    public static void main(String[] args) {
        /*
         * 287. Find the Duplicate Number
         * Solved
         * Medium
         * Topics
         * Companies
         * 
         * Given an array of integers nums containing n + 1 integers where each integer
         * is in the range [1, n] inclusive.
         * 
         * There is only one repeated number in nums, return this repeated number.
         * 
         * You must solve the problem without modifying the array nums and uses only
         * constant extra space.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: nums = [1,3,4,2,2]
         * Output: 2
         * 
         * Example 2:
         * 
         * Input: nums = [3,1,3,4,2]
         * Output: 3
         * 
         * Example 3:
         * 
         * Input: nums = [3,3,3,3,3]
         * Output: 3
         * 
         * 
         * 
         * Constraints:
         * 
         * 1 <= n <= 105
         * nums.length == n + 1
         * 1 <= nums[i] <= n
         * All the integers in nums appear only once except for precisely one integer
         * which appears two or more times.
         */
        int[] arr={1,3,4,2,2};
        System.out.println(get_duplicate_ele(arr));
        
    }
    public static int get_duplicate_ele(int[] nums){
        for(int i=0;i<nums.length;i++){
            int ind = Math.abs(nums[i]);
            // System.out.print(ind+"-");
            if(nums[ind]<0){
                return ind;
            }
            nums[ind]=-nums[ind];
            System.out.println(Arrays.toString(nums));
        }
        return -1;
    }
}