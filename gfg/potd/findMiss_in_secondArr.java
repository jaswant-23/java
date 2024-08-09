package gfg.potd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import gfg.easy.ArraysList;

public class findMiss_in_secondArr {
    /*
     * Find missing in second array
     * MediumAccuracy: 35.22%Submissions: 62K+Points: 4
     * 
     * Fast-Track your resumes to top tech companies and get the job you deserve!
     * Register for Job-A-Thon Hiring Challenge
     * banner
     * 
     * Given two arrays a of size n and b of size m, the task is to find numbers
     * which are present in the first array, but not present in the second array.
     * 
     * Example 1:
     * 
     * Input:
     * n = 6, m = 5
     * a[] = {1, 2, 3, 4, 5, 10}
     * b[] = {2, 3, 1, 0, 5}
     * Output:
     * 4 10
     * Explanation:
     * 4 and 10 are present in first array, but not in second array.
     * 
     * Example 2:
     * 
     * Input:
     * n = 5, m = 5
     * a[] = {4, 3, 5, 9, 11}
     * b[] = {4, 9, 3, 11, 10}
     * Output:
     * 5
     * Explanation:
     * Second array does not contain element 5.
     * 
     * Your Task:
     * This is a function problem. You don't need to take any input, as it is
     * already accomplished by the driver code. You just need to complete the
     * function findMissing() that takes array a, array b, integer n, and integer m
     * as parameters and returns an array that contains the missing elements and the
     * order of the elements should be the same as they are in array a.
     * 
     * Expected Time Complexity: O(n+m).
     * Expected Auxiliary Space: O(m).
     * 
     * Constraints:
     * 1 ≤ n, m ≤ 105
     * -109 ≤ A[i], B[i] ≤ 10
     */
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 10 };
        int b[] = { 2, 3, 1, 0, 5 };

        System.out.println(find_Missing_second_arr(a, b, a.length, b.length));

    }

    // It will be run fully :->
    /*
     * My apprach is simple as first add all data from b to set l1 so .
     * Then run a loop and check is avail in l1 set or not if not then add in return
     * list(li)
     */
    public static ArrayList<Integer> find_Missing_second_arr(int[] a, int[] b, int n, int m) {
        Set<Integer> l1 = new HashSet<>();
        ArrayList<Integer> li = new ArrayList<>();

        for (int j : b) {
            l1.add(j);
        }
        for (int i = 0; i < n; i++) {
            if (!(l1.contains(a[i]))) {
                li.add(a[i]);
            }
        }
        // for (int i = 0; i < n; i++) {
        // if (!(l2.contains(a[i]))) {
        // li.add(a[i]);
        // }
        // }

        return li;
    }

    public static ArrayList<Integer> fun_find_Miss_secArr_binarySearch(int a[], int b[], int n, int m) {
        Arrays.sort(b);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : a) {
            int low = 0, high = m - 1;
            boolean f = true;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (b[mid] == i) {
                    f = false;
                    break;
                } else if (b[mid] < i) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            if (f)
                list.add(i);
        }
        return list;
    }

    // It work but it extend the time Complexity 0(n^m) but need to (n+m)
    public static ArrayList<Integer> findMissing(int a[], int b[], int n, int m) {
        ArrayList<Integer> li = new ArrayList<>();
        boolean avail = false;
        if (n > m) {
            for (int i = 0; i < n; i++) {
                int temp = a[i];
                for (int j = 0; j < m; j++) {
                    if (temp == b[j]) {
                        avail = true;
                        j = n;
                    } else {
                        avail = false;
                    }
                }
                if (avail == false) {
                    li.add(temp);
                }

            }
        } else {
            for (int i = 0; i < n; i++) {
                int temp = a[i];
                for (int j = 0; j < m; j++) {
                    if (temp == b[j]) {
                        avail = true;
                        j = n;
                    } else {
                        avail = false;
                    }
                }
                if (avail == false) {
                    li.add(temp);
                }
            }
        }
        return li;

    }
}
