package dsa_30_03_24;


public class perfectSumProb {
    //Q. In which you need to find the no of subarray whose sum is equal to the k 
    public static void main(String[] args) {
        int[] arr = {5,2,3,10,6,8};
        int sum = 10;
        // System.out.println(no_of_subArr_eqal_k(arr,sum));
        System.out.println(perfect_sum_no_subArr(arr,sum));
    }
    public static int perfect_sum_no_subArr(int[] arr,int k){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            int add =0;
            for (int j = i; j < arr.length; j++) {
                add+=arr[j];
                if(add==k){
                    count++;
                    break;
                }else if(add>k){
                    add=add-arr[j];
                }
            }
        }
        return count;
    }



    public static int no_of_subArr_eqal_k(int[] arr, int k){
        int count =0;
        int mysum =0;
         for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            if(val == k){
                count++;
            }
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]>=k){
                    j++;
                }
                mysum+=arr[j];
                if(mysum+val == k){
                    count++;
                    j=arr.length;
                    mysum =0;
                }
                if(mysum>=k){
                    mysum=mysum-arr[j];
                }
            }
        }
        return count;
    }
}
