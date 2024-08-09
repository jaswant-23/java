package codetantraTest;

public class palindrome {
    public static void main(String[] args) {
        int n = 12321;
        int temp = n;
        int sum =0;
        while(n!=0){
            int r =n%10;
            sum =(sum*10)+r;
            n=n/10;
        }
        if(sum == temp){
            System.out.println("Yes is Palindrome ");
        }else{
            System.out.println("Is Not Palindrome");
        }

    }
}
