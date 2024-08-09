package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class merge_Interval {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] arr={1,2,3,0,1,3,5};
        int[] anst = Arrays.copyOf(arr, arr.length);
        Arrays.sort(anst);
        System.out.println(Arrays.toString(anst));
        int mar[][] = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        // int temp[] = new int[2];
        // temp = mar[0];
        // ArrayList<Integer> li = new ArrayList<>();
        // int m = mar.length;
        // int n = mar[0].length;
        // for (int i = 1; i < m; i++) {
        //     int t1[] = new int[2];
        //     t1 = get_minmax(mar[i]);
        //     li.add(t1[0]);
        //     li.add(t1[1]);
        // }
        // System.out.println(li);
        int[][] ans = merge(mar);
        for(int i[]: ans){
            System.out.println(Arrays.toString(i));
        }

    }

    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return new int[][] {};
        }

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> merged = new ArrayList<>();
        int[] current = intervals[0];
        System.out.println(Arrays.toString(current));
        for (int i = 1; i < intervals.length; i++) {
            if (current[1] >= intervals[i][0]) {
                current[1] = Math.max(current[1], intervals[i][1]);
            } else {
                merged.add(current);
                System.out.println(merged);
                current = intervals[i];
            }
        }

        merged.add(current);
        return merged.toArray(new int[merged.size()][]);
    }

    public static int[] get_minmax(int[] arr) {
        int[] ans = new int[2];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        ans[0] = min;
        ans[1] = max;
        return ans;
    }
}
