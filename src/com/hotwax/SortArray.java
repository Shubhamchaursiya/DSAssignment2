//Sort array consisting of only 0, 1 & 2 without using any sorting algo.

package com.hotwax;

public class SortArray {
    public static void arraySort(int []array)
    {
        int lo=0;
        int hi=array.length-1;
        int mid=0,temp=0;
        while (mid <= hi) {
            switch (array[mid]) {
                case 0: {
                    temp = array[lo];
                    array[lo] = array[mid];
                    array[mid] = temp;
                    lo++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2: {
                    temp = array[mid];
                    array[mid] = array[hi];
                    array[hi] = temp;
                    hi--;
                    break;
                }
            }
        }

    }
    static void printArray(int arr[])
    {

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }
    public static void main(String[] args)
    {
        int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1,2 };
        int arr_size = arr.length;
        arraySort(arr);
        System.out.println("Array after sorting ");
        printArray(arr);
    }
}

