package org.example.basics;

import java.util.Scanner;

/**
 * https://www.interviewbit.com/problems/trailing-zeroes/
 */
public class TrailingZeroes {
    public static void main(String[] args) {
        findTrailingZeroes();

    }

    private static void findTrailingZeroes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number..");
        int number = scanner.nextInt();
        long binary = Integer.parseInt(Integer.toBinaryString(number));
        System.out.printf("\nThe binary number of %s is %d", number, binary);
        int count=0 , temp =1;
        while(number>0)
        {
            temp = number&1;
            if(temp==0)
                count = count + 1;
            else
                break;
            number = number>>1;
        }
        System.out.println(" The number of trailing zeros is "+count);
    }
}
