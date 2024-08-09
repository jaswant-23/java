package sliding_apprach;

class get_uniq_ELE {
    public static void main(String args[]) {
        int N = 7, k = 4;
        int A[] = { 1, 2, 1, 3, 4, 2, 3 };

        int i = 0;
        String s = "";
        int count = 0;
        while (i < k) {
            if (!s.contains(A[i] + "")) {
                count++;
            }
        }
        System.out.println(count);
        while(i<N){
            
        }
    }
}