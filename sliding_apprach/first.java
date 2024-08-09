package sliding_apprach;

public class first {
    public static void main(String[] args) {
        int[] arr={19,2,3,4,5,6,7,8};
        int k=3;
        // here is the apprach of Sliding Window 

        // here we print the subarray sum of size k
        int maxSum =Integer.MIN_VALUE;
       int i =0;
       int sum =0;
       while(i<k){
        sum+=arr[i++];
       }
       maxSum=Math.max(maxSum, sum);
       System.out.print(sum+" ");
       while(i<arr.length){
           sum+=arr[i]-arr[i-k];
           System.out.print(sum+" ");
           maxSum=Math.max(maxSum, sum);
        i++;
       }

       System.out.println("Here is maximum sum :"+maxSum);
    }
}
