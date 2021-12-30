//Reverse a String using Stack

package com.hotwax;

public class StackStringReverse {

    int size;
    int top;
    char[] a;
    boolean isEmpty()
    {
        return (top < 0);
    }

    StackStringReverse(int n)
    {
        top = -1;
        size = n;
        a = new char[size];
    }

    boolean push(char x)
    {
        if (top >= size)
        {
            System.out.println("Stack Overflow");
            return false;
        }
        else
        {
            a[++top] = x;
            return true;
        }
    }
    char pop()
    {
        if (top < 0)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
        {
            char x = a[top--];
            return x;
        }
    }
    public static void reverse(StringBuffer str)
    {
        int n = str.length();
        StackStringReverse obj = new StackStringReverse(n);
        int i;
        for (i = 0; i < n; i++)
            obj.push(str.charAt(i));

        for (i = 0; i < n; i++) {
            char ch = (char) obj.pop();
            str.setCharAt(i, ch);

        }
    }
    public static void main(String args[])
    {
        StringBuffer s= new StringBuffer("Shubham");
        reverse(s);

        System.out.println("Reversed string is " + s);
    }
}
