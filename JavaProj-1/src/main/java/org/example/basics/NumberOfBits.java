package org.example.basics;

import sun.awt.windows.ThemeReader;

import java.util.Scanner;

/**
 * https://www.interviewbit.com/problems/number-of-1-bits/
 */
public class NumberOfBits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number..");
        int number = scanner.nextInt();
       // findNumberOf1BitsNormal(number);
        findNumberOf1BitsUsingBitManipulation(number);
    }

    private static void findNumberOf1BitsNormal(int number) {
        long binary = Integer.parseInt(Integer.toBinaryString(number));
        System.out.printf("\nThe binary number of %s is %d", number, binary);
        int count = 0;
        while (binary > 0) {
            if (binary % 10 != 0)
                count++;
            binary = binary / 10;
        }
        System.out.println("\n The number of 1 digits are " + count);
    }

    private static void findNumberOf1BitsUsingBitManipulation(int number) {
        long binary = Integer.parseInt(Integer.toBinaryString(number));
        System.out.printf("\nThe binary number of %s is %d", number, binary);
        long count = 0;
        long temp = 0;
        while(number>0)
        {
            temp = number&1;
            count = count + temp;
            number = number>>1;
        }
        System.out.println("\n The number of 1 digits are " + count);
    }
}