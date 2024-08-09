package leetcode.medium;

import java.util.Arrays;

import gfg.easy.largestSumsubarr;

public class longest_consucutinve_seq {
    /*
     * 128. Longest Consecutive Sequence
     * Medium
     * Topics
     * Companies
     * 
     * Given an unsorted array of integers nums, return the length of the longest
     * consecutive elements sequence.
     * 
     * You must write an algorithm that runs in O(n) time.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [100,4,200,1,3,2]
     * Output: 4
     * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4].
     * Therefore its length is 4.
     * 
     * Example 2:
     * 
     * Input: nums = [0,3,7,2,5,8,4,6,0,1]
     * Output: 9
     * 
     * 
     * 
     * Constraints:
     * 
     * 0 <= nums.length <= 105
     * -109 <= nums[i] <= 109
     * 
     */
    public static void main(String[] args) {
        int[] arr={1,2,3,4,1};
        int dup1=0,dup2=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    dup1=i;
                    dup2=j;
                }
            }
        }
        if(dup1!=0 || dup2!=0){
            System.out.println(dup1+"---"+dup2);
        }else{
            System.out.println(-1);
        }







        // int[] arr = { 100, 4, 200, 3, 2, 1 };
        // int[] arr = { 0,3,7,2,5,8,4,6,0,1 };
        // System.out.println(get_max_consucutive_seq(arr));
        // System.out.println(get_long_cosuctive_seq(arr));
    }
    // best sol 
    public static int get_long_cosuctive_seq(int[] arr){
        int n = arr.length;
        if(n==0)return 0;

        Arrays.sort(arr);
        int small =Integer.MAX_VALUE;
        int cnt=0;
        int longest=1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]-1==small){
                cnt+=1;
                small=arr[i];
            }else if(arr[i]!=small){
                cnt=1;
                small=arr[i];
            }
            longest = Math.max(cnt, longest);
        }
        return longest;
    }
    public static boolean linearSearch(int[] arr,int x){
        for (int i : arr) {
            if(i==x){
                return true;
            }
        }
        return false;
    }
    public static int get_max_consucutive_seq(int[] arr){
        int maxLen=1;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int x=arr[i];
            int count =1;

            while(linearSearch(arr, x+1)){
                x+=1;
                count+=1;
            }
            maxLen=Math.max(maxLen, count);
        }
    return maxLen;
    }   
}
