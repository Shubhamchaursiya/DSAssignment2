//Implement 2 stack in an array

package com.hotwax;

public class TwoStackImplementation {
    int size;
    int top1,top2;
    int[] array;
    TwoStackImplementation(int n)
    {
        array = new int[n];
        size = n;
        top1 = -1;
        top2 = size;
    }

    void push1(int x)
    {

        if (top1 < top2 - 1) {
            top1++;
            array[top1] = x;
        }
        else {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }
    void push2(int x)
    {
        if (top1 < top2 - 1) {
            top2--;
            array[top2] = x;
        }
        else {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }
    int pop1()
    {
        if (top1 >= 0) {
            int x = array[top1];
            top1--;
            return x;
        }
        else {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return 0;
    }
    int pop2()
    {
        if (top2 < size) {
            int x = array[top2];
            top2++;
            return x;
        }
        else {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return 0;
    }
    public static void main(String args[])
    {
        TwoStackImplementation ts = new TwoStackImplementation(5);
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(90);
        ts.push2(7);
        System.out.println("Popped element from" + " stack1 is " + ts.pop1());
        ts.push2(30);
        System.out.println("Popped element from" + " stack2 is " + ts.pop2());
    }

}
