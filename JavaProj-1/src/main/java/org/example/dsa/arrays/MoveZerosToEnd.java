package org.example.dsa.arrays;

public class MoveZerosToEnd {

    public void printArray(int arr[])
    {
        for (int i=0 ; i<arr.length; i++)
            System.out.print (arr[i] +" ");

        System.out.println();
    }
    public void printArrayDebug(int arr[] , int p , int q)
    {
        System.out.println ("i = "+p +" , j = "+q +"  ");
        for (int i=0 ; i<arr.length; i++)
            System.out.print (arr[i] +" ");

        System.out.println("\n");
    }
    public void moveZerosToEnd(int arr[])
    {
        int j=0; // Whcich concentrate on 0 element
        for(int i=0;i<arr.length;i++) // i value concentrate on non-zero value
        {
            if(arr[i]!=0 && arr[j]==0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j]!=0)
            {
                j++;
            }
            //printArray(arr);
            printArrayDebug(arr,i,j);
        }
        printArray(arr);
    }
    public static void main(String[] args) {
        MoveZerosToEnd moveZeros =  new MoveZerosToEnd();
        moveZeros.moveZerosToEnd(new int[]{8,1,0,2,1,0,3});
    }
}
