package gfg.hard.hard;

import gfg.easy.count;

public class stritlyIncrese {
    public static void main(String[] args) {
        // int[] arr= {7 ,7, 5, 3 ,3, 9, 5};
        int[] arr= {10 ,5 ,5 ,2, 4, 10, 3, 2, 7, 9};
        System.out.println(no_toMake_strict_Incre(arr));
    }
    public static int no_toMake_strict_Incre(int[] arr){
        int max=0;
         int f=0,s=1;
         while(s<arr.length){
             if(arr[f]>=arr[s]){
                 max++;
             }
             f++;
             s++;
         }
       
         return max;
    }
}
