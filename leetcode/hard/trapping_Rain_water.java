package leetcode.hard;

import java.util.Arrays;

public class trapping_Rain_water {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 9, 5, 1, 3, 2, 6 };
        // System.out.println(get_trapping_water_ammount(arr,arr.length));
        System.out.println(get_Ammount_of_Rain(arr, arr.length));
    }

    public static int get_Ammount_of_Rain(int[] arr, int n) {
        int[] leftArr = new int[n];
        int[] rightArr = new int[n];
        int c = 0;
        leftArr[0] = arr[0];
        for (int i = 1; i < rightArr.length; i++) {
            leftArr[i] = Math.max(leftArr[i - 1], arr[i]);
        }
        c = n - 1;
        rightArr[c] = arr[c];
        for (int i = n - 2; i >= 0; i--) {
            rightArr[i] = Math.max(rightArr[i + 1], arr[i]);
        }
        int ans = 0;
        for (int i = 0; i < rightArr.length; i++) {
            ans += (Math.min(leftArr[i], rightArr[i]) - arr[i]);
        }
        return ans;
    }

    public static long get_trapping_water_ammount(int arr[], int n) {

        // The Question is Very easy to solve
        // 1. fill the an arr to take greatest height of block from starting to ending
        // 2.Full the an arr to take greatest height of block from ending to starting
        // and also write from left ot right
        // 3. Final answer : aply_> ans = ans+(Math.min(right[i],left[i])-arr[i]); then
        // return ans final total
        // Quantiity of water
        // First step:
        int[] rightarr = new int[n];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            rightarr[i] = max;
        }
        System.out.println("Right_arr:->" + Arrays.toString(rightarr));
        // 2 steps
        int[] leftarr = new int[n];
        max = Integer.MIN_VALUE;
        for (int i = (n - 1); i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
            }
            leftarr[i] = max;
        }
        System.out.println("Left_aArr:->" + Arrays.toString(leftarr));
        // 3rd step final answer
        long ans = 0;
        for (int i = 0; i < n - 1; i++) {
            ans = ans + (Math.min(rightarr[i], leftarr[i]) - arr[i]);
        }
        return ans;
    }
}
