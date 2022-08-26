package org.example.basics;

import java.util.Arrays;

import static java.lang.Math.pow;

public class Bitwise_operations {
    /**
     * https://www.youtube.com/watch?v=Db8OmMfzwl8&list=PLUcsbZa0qzu3yNzzAxgvSgRobdUUJvz7p&index=2
     * Consider it as 32 bit operator.
     */
    public static void main(String[] args) {

        convertDecimalToBinary();
        convertBinaryToDecimal();
        bitwiseAnd();
        bitwiseOr();
        bitwiseXor();
        bitwiseNegate();
        bitwiseRightShift();
        bitwiseLeftShift();
        findEvenOddUsingBitwise();
        swappingNumbers();
        swappingWithoutThirdVariable();
        bitmaskingOperations();

    }



    public static void convertDecimalToBinary()
    {
        int number=70 , binary[] = new int[20];
        for(int i=0; number>0 ; i++)
        {
            binary[i] = number%2;
            number = number/2;
        }
        Arrays.stream(binary).forEach(System.out::print);
        System.out.println();
        for(int i= binary.length-1 ; i>=0 ;i--)
            System.out.print(binary[i]);

        System.out.println();
    }

    public static void convertBinaryToDecimal()
    {
        long number=1000110 , sum = 0 ;
        for(int i=0; number>0 ; i++)
        {
                sum += Math.pow(2, i) * (number % 10);
                number = number / 10;
        }
        System.out.println(" The Binary to Decimal is :" +sum);
    }
    private static void bitwiseOr() {
        int a = 5;
        int b = 2;
        /**
         * 101  --5
         * 010  --2
         * ----|
         * 111  --7
         */
        System.out.println("Bitwise OR | ::" + String.valueOf(a | b));
    }

    private static void bitwiseAnd() {
        /**
         * 101  --5
         * 010  --2
         * ---- &
         * 000  --0
         */
        int a = 5;
        int b = 2;
        System.out.println("Bitwise AND & ::" + String.valueOf(a & b));
    }

    private static void bitwiseXor() {
        /**
         * 101  --5
         * 010  --2
         * ---- ^
         * 111  --7
         */
        int a = 5;
        int b = 2;
        System.out.println("Bitwise XOR ^ ::" + String.valueOf(a ^ b));
    }

    private static void bitwiseNegate() {
        /**
         * 00000101  --5
         * --------- ~
         * 11111010  -- -6
         *  //https://www.dummies.com/article/technology/programming-web-design/java/java-negation-bitwise-not-and-boolean-not-153650/
         **/
        int a = 1;
        System.out.println("Bitwise Negate ~ ::" + String.valueOf(~a));
    }

    private static void bitwiseRightShift() {
        /**
         * 0000110001  --49
         * ---- a>>2
         * 0000001100  --12
         */
        int a = 49;
        System.out.println("Bitwise Right shift >> ::" + String.valueOf(a >> 2));
        System.out.println("Bitwise dividing rule by 2 using Right shift ::" + String.valueOf(a >> 1));
    }

    private static void bitwiseLeftShift() {
        /**
         * 0000110001  --49
         * ---- a<<2
         * 0011000100  --196
         */
        int a = 49;
        System.out.println("Bitwise Left shift << ::" + String.valueOf(a << 2));
        System.out.println("Bitwise multiplying rule by (********)2 using Left shift ::" + String.valueOf(a << 1));
    }

    private static void findEvenOddUsingBitwise() {
        int num = 4;
        if (num % 2 == 0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");
        /**
         * num = 5
         * 101 & 1
         * 001
         * num = 4
         * 100 & 1
         * 000
         */
        if (((num & 1) == 1))
            System.out.println("Masking Odd Number");
        else
            System.out.println("Masking Even Number");
    }

    private static void swappingNumbers() {
        int a = 5, b = 3;
        System.out.printf("\nBefore swapping a=%d , b=%d ", a, b);
        int temp ;
        temp = a;
        a = b;
        b = temp;
        System.out.printf("\nAfter swapping a=%d , b=%d ", a, b);
    }
    private static void swappingWithoutThirdVariable() {
        int a = 5, b = 3;
        System.out.printf("\nWithout Third vaiable Before swapping a=%d , b=%d ", a, b );
       /* a = a^b;
        b = a^b;
        a = a^b;*/
        // Anyof the logic will be applied --- Better to use XOR ^ operator as it works on Bits and evaluate the expression early.
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.printf("\nWithout Third vaiable  After swapping a=%d , b=%d ", a, b);
    }
    private static void bitmaskingOperations() {
            // Given number N
            int N = 70;

            System.out.println("The bit at the 3rd position from LSB is: " +
                    (getBit(N, 6) ? '1' : '0'));

            System.out.println("The value of the given number " +
                    "after setting the bit at " +
                    "LSB is: " + setBit(N, 0));

            System.out.println("The value of the given number " +
                    "after clearing the bit at " +
                    "LSB is: " + clearBit(N, 0));
        }

    // Function to get the bit at the
    // ith position
    static boolean getBit(int num, int i)
    {
        // Return true if the ith bit is
        // set. Otherwise return false
        return ((num & (1 << i)) != 0);
    }

    // Function to set the ith bit of the given number num
    static int setBit(int num, int i)
    {
        // Sets the ith bit and return the updated value
        return num | (1 << i);
    }
    // Function to clear the ith bit of the given number N
    static int clearBit(int num, int i)
    {
        // Create the mask for the ith  bit unset
        int mask = ~(1 << i);

        // Return the update value
        return num & mask;
    }

}