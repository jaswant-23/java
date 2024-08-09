package leetcode.medium;

import java.util.Arrays;

public class max_sum_subArr_non_Overlaping {
    // Leetcode 1546 :- Max number of subarray whose sum is equal to the target with Non_Overlaping 

    public static void main(String[] args) {
        // int[] arr = {1,1,1,1,1};
        int[] arr = {-1,3,5,1,4,2,-9};
        int target = 6;
        System.out.println(max_sum_subArr_non_Overlaping_fun(arr,target));
        int arr1[] = maxSlidingWindow(arr,3);
        System.out.println(Arrays.toString(arr1));
    }
    public static int max_sum_subArr_non_Overlaping_fun(int[] arr,int k){
        
        int count=0;
        int lastEnd =0;
        int i=0; // different approach
        for (; i < arr.length; i++) {
            int sum =0;
            for (int j = i; j < arr.length; j++) {
                sum+=arr[j];
                if(sum==k){
                    if(lastEnd<i){
                        count++;
                        lastEnd=j;
                    }
                    break;
                }
            }
        }
        return count;
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return new int[0];
        }

        int n = nums.length;
        int[] result = new int[n - k + 1];

        for (int i = 0; i <= n - k; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i; j < i + k; j++) {
                max = Math.max(max, nums[j]);
            }
            result[i] = max;
        }

        return result;
    }
}
