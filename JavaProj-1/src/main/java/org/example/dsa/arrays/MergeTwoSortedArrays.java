package org.example.dsa.arrays;

public class MergeTwoSortedArrays {

    public void printArray(int arr[])
    {
        for (int i=0 ; i<arr.length; i++)
            System.out.print (arr[i] +" ");

        System.out.println();
    }
    public int[] mergeSortedArrays(int []arr1 , int  []arr2)
    {
        int m = arr1.length , n =arr2.length;
        int i=0,j=0,k=0;
        int result[] = new int[m+n];
        for(;i<m && j<n ; )
        {
            if(arr1[i]<arr2[j])
            {
                result[k] = arr1[i];
                i++;
                k++;
            }
            else if(arr2[j]>arr1[i])
            {
                result[k] = arr2[j];
                j++;
                k++;
            }
        }
        for(;i<m;)
        {
            result[k]=arr1[i];
            i++;
            k++;
        }
        for(;j<n;)
        {
            result[k]=arr2[j];
            j++;
            k++;
        }
        return result;
    }
    public static void main(String[] args) {
        MergeTwoSortedArrays mergeArray = new MergeTwoSortedArrays();
        int arr1[] = new int[]{2,7}; //sorted array
        int arr2[] = new int[]{1,3,5,10,17,18};//sorted array
        int mergedArray[] = mergeArray.mergeSortedArrays(arr1,arr2);
        mergeArray.printArray(mergedArray);

    }

}
