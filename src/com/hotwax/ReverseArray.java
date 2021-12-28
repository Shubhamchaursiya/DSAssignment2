//Reverse an array in o(n) time.

package com.hotwax;
public class ReverseArray {
    public static void reversArr(int array[])
    {
      int start=0,end=array.length-1;
      while (start<end)
      {
          int temp=array[start];
          array[start]=array[end];
          array[end]=temp;
          start++;
          end--;
      }
        for (int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }


    public static void main(String[] args) {
        int []array={1,3,5,6,8};
        reversArr(array);
    }
}
