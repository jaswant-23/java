package dsa_30_03_24;

import java.util.Arrays;

public class lineRev_without_words {
    public static void main(String[] args) {
        // Here you need to reverse the full line but not there Words ....
        // output:-> Sir Hii
          String s = "Hi MY Name Is Jaswant Yadav";
          System.out.println(reverse_str_word(s));
    }

    public static String reverse_str_word(String input_sentence) {
        // Checking if the input string is null
        if (input_sentence == null) {
            throw new IllegalArgumentException("Input param can't be null."); // Throwing an exception for null input
        }

        StringBuilder stringBuilder = new StringBuilder(); // Creating a StringBuilder to store the reversed string
        String[] words = input_sentence.split(" "); // Splitting the input sentence into words based on spaces
        // System.out.println("Here is words" + Arrays.toString(words));
        // Loop to append words in reverse order to the StringBuilder
        for (int i = words.length - 1; i >= 0; i--) {
            stringBuilder.append(words[i]); // Appending each word in reverse order

            if (i != 0) {
                stringBuilder.append(" "); // Adding space between words except for the last word
            }
        }
        return stringBuilder.toString();
    }
}
