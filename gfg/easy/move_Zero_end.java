package gfg.easy;

import java.util.Arrays;

public class move_Zero_end {
    public static void main(String[] args) {
        // int[] arr ={3,1,0,0,4};
        int[] arr = { 0, 0, 0, 3, 1, 4 };
        // moveZero_toEnd(arr);
        // System.out.println(Arrays.toString(arr));
        move_zero_toEnd(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void move_zero_toEnd(int[] arr) {
        String s = "";
        for (int i : arr) {
            if (i != 0) {
                s += i;
            }
        }
        System.out.println(s);
        for (int i = 0; i < arr.length; i++) {
            if(i<s.length()){
                arr[i] = Integer.parseInt(s.charAt(i) + "");
            }else{
                arr[i]=0;
            }
        }
    }

    // Two pointer aprroach
    public static void moveZero_toEnd(int[] arr) {
        int f = 0, e = arr.length - 1;
        while (f < e) {
            if (arr[f] != 0)
                f++;
            if (arr[e] == 0)
                e--;

            if (arr[f] == 0 && arr[e] != 0) {
                int t = arr[e];
                arr[e] = 0;
                arr[f] = t;
                f++;
                e--;
            }
        }
    }
}
