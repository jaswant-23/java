package other;

public class Arrange_Zero_end {
    public static void main(String[] args) {
        int[] arr={2,3,0,0,2,0,4,5};
        int[] temp = new int[arr.length];
        int c=0;
        for (int i = 0; i < temp.length; i++) {
             if(arr[i]!=0){
                temp[c]=arr[i];
                c++;
             }
        }
        
        // for Print arr
        for (int i = 0; i < temp.length; i++) {
            System.out.print(arr[i]+" ");
        }
     
    }
}
