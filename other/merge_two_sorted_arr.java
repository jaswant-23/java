package other;

import java.util.Arrays;

import gfg.potd.coin_Change;

public class merge_two_sorted_arr {
    public static void main(String[] args) {
        int[] arr = {3, 9, 15, 17, 21};
        int[] arr2 = {-3, -1, 0, 4, 6, 8, 12, 19, 33};
        System.out.println(merge_get_kth_ele(arr, arr2, 5));

        // int[] temp = new int[arr.length + arr2.length];
        // int f = 0, s = 0;
        // int c = 0;

        // while (f < arr.length && s < arr2.length) {
        //     if (arr[f] < arr2[s]) {
        //         temp[c++] = arr[f++];
        //     } else { 
        //         temp[c++] = arr2[s++];
        //     }
        // }
        // while (f < arr.length) {
        //     temp[c++] = arr[f++];
        // }
        // while (s < arr2.length) {
        //     temp[c++] = arr2[s++];
        // }
        // System.out.println(Arrays.toString(temp));
    }
    public static int merge_get_kth_ele(int[] arr,int[] arr1,int k ) {
        int[] temp = new int[arr.length + arr1.length];
        int f = 0, s = 0;
        int c = 0;

        while (f < arr.length && s < arr1.length) {
            if (arr[f] < arr1[s]) {
                temp[c++] = arr[f++];
            } else { 
                temp[c++] = arr1[s++];
            }
        }
        while (f < arr.length) {
            temp[c++] = arr[f++];
        }
        while (s < arr1.length) {
            temp[c++] = arr1[s++];
        }
        // System.out.println(Arrays.toString(temp));
        // return coin

    }
}
