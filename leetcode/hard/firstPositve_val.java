package leetcode.hard;

import java.util.Arrays;

public class firstPositve_val {
    /*
     * 41. First Missing Positive
     * Hard
     * Topics
     * Companies
     * Hint
     * 
     * Given an unsorted integer array nums. Return the smallest positive integer
     * that is not present in nums.
     * 
     * You must implement an algorithm that runs in O(n) time and uses O(1)
     * auxiliary space.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [1,2,0]
     * Output: 3
     * Explanation: The numbers in the range [1,2] are all in the array.
     * 
     * Example 2:
     * 
     * Input: nums = [3,4,-1,1]
     * Output: 2
     * Explanation: 1 is in the array but 2 is missing.
     * 
     * Example 3:
     * 
     * Input: nums = [7,8,9,11,12]
     * Output: 1
     * Explanation: The smallest positive integer 1 is missing.
     * 
     * 
     * 
     * Constraints:
     * 
     * 1 <= nums.length <= 105
     * -231 <= nums[i] <= 231 - 1
     * 
     */
    public static void main(String[] args) {
        int[] arr = {7,8,9,11,12};

        System.out.println(firstMissingPositive(arr));

    }
    public static  int firstMissingPositive(int[] arr) {
        Arrays.sort(arr);
        int count=1;
        if(arr[0]<=1){
          count =arr[0];
        }else{
            count = 1;
        }
        for(int i =0;i<arr.length;i++){
            if(arr[i]!=count){
                return count;
            }
            count++;
            if(count==0){
                count++;
            }
        }

    return count;
    }
}
