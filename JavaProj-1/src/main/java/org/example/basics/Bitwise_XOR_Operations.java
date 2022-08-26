package org.example.basics;


public class Bitwise_XOR_Operations {
    public static void main(String[] args) {
        findOnlyOneNonRepeatedEleFromRepeatedTwiceArray();
        findTwoNonRePeatedEleFromRepeatedTwiceArray();
        findOnlyOneNonRepeatedEleFromRepeatedThriceInArray();
    }

    /** Ref; Anuj bhaiya https://www.youtube.com/watch?v=bTauscvOymA&list=PLUcsbZa0qzu3yNzzAxgvSgRobdUUJvz7p&index=4
     * Find the only non-repeating element in an array where elements repeats twice
     * Ex : 3 4 6 3 6 2 2
     * n^0 = n
     * n^n = 0
     * As per n^n=0 all the numbers which comes twice will get cancelled
     */
    private static void findOnlyOneNonRepeatedEleFromRepeatedTwiceArray() {
        int arr[] = {3 ,4 ,6 ,3 ,6 ,2 ,2,4,1};
        int x=0;
        for(int i=0;i<arr.length ;i++)
        {
            x ^= arr[i];
        }
        System.out.println("The only number is " +x);
    }
    /** Ref; Anuj bhaiya https://www.youtube.com/watch?v=bTauscvOymA&list=PLUcsbZa0qzu3yNzzAxgvSgRobdUUJvz7p&index=4
     * Find the two non-repeating element in an array where every element repeats twice
     * Ex : 3 4 6 5 3 6 2 2 1 5
     * n^0 = n
     * n^n = 0
     * As per n^n=0 all the numbers which comes twice will get cancelled
     * step1 - Find the XOR of the array and return the result
     * step2 - create a new array with even and odd seperatedly
     * step3 - now perform XOR operation again with result
     */
    private static void findTwoNonRePeatedEleFromRepeatedTwiceArray()
    {
        int arr[] = {3 ,4 ,6 ,5 ,3 ,6 ,2 ,2 ,1 ,5};
        int evenArray[] = new int[arr.length];
        int oddArray[] = new int[arr.length];
        int result = findTheXOR(arr,0);
        for(int i=0; i<arr.length ; i++)
        {
            if ((arr[i] & 1) == 0)
                evenArray[i] = arr[i];
            else
                oddArray[i] = arr[i];
        }
        int element1 = findTheXOR(evenArray,result);
        int element2 = findTheXOR(oddArray,result);
        System.out.printf( " The two elements are %d and %d " , element1,element2);
    }
    public static int  findTheXOR(int arr[] , int x) {
         //x=0;
        for(int i=0;i<arr.length ;i++)
        {
            x ^= arr[i];
        }
        return x;
    }
    /** Ref; Anuj bhaiya https://www.youtube.com/watch?v=bTauscvOymA&list=PLUcsbZa0qzu3yNzzAxgvSgRobdUUJvz7p&index=4
     * Find the only non-repeating element in an array where elements repeats Thrice in an array
     * Ex : 3 4 6 3 6 2 2 3 6
     */
    private static void findOnlyOneNonRepeatedEleFromRepeatedThriceInArray() {
        int arr[] = {3 ,4 ,6 ,3 ,6 ,2 ,2,3,6};
        int result[] = new int[3];
        for(int i=0;i<arr.length ;i++)
        {
            for(int j=0;j<arr.length ;j++)
            {
                String binary = Integer.toBinaryString(arr[j]);
                result = findTirnarySum(binary , i);
            }
        }
        System.out.println("\nThe only number is " +result.toString());
    }

    private static int[] findTirnarySum(String binary , int x) {
        int binaryInt = Integer.parseInt(binary);
        System.out.println("binaryInt "+ binaryInt);
        int [] result = new int[3];
        int index=0,count=0;

            count  = count + (binaryInt%10);
            result[index] = count;
            binaryInt =  binaryInt/10;

        return result;
    }
}
