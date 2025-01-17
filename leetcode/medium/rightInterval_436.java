package leetcode.medium;

import java.util.Arrays;

public class rightInterval_436 {
    /*
     * 436. Find Right Interval
     * Medium
     * Topics
     * Companies
     * 
     * You are given an array of intervals, where intervals[i] = [starti, endi] and
     * each starti is unique.
     * 
     * The right interval for an interval i is an interval j such that startj >=
     * endi and startj is minimized. Note that i may equal j.
     * 
     * Return an array of right interval indices for each interval i. If no right
     * interval exists for interval i, then put -1 at index i.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: intervals = [[1,2]]
     * Output: [-1]
     * Explanation: There is only one interval in the collection, so it outputs -1.
     * 
     * Example 2:
     * 
     * Input: intervals = [[3,4],[2,3],[1,2]]
     * Output: [-1,0,1]
     * Explanation: There is no right interval for [3,4].
     * The right interval for [2,3] is [3,4] since start0 = 3 is the smallest start
     * that is >= end1 = 3.
     * The right interval for [1,2] is [2,3] since start1 = 2 is the smallest start
     * that is >= end2 = 2.
     * 
     * Example 3:
     * 
     * Input: intervals = [[1,4],[2,3],[3,4]]
     * Output: [-1,2,-1]
     * Explanation: There is no right interval for [1,4] and [3,4].
     * The right interval for [2,3] is [3,4] since start2 = 3 is the smallest start
     * that is >= end1 = 3.
     */
    public static void main(String[] args) {
        int[][] arr = { { 3, 4 }, { 2, 3 }, { 1, 2 } };
        System.out.println(Arrays.toString(findRightInterval(arr)));

    }

    public static int[] findRightInterval(int[][] intervals) {
        int[] arr = new int[intervals.length];
        arr[0] = -1;
        int c = 1;
        int n = intervals.length;
        if (intervals.length == 1) {
            return arr;
        }
        int[] temp = intervals[0];
        boolean check = true;
        for (int[] i : intervals) {
            if (check) {
                check = false;
            } else {
                if (temp[0] >= i[i.length - 1]) {
                    arr[c++] = 0;
                } else {
                    arr[c++] = -1;
                }
                temp = i;
            }
        }
        return arr;
    }
}
