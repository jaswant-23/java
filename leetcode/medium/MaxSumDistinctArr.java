package leetcode.medium;

import java.util.ArrayList;
import java.util.HashSet;

public class MaxSumDistinctArr {
    /*
     * 2461. Maximum Sum of Distinct Subarrays With Length K Medium Topics Companies
     * Hint
     * 
     * You are given an integer array nums and an integer k. Find the maximum
     * subarray sum of all the subarrays of nums that meet the following conditions:
     * The length of the subarray is k, and All the elements of the subarray are
     * distinct. Return the maximum subarray sum of all the subarrays that meet the
     * conditions. If no subarray meets the conditions, return 0.
     * 
     * A subarray is a contiguous non-empty sequence of elements within an array.
     * Example 1:
     * 
     * Input: nums = [1,5,4,2,9,9,9], k = 3 Output: 15 Explanation: The subarrays
     * of nums with length 3 are: - [1,5,4] which meets the requirements and has a
     * sum of 10. - [5,4,2] which meets the requirements and has a sum of 11. -
     * [4,2,9] which meets the requirements and has a sum of 15. - [2,9,9] which
     * does not meet the requirements because the element 9 is repeated. - [9,9,9]
     * which does not meet the requirements because the element 9 is repeated. We
     * return 15 because it is the maximum subarray sum of all the subarrays that
     * meet the conditions
     * 
     * Example 2:
     * 
     * Input: nums = [4,4,4], k = 3 Output: 0 Explanation: The subarrays of nums
     * with length 3 are: - [4,4,4] which does not meet the requirements because
     * the element 4 is repeated. We return 0 because no subarrays meet the
     * conditions. Constraints:
     * 
     * 1 <= k <= nums.length <= 105 1 <= nums[i] <= 105
     * 
     */
    public static void main(String[] args) {
        int[] arr = { 1, 5, 4, 2, 9, 9, 9 };
        // int[] arr = {1,1,1,7,8,9 };
        // int[] arr = {4,4,4 };
        int k = 3;
        System.out.println(maxSumDistinctSubArr(arr, k));
        System.out.println(max_sum_Distnict_subArr_fun(arr, k));
    }
    /*
     * ArrayList<Integer> li = new ArrayList<>();
     * 
     * for(int i = 0;i<=n-k;i++){
     * int max = arr[i];
     * int j = i+1;
     * while(j<k+i){
     * // max = Math.max(max,arr[j]);
     * if(max<arr[j]){
     * max=arr[j];
     * }
     * j++;
     * }
     * li.add(max);
     * }
     * return li;
     */
    public static long maxSumDistinctSubArr(int[] nums, int k) {
        long max = 0;
        for (int i = 0; i <= nums.length - k; i++) {
            int count = i;
            ArrayList<Integer> li = new ArrayList<>();
            int sum = 0;
            while (count < k + i) {
                if (!li.contains(nums[count])) {
                    sum += nums[count];
                    li.add(nums[count]);
                } else {
                    break;
                }
                count++;
            }
            max = Math.max(max, sum);
        }
        return max;
    }

    public static long max_sum_Distnict_subArr_fun(int[] nums, int k) {
        long max = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i <= nums.length - k; i++) {
            set.clear();
            int sum = 0;
            boolean distinct = true;
            for (int j = i; j < i + k; j++) {
                if (!set.contains(nums[j])) {
                    set.add(nums[j]);
                    sum += nums[j];
                } else {
                    distinct = false;
                    break;
                }
            }
            if (distinct) {
                max = Math.max(max, sum);
            }
        }
        return max;
    }

}
