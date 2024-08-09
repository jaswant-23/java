package leetcode.medium;

import java.util.ArrayList;

public class sum_of_3_triplet_15 {
    public static void main(String[] args) {
        int arr[] = { -1, 0, 1, 2, -1, -4 };
        ArrayList<ArrayList<Integer>> li = sum_3_triplet_fun(arr);
        System.out.println("Here is the common 3_sum Triplet:-" + li);
    }

    public static ArrayList<ArrayList<Integer>> sum_3_triplet_fun(int[] arr) {
        ArrayList<ArrayList<Integer>> li = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if (i != j && i != k && j != k) {
                        if (arr[i] + arr[j] + arr[k] == 0) {
                            ArrayList<Integer> temp = new ArrayList<>();
                            temp.add(arr[i]);
                            temp.add(arr[j]);
                            temp.add(arr[k]);
                            if (!li.contains(temp)) {
                                li.add(temp);
                            }
                        }
                    }
                }
            }
        }
        return li;
    }
}
