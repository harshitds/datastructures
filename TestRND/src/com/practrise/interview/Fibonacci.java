package com.practrise.interview;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 9;
		 System.out.println("Fibonaaci Number is :::");
	        System.out.println(fib(n));
	        
	        System.out.println("Fibonaaci Series is  is :::");
	        
	        fibSeries(n);
	        
	        System.out.println("Fibonaaci Series is  is :::");
	        
	        System.out.println(fib(n));
	}
	
	static int fib(int n)
    {
        int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++)
        {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
	
	
	static void fibSeries(int n)
    {
        int a = 0, b = 1, c;
        if (n == 0)
            System.out.println(0);;
        for (int i = 2; i <= n; i++)
        {
            c = a + b;
            System.out.print(" "+c);
            a = b;
            b = c;
        }
       
    }
	
	static  int fibSeriesRecurson(int n)
    {
        int a = 0, b = 1, c;
        if (n <=1)
            return n;
        else {
        	return fibSeriesRecurson(n-1)+fibSeriesRecurson(n-2); 
        }
       
    }
}
