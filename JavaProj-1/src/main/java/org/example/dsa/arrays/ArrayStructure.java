package org.example.dsa.arrays;

public class ArrayStructure {

    public void demoArray()
    {
        int arr[]= new int[10];
        arr[5] =125;
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public void initializedArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public void integerCheck()
    {
        int x=0;
        System.out.println("Value x is : "+ x);
    }

    public int minimumOfArray(int arr[])
    {
        /***
         * To find the minimum of an Array
         *  steps are..
         *  1) take first array element as minimum value and check whether this holding value
         *  is comparing with next indexing numbers in the array .
         *  2) if any number is identifying as lesser , then replace this current checking array
         *  element with " min " value.
         *  3) Continue the same process for All the numbers in the array.
         *  Example : 3 5 2 8 10 5 1 6
         */
        if(arr==null || arr.length==0)
        {
            throw new IllegalArgumentException("please provide the minimum elements in an array");
        }
        int min=arr[0];
        for(int i=1; i< arr.length ; i++)
        {
            if(arr[i] < min)
            {
                min=arr[i];
            }
        }
        return min;
    }
    public int maxmumOfArray(int arr[])
    {
        /***
         * To find the maximum of an Array
         *  steps are..
         *  >>>just opposite to minimum of an array algorithm>>>>>
         */
        if(arr==null || arr.length==0)
        {
            throw new IllegalArgumentException("please provide the minimum elements in an array");
        }
        int max=arr[0];
        for(int i=1; i< arr.length ; i++)
        {
            if(arr[i] > max)
            {
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayStructure arrayStructure =  new ArrayStructure();
        //arrayStructure.demoArray();
        //arrayStructure.integerCheck();
        //arrayStructure.initializedArray(new int[]{3,5,6,8,10,5,2,6});
        //int minim = arrayStructure.minimumOfArray(new int[]{}); //Exception in thread "main" java.lang.IllegalArgumentException: please provide the minimum elements in an array
        int minim = arrayStructure.minimumOfArray(new int[]{0,3,2,6,8,10,5,1,6});
        System.out.println("The minimum element of the array is .. :" +minim);
        int maximum = arrayStructure.maxmumOfArray(new int[]{0,3,2,6,8,10,5,1,6});
        System.out.println("The maximum element of the array is .. :" +maximum);
    }
}
