package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class relative_sort_Arr {
    /*
     * 1122. Relative Sort Array
     * Easy
     * Topics
     * Companies
     * Hint
     * 
     * Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all
     * elements in arr2 are also in arr1.
     * 
     * Sort the elements of arr1 such that the relative ordering of items in arr1
     * are the same as in arr2. Elements that do not appear in arr2 should be placed
     * at the end of arr1 in ascending order.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
     * Output: [2,2,2,1,4,3,3,9,6,7,19]
     * 
     * Example 2:
     * 
     * Input: arr1 = [28,6,22,8,44,17], arr2 = [22,28,8,6]
     * Output: [22,28,8,6,17,44]
     * 
     * 
     * 
     * Constraints:
     * 
     * 1 <= arr1.length, arr2.length <= 1000
     * 0 <= arr1[i], arr2[i] <= 1000
     * All the elements of arr2 are distinct.
     * Each arr2[i] is in arr1.
     * 
     */
    public static void main(String[] args) {
        int[] arr1 = { 28, 6, 22, 8, 44, 17 };
        int[] arr2 = { 22, 28, 8, 6 };
        int[] temp = relativeSortArray(arr1, arr2);
        System.out.println(Arrays.toString(temp));
    }

    public static int[] easyAproach_simple(int[] arr1, int[] arr2) {
        int i, k = 0;
        int result[] = new int[arr1.length];
        int freq1[] = new int[1001];
        for (i = 0; i < arr1.length; i++) {
            freq1[arr1[i]] += 1;
        }
        for (i = 0; i < arr2.length; i++) {
            while (freq1[arr2[i]] != 0) {
                result[k++] = arr2[i];
                freq1[arr2[i]]--;
            }
        }
        for (i = 0; i < freq1.length; i++) {
            while (freq1[i] != 0) {
                result[k++] = i;
                freq1[i]--;
            }
        }
        return result;
    }

    // it nice it get 4ms
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i : arr1) {
            frequencyMap.put(i, frequencyMap.getOrDefault(i, 0) + 1);
        }

        List<Integer> resultList = new ArrayList<>();

        // Add elements from arr2 in the required order
        for (int num : arr2) {
            int freq = frequencyMap.get(num);
            for (int j = 0; j < freq; j++) {
                resultList.add(num);
            }
            frequencyMap.remove(num);
        }

        // Add remaining elements and sort them
        List<Integer> remainingElements = new ArrayList<>();
        for (int num : frequencyMap.keySet()) {
            int freq = frequencyMap.get(num);
            for (int j = 0; j < freq; j++) {
                remainingElements.add(num);
            }
        }
        Collections.sort(remainingElements);
        resultList.addAll(remainingElements);

        // Convert the result list to an array
        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }

        return resultArray;
    }
}
