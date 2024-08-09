package other;

import java.util.ArrayList;

import dsa_30_03_24.ip_addres_varified;

public class subsequence {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]+" ");
        // }
        // // System.out.println();
        // for (int i = 0; i < arr.length+1; i++) {
        // for (int j = 0; j < arr.length; j++) {
        // if(i!=j){
        // System.out.print(arr[j]+" ");
        // }
        // }
        // System.out.println();
        // }
        printSubsequences(arr, 0, new ArrayList<>());
    }

    public static void printSubsequences(int[] arr, int index,ArrayList<Integer> path) {
        // Print the subsequence when reach
        // the leaf of recursion tree
        if (index == arr.length) {
            // Condition to avoid printing
            // empty subsequence
            if (path.size() > 0)
                System.out.println(path);
        }
        else {
            // Subsequence without including
            // the element at current index
            printSubsequences(arr, index + 1, path);
            path.add(arr[index]);
            // Subsequence including the element
            // at current index
            printSubsequences(arr, index + 1, path);
            // Backtrack to remove the recently
            // inserted element
            path.remove(path.size() - 1);
        }
        return;
    }
}
