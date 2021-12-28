//Sort binary array in linear time (Array of 0’s and 1’s)

package com.hotwax;

import java.util.Arrays;

public class BinaryArraySort {
    public static void binaryArraySort(int[] array)
    {
        int pivot = 1;
        int j = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] < pivot)
            {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                j++;
            }
        }
    }

    public static void main (String[] args)
    {
        int[] A = { 0, 0, 1, 0, 1, 1, 0, 1, 0, 0 };

        binaryArraySort(A);

        System.out.println("After sorting:");
        System.out.println(Arrays.toString(A));
    }

}
