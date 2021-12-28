//Find whether an array is subset of another array

package com.hotwax;

public class FindSubArray {
    public static boolean subArray(int[] array1,int []array2)
    {

        int m=array1.length;
        int n=array2.length;
        int i = 0;
        int j = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++)
                if (array2[i] == array1[j])
                    break;

            if (j == m)
                return false;
        }

        return true;
    }
    public static void main(String args[])
    {
        int arr1[] = { 11, 1, 13, 21, 3, 7 };
        int arr2[] = { 11,1,0};

        if (subArray(arr1, arr2))
            System.out.print("arr2[] is " + "subset of arr1[] ");
        else
            System.out.print("arr2[] is " + "not a subset of arr1[]");
    }
}
