class max_consucative_485 {
    public static void main(String[] args) {
        int[] arr ={1,1,0,0,1,1,1};
        // int[] arr = { 1, 0, 1, 1, 0, 1 };
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] == 1) {
                    count++;
                } else {
                    j = arr.length;
                }
            }
            max = Math.max(max, count);
        }
        System.out.println(max);

        int maxAns=0;
        max=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==1){
                max++;
                maxAns=Math.max(maxAns, max);
            }else{
                max=0;
            }
        }
        System.out.println(maxAns+"Here is the final ans");
    }
}