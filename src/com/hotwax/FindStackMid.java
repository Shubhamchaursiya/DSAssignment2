//find the middle element of a stack

package com.hotwax;

public class FindStackMid {
    static final int max=100;
    int top;
    int[] array=new int[max];

    boolean isEmpty()
    {
        return (top < 0);
    }
    FindStackMid()
    {
        top = -1;
    }

    boolean push(int x)
    {
        if (top >= (max - 1)) {
            System.out.println("Stack Overflow");
            return false;
        }
        else {
            array[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }
    int pop()
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = array[top--];
            return x;
        }
    }
    void travers(){
        for(int i = top;i>-1;i--){
            System.out.print(" "+ array[i]);
        }
    }
    void findMiddle()
    {
       int length=top+1;
       System.out.println("\nMid element is:"+array[length/2]);

    }
    public static void main(String arg[])
    {
        FindStackMid findStackMid=new FindStackMid();
        findStackMid.push(20);
        findStackMid.push(30);
        findStackMid.push(60);
        findStackMid.push(70);
        System.out.println("Stack is:");
        findStackMid.travers();
        findStackMid.pop();
        System.out.println("\nAfter pop Stack is:");
        findStackMid.travers();
        findStackMid.findMiddle();
    }
}
