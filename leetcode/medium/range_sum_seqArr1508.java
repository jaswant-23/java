package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class range_sum_seqArr1508 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int n = 4, left = 3, right = 4;
        System.out.println(rangeSum(arr, n, left, right));
    }

    public static int rangeSum(int[] arr, int n, int left, int right) {
        int[] temp = new int[n*(n+1)/2];
        int c=0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                temp[c++]=sum;
            }
        }
        int sum = 0;
        Arrays.sort(temp);
        System.out.println(Arrays.toString(temp));
        for (int i = left-1; i < right; i++) {
                sum+=temp[i];
                sum%=1000000007;
        }
        return sum;
    }
}
