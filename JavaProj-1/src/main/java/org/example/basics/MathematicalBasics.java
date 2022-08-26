package org.example.basics;

import java.util.Scanner;

/**
 * https://www.youtube.com/watch?v=69jsFIMINpI&list=PLUcsbZa0qzu3yNzzAxgvSgRobdUUJvz7p&index=5
 */
public class MathematicalBasics {
    public  long fact=1;
    public static void main(String[] args) {
        MathematicalBasics obj = new MathematicalBasics();
        obj.findFactorial();
        obj.palindromeOfNumber();
    }

    private void palindromeOfNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number. To find Palindrome");
        long number = scanner.nextLong();
        long rev = reverseNumber(number);
         if(rev == number)
             System.out.println("THe given number is Palindrome");
         else
             System.out.println("THe given number is not a Palindrome");
    }

    private long reverseNumber(long number) {
        long rev=0 , rem=1;
        while(number>0)
        {
            rem = number%10;
            rev = rev*10+rem;
            number = number/10;
        }
        return rev;
    }

    public void findFactorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number. To find factorial");
        long number = scanner.nextLong();
       // long fact = factorial(number);
        long fact = factorialRecursive(number);
        System.out.println(" The factorial of the given number is : "+fact);
        findNumberOfTrailingZeroes(number);
    }

    private void findNumberOfTrailingZeroes(long number) {
        long res=0;
        for (long i=5 ; i <= number ;i=i*5)
            res = res + number/i;
        System.out.println(" The number of Trailing zeros are for the given numbers factorial :"+res);
    }

    public  long factorial(long number) {
        fact =1;
        for (long i=1;i<=number;i++)
            fact = fact*i;
        return fact;
    }
    public  long factorialRecursive(long number) {
        if(number==0 || number ==1)
            return 1;
        return number * factorial(number-1);
    }
}
