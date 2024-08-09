public class revArray{
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
      int arr[] = {10,20,15,30,25,70,55};
      for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
      }
      System.out.println();
      int i = 0;
      int j = arr.length-1;
      while(i<j){
        swap(arr, i, j);
        i++;
        j--;
      }
      for(int rev:arr){
        System.out.print(rev + " ");
      }
    }  
}