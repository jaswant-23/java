package dsa_30_03_24;

import java.util.Arrays;

public class ip_addres_varified {
    // In Which Given you have an IP_Address in the form of String so you need to
    // find the
    // given ip address is valid or not....

    /*
     * Note:-> as We Know the ipv4 it means is in the range of 4 decimal as it's
     * range ( 0 - 255)
     */
    public static void main(String[] args) {
        String s = "222.111.111.111";
        // String s = "5555.5534";

        System.out.println(isValid(s));
        System.out.println(isValidchatgpt(s));
    }

    public static boolean isValid(String s) {
        String temps = "";
        Boolean ran = true;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '.') {
                temps += s.charAt(i);
            } else {
                // ran = isIn_Range(Integer.parseInt(temps));  // When you want to use the functio for check is in range of 0  to 2555
                int n = Integer.parseInt(temps);
                ran = (n>=0 && n<=255);
                temps="";
            }

        }
        return ran;
    }

    public static boolean isIn_Range(int n) {
        return n > 0 && n <= 255;
    }
    public static int isValidchatgpt(String s) {
        // Split the string by "."
        String[] parts = s.split("\\.");
        System.out.println(Arrays.toString(parts));

        // Check if there are exactly 4 parts
        if (parts.length != 4)
            return 0;

        // Iterate through each part
        for (String part : parts) {
            // Check if the part is empty or contains non-digits
            // System.out.println(part);   .. It will be used to get the element of an array
            if (part.isEmpty() || !part.matches("\\d+"))
                return 0;

            // Convert the part to an integer
            int num = Integer.parseInt(part);

            // Check if the number is within the range [0, 255]
            if (num < 0 || num > 255)
                return 0;

            // Check for leading zeros
            if (!part.equals("0") && part.startsWith("0"))
                return 0;
        }

        return 1; // Valid IPv4 address
    }
}
