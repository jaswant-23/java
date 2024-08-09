package codetantraTest;

public class reverseWord {
    public static void main(String[] args) {
        // To reverse an string without using function
        String s = "hello i am jaswant yadav";
        String news="";
        for (int i = s.length()-1; i >=0; i--) {
            news+=s.charAt(i);
        }

        System.out.println(news);
    }
}
