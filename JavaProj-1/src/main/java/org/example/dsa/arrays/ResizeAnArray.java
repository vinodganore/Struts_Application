package org.example.dsa.arrays;


/**
 * This is the internal archetecture of linkedList , when add a new element to list , it create new array with
 * added size and copies all the elements from old list to temporarly created array
 * finally points to temporary array in heap memory.
 */
public class ResizeAnArray {
    public static void printArray(int arr[])
    {
        for (int i=0 ; i<arr.length; i++)
            System.out.print (arr[i] +" ");

        System.out.println();
    }
    private int[] createResizeArray(int arr[], int newCapacity) {
        int temp[] = new int[newCapacity];
        for(int i=0;i<arr.length;i++)
        {
            temp[i] = arr[i];
        }
        /*arr = temp;
        return arr;*/
        return temp;

    }
    public static void main(String[] args) {
        ResizeAnArray resizeAnArray = new ResizeAnArray();
        int arr[] = new int[]{3,2,5,2,6,4};
        int newCapacity = arr.length*2;
        System.out.println("The array size is... : "+ arr.length);
        printArray(arr);
        int resizedArray[] = resizeAnArray.createResizeArray(arr, newCapacity );
        System.out.println("The resized Array size is... : "+ resizedArray.length);
        printArray(resizedArray);
    }


}
