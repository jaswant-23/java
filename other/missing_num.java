package other;

import gfg.easy.isRotated;

public class missing_num {
    public static void main(String[] args) {
        int[] arr ={2,1,8,5,6,7,3};
        System.out.println(get_Miss_Use_BitManipulation_Method(arr));
        isPowerof(38);
        System.out.println(Integer.toBinaryString(4));
        System.out.println(get_i_th_bit(4, 2));
        int[] ans= {-11,-2,-3};
        System.out.println(maxSubArraySum(ans));
    }
    public static int get_i_th_bit(int number,int i) {
        System.out.println(number<<i);
        return (number >> i) & 1;
    }
    public static void isPowerof(int n) {
        if((n&(n-1))==0){
            System.out.println("Yes is power of 2");
        }else{
            System.out.println("No is Not");
        }
    }
    public static int get_Miss_Use_BitManipulation_Method(int[] arr) {
        int xorVal=0;
        for (int i = 1; i <=arr.length+1; i++) {
            xorVal=xorVal^i;
        }
        for (int i : arr) {
            xorVal=xorVal^i;
        }
        return xorVal;
    }
    public static int maxSubArraySum(int[] arr) {
        int maxsofar = arr[0];
        int maxEndingHere = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxsofar = Math.max(maxsofar, maxEndingHere);
        }
        return maxsofar;
    }
}
