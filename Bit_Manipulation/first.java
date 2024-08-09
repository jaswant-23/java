package Bit_Manipulation;

public class first {
    // Hello Jaswant Let's Start an new Concept as write as notes with code that
    // will be help you to get Revision
    public static void main(String[] args) {
        /*
         * Bit Manipulation operator:->
         * 1. AND(&) :- Both condition must be True ,Then it Gives True else False....
         */
        // System.out.println(1&1); 
                //Only Give 1 if both is 1 else give 0
        System.out.println(2&0); // Obivusly it give 0
        System.out.println(22&1); 

        


        //  2. OR(|) : When Both Condition is False,Then It Gives True ....
        // System.out.println(2|0);
                    // Or with 0 and Other value it will give same value...
        // System.out.println(13|1);
                      //***  //OR 1 with other 
                     /*if val is EVEN then increase by one  */ 
                    /* If val is ODD then give same */
        // System.out.println(19|2);
                     // But when another value xor with another give Different

        // 3. XOR(^)/ exclusive OR operator:->
        // System.out.println(4^0); 
                      // Any val xor with 0 give same
        // System.out.println(12^1); 
                    // if Binary value xor with 1 give oposite
                   // if another val xor with 1 get sum return
                  // But when another value xor with another give Different

        // System.out.println(6^0); //XOR 0 with any value it Gives Same Value;

        // System.out.println('a'^'b');
            // add char ASCII value....

            
        // System.out.println(0^1);
                // AND 1 with any-- Binary value-- it will give Opposite value...
        // System.out.println(8^3); // ----->  (int,char) Not for Other
                // (perforem like addition..)AND ANY with ANY -- value -- 
                //it will Add Them (2^3=5)

        //4. << Left shift operator
        //   System.out.println(10<<1);
          // a is any value
                    // a << 1 it will give 2a (means Double the number) 
        //   System.out.println(10<<0);
                    // But with 0 it gives same of any number
        // System.out.println(2<<4);
                   //But with a<<b it gives = a*2^b means a*2 pow of b

        //5. >> Right Shift
        // System.out.println(10>>0);
                   // a>>0 gives same
        // System.out.println(23>>1);
                    // a>>1 it give Half of that value a>>1 = a/2
        // System.out.println(13>>15);
        // float a = 4>>2;
        // System.out.println(a);
                   //But with a>>b it gives = a*2^b means a*2 pow of b








// Let's practice Question on the Bitwise Operator
     //Q.1 W A P to check is even or Odd
    //  int n = 25;
    //  System.out.println(n&1); //it gives 0 if is even else 1 means is Odd
    //  System.out.println(isevenODD(n));// for even True else false


    /*package Bit_Manipulation;

        // Bit Manipulation Operators:
        
        // 1. Bitwise AND (&):
        // - Description: Performs a bitwise AND operation on each pair of corresponding bits.
        //   Returns 1 if both bits are 1; otherwise, returns 0.
        // - Usage: Often used for masking specific bits or checking bit flags.
        int res1AND = (1 & 0);    // Result is 0
        
        // Additional Example with Decimal Values:
        int res2AND = (1 & 1);    // Result is 1 (1 & 1)
        int res3AND = (23 & 0);   // Result is 0 (23 & 0)
        int res4AND = (23 & 1);   // Result is 1 (23 & 1)
        int res5AND = (22 & 28);  // Result is 20 (22 & 28)

        // 2. Bitwise OR (|):
        // - Description: Performs a bitwise OR operation on each pair of corresponding bits.
        //   Returns 1 if at least one bit is 1; otherwise, returns 0.
        // - Usage: Useful for setting specific bits or combining bit fields.
        int res1OR = (1 | 0);     // Result is 1
        
        // Additional Example with Decimal Values:
        int res2OR = (13 | 1);    // Result is 13 (13 | 1)
        int res3OR = (19 | 2);    // Result is 19 (19 | 2)
        int res4OR = (8 | 3);     // Result is 11 (8 | 3)

        // 3. Bitwise XOR (^):
        // - Description: Performs a bitwise XOR (exclusive OR) operation on each pair of corresponding bits.
        //   Returns 1 if the bits are different; otherwise, returns 0.
        // - Usage: Commonly used for toggling bits or checking for parity.
        int res1XOR = (4 ^ 0);    // Result is 4
        
        // Additional Example with Decimal Values:
        int res2XOR = (12 ^ 1);   // Result is 13 (12 ^ 1)
        int res3XOR = (6 ^ 0);    // Result is 6 (6 ^ 0)
        int res4XOR = ('a' ^ 'b'); // Result is 3 (97 ^ 98)

        // 4. Bitwise NOT (~):
        // - Description: Performs a bitwise NOT (complement) operation on each bit.
        //   Flips 0s to 1s and 1s to 0s.
        // - Usage: Used for inverting bits or creating bit masks.
        int res1NOT = ~5;         // Result is -6
        
        // Additional Example with Decimal Values:
        int res2NOT = ~0;         // Result is -1
        int res3NOT = ~8;         // Result is -9
        int res4NOT = ~13;        // Result is -14

        // 5. Left Shift (<<):
        // - Description: Shifts all bits to the left by a specified number of positions.
        //   Equivalent to multiplying the number by 2^shiftAmount.
        // - Usage: Commonly used for multiplying by powers of 2.
        int res1LeftShift = (10 << 1); // Result is 20
        
        // Additional Example with Decimal Values:
        int res2LeftShift = (2 << 4);  // Result is 32 (2 * 2^4)
        int res3LeftShift = (23 << 1); // Result is 46 (23 * 2^1)
        int res4LeftShift = (0 << 2);  // Result is 0 (0 * 2^2)

        // 6. Right Shift (>>):
        // - Description: Shifts all bits to the right by a specified number of positions.
        //   Equivalent to dividing the number by 2^shiftAmount.
        // - Usage: Useful for dividing by powers of 2 or extracting sign bits.
        int res1RightShift = (10 >> 1); // Result is 5
        
        // Additional Example with Decimal Values:
        int res2RightShift = (23 >> 1); // Result is 11 (23 / 2^1)
        int res3RightShift = (13 >> 15); // Result is 0 (13 / 2^15)
        float res4RightShift = (float) (4 >> 2); // Result is 1.0 (float) (4 / 2^2)
    }

    // Check if a number is even using bitwise AND operator.
    public static boolean isEven(int n) {
        return (n & 1) == 0; // Returns true if the least significant bit is 0 (even), false otherwise (odd).
    }
}
 */
    }
    public static boolean isevenODD(int n){
        return (n&1)==0; //for even 
        // return (n&1)==1; // for ODD
    }
}
