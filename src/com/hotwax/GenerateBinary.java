//Generate binary numbers between 1 to N

package com.hotwax;

public class GenerateBinary {
    static String into(int x, int base)
    {
        boolean negative = false;
        String s = "";
        if (x == 0)
            return "0";
        negative = (x < 0);
        if (negative)
            x = -1 * x;
        while (x != 0)
        {
            s = (x % base) + s;

            x = x / base;
        }
        if (negative)
            s = "-" + s;
        return s;
    }
    static void binaryGenerator(int n)
    {
        System.out.print("0 ");
        for (int i = 1; i <= n; i++)
        {
            String a = new String(into(i, 2));

            System.out.print(a.substring(0, a.length()) + " ");
        }
    }

    // Driver Code
    public static void main(String args[])
    {
        int n = 100;
        binaryGenerator(n);
    }
}
