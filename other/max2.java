public class max2 {
    public static void main(String[] args) {
        int[] arr={23,3,5,7,90,2};
        System.out.println(second_max_ele(arr));
    }
    public static int second_max_ele(int[] arr){
        int m1=Integer.MIN_VALUE,m2=Integer.MIN_VALUE;

        for (int i : arr) {
            if(m1<i){
                m1=i;
            }
        }
        for (int val : arr) {
            if(val>m2 && val!=m1){
                m2=val;
            }
        }
        return m2;
    }
}
