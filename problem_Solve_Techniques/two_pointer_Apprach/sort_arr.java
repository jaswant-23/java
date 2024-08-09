package problem_Solve_Techniques.two_pointer_Apprach;

import java.util.Arrays;

public class sort_arr {
    /*
     * Here you need to sort the array without using any predefiend Method
     * mainly Use Tow Pointer aprach
     */
    public static void main(String[] args) {
        int arr[] = { 1, 0, 1, 0, 0, 1, 1, 0, 0 };
        int s = 0, e = 1;

        while (e < arr.length) {
            if (arr[s] == arr[e]) {
                e++;
            } else if (arr[s] > arr[e]) {
                int t = arr[s];
                arr[s] = arr[e];
                arr[e] = t;
                s++;
                e++;
            } else {
                s++;
            }
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("2nd Aprrach:-> If array contains only 1,0:->");
        int count = 0;
        for (int i : arr) {
            if (i == 0)
                count++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (i <= count) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
