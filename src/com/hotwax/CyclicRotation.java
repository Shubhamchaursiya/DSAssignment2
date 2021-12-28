//Cyclic rotate an array.

package com.hotwax;

import java.util.Arrays;

public class CyclicRotation {
    public static void rotation(int []array)
    {
        int i = 0, j = array.length - 1;
        while(i != j)
        {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
        }

    }
    public static void main (String[]args)
    {
        int[] A = {1,2,3,4,5};

        rotation(A);
        System.out.println(Arrays.toString(A));

    }
}
