package org.example.basics;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 *  https://www.javatpoint.com/java-program-to-find-gcd-of-two-numbers
 *  https://www.youtube.com/watch?v=dyrRM8dTEus&list=PLUcsbZa0qzu3yNzzAxgvSgRobdUUJvz7p&index=6
 */
public class MathematicalBasics2 {
    public static void main(String[] args) {
        MathematicalBasics2 obj = new MathematicalBasics2();
        obj.findPrimeNumber();
        obj.findPrimeNumberIn(20);
        int resultedGcd = obj.gcd(12,60);
        System.out.println("The GCD of the given numbers is :"+resultedGcd);
    }

    private int gcd(int a, int b) {
        if(b==0)
            return a;
        return gcd(b,a%b);
    }

    private void findPrimeNumberIn(int rangeEnd) {
        boolean isPrimes[] = new boolean[rangeEnd+1];
        Arrays.fill(isPrimes,true);
        isPrimes[0]=false;
        isPrimes[1]=false;
        int rangeStart = 10;
       // int initial = (int)Math.sqrt(rangeStart);

        for(int i=2 ; i*i<=rangeEnd ; i++)
        {
            for (int j=2*i ; j<=rangeEnd ; j=j+i)
            {
                isPrimes[j] = false;
            }
        }
        System.out.println("The prime numbers in 1 to "+rangeEnd);
        for (int i=10 ; i<=rangeEnd ; i++)
        {
            //System.out.println(i +" "+isPrimes[i]);
            if(isPrimes[i] == true)
                System.out.print(i+" ");
        }

    }

    private void findPrimeNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number. To find Prime Number");
        long number = scanner.nextLong();
        int count =0;
        for(int i=1  ; i<=number ; i++)
        {
            if(number%i==0)
                count++;
        }
        if (count == 2)
            System.out.println("The given number is prime");
        else
            System.out.println("The given number is not a prime");
    }
}
