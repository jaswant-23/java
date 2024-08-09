package gfg.potd;

import java.util.Arrays;

public class fibSeries {
    public static void main(String[] args) {
        // int[] ans = finsereisFuns(5);
        System.out.println(Arrays.toString(finsereisFuns(6)));
    }

    public static int[] finsereisFuns(int n) {

        int[] arr = new int[n + 1];
        if (n == 0) {
            arr[0] = 0;
            return arr;
        } else if (n == 1) {
            arr[0] = 0;
            arr[1] = 1;
            return arr;
        } else {
            int f = 0;
            int s = 1;
            arr[0]=0;
            arr[1]=1;
            int i =2;
            int sum =0;
            while(i<= n){
                sum = f+s;
                arr[i]=sum;
                f=s;
                s=sum;
                i++;
            }
        }
        return arr;
    }
}
