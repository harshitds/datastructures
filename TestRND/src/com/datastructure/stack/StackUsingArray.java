package com.datastructure.stack;

public class StackUsingArray {
	
	static final int MAX = 100;
    int top=-1;
    static int a[] = new int[MAX]; // Maximum size of Stack
 
    boolean isEmpty()
    {
       if(top==-1)
       {
    	   return true;
       }
       return false;
    }
 
    void push(int x)
    {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
           
        }
        else {
        	++top;
            a[top] = x;
           // System.out.println(x + " pushed into stack");
           
        }
    }
 
    int pop()
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
        	top--;
            int x = a[top];
            return x;
        }
    }
 
    int peek()
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = a[top];
            return x;
        }
    }
}
 
