package org.example.dsa.arrays;

public class ReversingOfArray {
    public void printArray(int arr[])
    {
        for (int i=0 ; i<arr.length; i++)
            System.out.print (arr[i] +" ");

        System.out.println();
    }
    public int[] reverseAnArray(int arr[])
    {
        /**
         * Simply swapping the first and last elements of the array
         * and increment and decrement the indexes .
         * It works for both even and odd arrays(sized)
         */
        int start = 0, end = arr.length-1;
        while(start<end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args) {
        ReversingOfArray reverseArray = new ReversingOfArray();
        int arr[] = new int[]{3, 2, 5, 2, 6, 4,1};
        System.out.println("The given array is ...");
        reverseArray.printArray(arr);
        int reversedArray[] = reverseArray.reverseAnArray(arr);
        System.out.println("The reversal of the array is ...");
        reverseArray.printArray(reversedArray);
    }
}
