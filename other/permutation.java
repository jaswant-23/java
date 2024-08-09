package other;

public class permutation {
    public static void main(String[] args) {
        String s = "123";
        permutation_fun(s,0,s.length()-1);

    }
    public static void permutation_fun(String s,int f,int e) {
        if(f==e){
            System.out.print(s+" ");
        }else{
            for (int i = f; i <=e; i++) {
                s=swap(s,f,i);
                permutation_fun(s, f+1, e);
                s=swap(s,f,i);
            }
        }
    }
    public static String swap(String s,int f,int e) {
        char[] charr=s.toCharArray();
        char temp = charr[f];
        charr[f]=charr[e];
        charr[e]=temp;
        return String.valueOf(charr);
    }
}
