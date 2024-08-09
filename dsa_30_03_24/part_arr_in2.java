package dsa_30_03_24;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * part_arr_in2
 */
public class part_arr_in2 {

    // here you need to find the partioned of array in equal weight means sum of it element is equal
    // is partioned or not into two parts
    public static void main(String[] args) {
        int[] arr = {2,4,11,10,5};

        System.out.println(isable_part2(arr));
    }
    public static String isable_part2(int[] arr) {
        int sum1 =0;
        int sum2=0;
        int s =0;
        int e = arr.length-1;
        Arrays.sort(arr);

        while(s<=e){
            if(sum1<=sum2){
                sum1+=arr[s++];
            }else{
                sum2+=arr[e--];
            }

        }
        if(sum1==sum2){
            return "Yes";
        }
        return "NO";
    }

}