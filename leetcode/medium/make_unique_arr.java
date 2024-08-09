package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;

public class make_unique_arr {
    /*
     * 945. Minimum Increment to Make Array Unique
     * Medium
     * Topics
     * Companies
     * 
     * You are given an integer array nums. In one move, you can pick an index i
     * where 0 <= i < nums.length and increment nums[i] by 1.
     * 
     * Return the minimum number of moves to make every value in nums unique.
     * 
     * The test cases are generated so that the answer fits in a 32-bit integer.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [1,2,2]
     * Output: 1
     * Explanation: After 1 move, the array could be [1, 2, 3].
     * 
     * Example 2:
     * 
     * Input: nums = [3,2,1,2,1,7]
     * Output: 6
     * Explanation: After 6 moves, the array could be [3, 4, 1, 2, 5, 7].
     * It can be shown with 5 or less moves that it is impossible for the array to
     * have all unique values.
     * 
     * 
     * 
     * Constraints:
     * 
     * 1 <= nums.length <= 105
     * 0 <= nums[i] <= 105
     * 
     */
    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 2, 1, 7 };
        // int[] arr = { 1, 2, 2 };
        // System.out.println(get_min_step_make_uniqueArr(arr));
        System.out.println(best_easyAprach(arr));
    }

    public static int best_easyAprach(int[] nums) {
        Arrays.sort(nums);
        int step = 0, moves = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                step = Math.abs((nums[i - 1] + 1) - nums[i]);
                moves += step;
                nums[i] += step;
            }
        }
        System.out.println(Arrays.toString(nums));
        return moves;
    }

    public static int get_min_step_make_uniqueArr(int[] arr) {
        ArrayList<Integer> li = new ArrayList<>();
        int step = 0;
        for (int i = 0; i < arr.length; i++) {
            if (li.contains(arr[i])) {
                int val = arr[i];
                while (li.contains(val)) {
                    step++;
                    val++;
                }
                li.add(val);
            } else {
                li.add(arr[i]);
            }
        }

        // for(int i : arr)li.add(i);
        // int step = 0;
        // for (int i = 0; i < arr.length; i++) {
        // if (li.contains(arr[i])) {
        // while (li.contains(arr[i]) == true) {
        // li.add(arr[i] + 1);
        // step++;
        // }
        // } else {
        // li.add(arr[i]);
        // }
        // }
        return step;
    }
}
