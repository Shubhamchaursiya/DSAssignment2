//Find duplicates in an array of N+1 Integers.

package com.hotwax;

public class FindDuplicates {

    static int findduplicate(int []arr)
    {
        int n = arr.length;

        if (n <= 1)
            return -1;

        int slow = arr[0];
        int fast = arr[arr[0]];

        while (fast != slow)
        {
            slow = arr[slow];

            fast = arr[arr[fast]];
        }

        fast = 0;
        while (slow != fast)
        {
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }

    public static void main(String args[])
    {
        int []arr = {1, 2, 6, 4, 5, 6, 3};

        System.out.print(findduplicate(arr));
    }

}
