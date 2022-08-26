package org.example.basics;

import java.util.Scanner;

public class Bitwise_basics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number..");
        int number = scanner.nextInt();
        long binary = Integer.parseInt(Integer.toBinaryString(number));
        while(number>0)
        {
            binary = Integer.parseInt(Integer.toBinaryString(number));
            System.out.printf("\nThe binary number of %s is %d", number, binary);
            number = number>>1 ;
        }

        System.out.println("\nXOR operation is " + (5^5));
    }
}
