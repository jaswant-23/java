package gfg.potd;

public class coin_Change {
    public static void main(String[] args) {
        int[] coins = {1,2,3};
        int sum =4;
        // It is the Question in which you to the no. of ways to change the sum(amount) 
        //to be change from the coins which is in the an Coins array
        System.out.println(no_Of_change(coins,sum));
    }
    public static long no_Of_change(int[] coins,int sum){
        int n = coins.length;
        long[] ans=new long[sum+1];
        ans[0]=1;
        for(int i=0;i<n;i++){
            System.out.println();
            for(int j=coins[i];j<=sum;j++){
                ans[j]+=ans[j-coins[i]];
                System.out.print(ans[j]+" ");
            }
        }
        return ans[sum];
    }
}
