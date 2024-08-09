public class rearangeStr {
    // Here is question as You have given a String as like "0011" then you must
    // rearange the ele
    // as First 0 comes X Times Then 1 Comes y time similarly as it..
    // o/P 0101 when x=1 and y =1
    public static void main(String[] args) {
        String s = "0011";
        System.out.println(rearangeXYtime(s, 1, 1));






        //Q. Another Program is to used for the Check the Large given String Number value is Divisible by 7 or not
        // long num = Long.parseLong("8955795758");
        // String num = "8955795758";
        // // System.out.println(ans%7==0);

        // int rem = 0;
        // for (int i = 0; i < num.length(); i++) {
        //     int digit = Character.getNumericValue(num.charAt(i));
        //     rem = (rem * 10 + digit) % 7;
        //     System.out.print(rem+" ");
        // }
        // if (rem % 7 == 0){ 
        //     System.out.println(1);
        // }else{
        //     System.out.println(0);
        // }
            // return 1;
        // return 0;
    }

    public static String rearangeXYtime(String s, int x, int y) {
        String temp = "";
        int tx = 0, ty = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                tx++;
            } else {
                ty++;
            }
        }
        while (tx > 0 && ty > 0) {
            for (int i = 0; i < x; i++) {
                temp += "0";
            }
            for (int i = 0; i < y; i++) {
                temp += "1";
            }
            tx--;
            ty--;
        }
        return temp;
    }
}
