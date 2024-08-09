package sorting_Algo;

import java.util.Arrays;

public class cyclic_sort {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 1, 4 };
        after_CyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void after_CyclicSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                int t = arr[i] - 1;
                int temp = arr[t+1];
                arr[t] = arr[i];
                arr[i]=temp;

            }
        }
    }
}
