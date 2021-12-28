//Move all the negative numbers to one side of the array.

package com.hotwax;

import java.util.Arrays;

public class SortNegative {
    public static void sortNegative(int []array) {
            int j = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] < 0) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    j++;
                }
            }
        }

        public static void main (String[]args)
        {
            int[] A = {1,1,-3, 9, -1, 28, -7, 10, 99};

            sortNegative(A);
            System.out.println(Arrays.toString(A));

        }
    }
