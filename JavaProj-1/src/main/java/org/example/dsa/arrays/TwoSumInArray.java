package org.example.dsa.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSumInArray {

    private int[] findTwoSumArray(int[] arr, int target) {

        int result[] = new int[2];
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0;i<arr.length;i++)
        {
            if(!map.containsKey(target-arr[i]))
            {
                map.put(arr[i],i);
            }
            else
            {
                result[1] = i;
                result[0] = map.get(target-arr[i]);
                return result;
            }
        }
        throw new IllegalArgumentException("No two numbers found");
    }

    public int[] findTwoSumLogic2(int []arr , int target)
    {
        int first = 0, second=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i] + arr[j] == target) {
                    first = i;
                    second = j;
                    break;
                }
            }
        }
        int result[] = new int[]{first,second};
        return result;
    }
    public static void main(String[] args) {
        TwoSumInArray sumInArray = new TwoSumInArray();
        //int arr[] = new int[]{2,7};
        int arr[] = new int[]{2,11,5,10,7,8};
        //int resultedIndices[] = sumInArray.findTwoSumArray(arr,9);
        int resultedIndices[] = sumInArray.findTwoSumLogic2(arr,9);
        System.out.println("The positions of the two sum indices are .."+resultedIndices[0]+ "  ,  "+resultedIndices[1]);
    }


}
