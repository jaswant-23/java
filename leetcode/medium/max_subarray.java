package leetcode.medium;

public class max_subarray {
    /*
     * 152. Maximum Product Subarray
     * Solved
     * Medium
     * Topics
     * Companies
     * 
     * Given an integer array nums, find a
     * subarray
     * that has the largest product, and return the product.
     * 
     * The test cases are generated so that the answer will fit in a 32-bit integer.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [2,3,-2,4]
     * Output: 6
     * Explanation: [2,3] has the largest product 6.
     * 
     * Example 2:
     * 
     * Input: nums = [-2,0,-1]
     * Output: 0
     * Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
     * 
     * 
     * 
     * Constraints:
     * 
     * 1 <= nums.length <= 2 * 104
     * -10 <= nums[i] <= 10
     * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit
     * integer.
     * 
     */
    public static void main(String[] args) {
        int[] arr = { 2, 3, -2, 4 };
        System.out.println(max_multiple_subarrat(arr));
        int[] t={1,2,3,4};
        System.out.println(maximumProduct(t));
    }

    public static int max_multiple_subarrat(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int mul = 1;
            for (int j = i; j < arr.length; j++) {
                mul = mul * arr[j];
                ans = Math.max(ans, mul);
            }
        }
        return ans;
    }

    /*
     * 628. Maximum Product of Three Numbers
     * Easy
     * Topics
     * Companies
     * 
     * Given an integer array nums, find three numbers whose product is maximum and
     * return the maximum product.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [1,2,3]
     * Output: 6
     * 
     * Example 2:
     * 
     * Input: nums = [1,2,3,4]
     * Output: 24
     * 
     * Example 3:
     * 
     * Input: nums = [-1,-2,-3]
     * Output: -6
     * 
     * 
     * 
     * Constraints:
     * 
     * 3 <= nums.length <= 104
     * -1000 <= nums[i] <= 1000
     * 
     */
    public static int maximumProduct(int[] nums) {
        int ans = 0;
        int mul = 1;
        for (int i = 0; i < 3; i++) {
            mul = Math.abs(mul *= nums[i]);
        }
        ans = Math.max(ans, mul);
        int len = nums.length;
        if (nums.length > 3) {
            for (int i = 1; i <= nums.length-3; i++) {
                int prod = 1;
                // if(nums.length>3+1){
                    for (int j = i; j < 3 + i; j++) {
                        prod= Math.abs(prod *= nums[j]);
                    }
                // }
                ans = Math.max(ans, prod);
            }
        }
        return ans;
    }
}
