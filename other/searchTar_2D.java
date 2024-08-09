class searchTar_2D{
    public static void main(String[] args) {
       int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12,13}};
         System.out.println(isAvail_tar(arr,8));
    }
    public static boolean isAvail_tar(int[][] arr,int target){
        boolean isavail = false;
        for (int i = 0; i < arr.length; i++) {
            int f=i,e=arr.length;
            while(f<e){
                int mid = (f+e)/2;
                if(target<arr[i][mid]){
                    e=mid;
                }else if(target>arr[i][mid]){
                    f=mid+1;
                }else{
                    return true;
                }
            }
        }
        return false;
    }
}