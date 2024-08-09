package gfg.potd;

public class pandavan {
    public static void main(String[] args) {
        int p0=1,p1=1,p2=1;
        // 1,1,1,2,3,5,8,13,21,34
        System.out.println("haihja");
        System.out.println(get_pandhavan(7));
    }
    public static int get_pandhavan(int n){
        int p0=1,p1=1,p2=1;
        if(n<3){
            return 1;
        }
        int count =3;
        int sum =0;
        while(count!=n){
            sum = p2+p1;
            count++;
            if(count==n){
                return sum;
            }
            p1=p2;
            p2=sum;
        }
        return sum;
    }
}
