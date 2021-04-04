package com.practrise.interview;

public class MinimumNumnerOfOperation {

	public static void main(String[] args) {
		
		int arr[]= {4,7,12,17,21,35};
		
		//System.out.println("Operation required::"+MinimumNumnerOfOperation.minOperationsBottomsUp(3));
		
		System.out.println("Operation required::"+MinimumNumnerOfOperation.minOperationsBottom(6));

	}
	
	static int minOperationsBottomsUp(int n)
	{
	     
	    // Storing the minimum operations
	    // to obtain all numbers up to N
	    int dp[] = new int[n + 1];
	 
	    // Initilal state
	    dp[1] = 0;
	 
	    // Iterate for the remaining numbers
	    for(int i = 2; i <= n; i++)
	    {
	    	System.out.println("Iteration is :"+i);
	        dp[i] = Integer.MAX_VALUE;
	 
	        // If the number can be obtained
	        // by multiplication by 2
	        if (i % 2 == 0)
	        {
	        	System.out.println("i/2 :"+i/2);
	        	System.out.println("x :"+dp[i / 2]);
	            int x = dp[i / 2];
	            if (x + 1 < dp[i]) 
	            {
	                dp[i] = x + 1;
	            }
	        }
	         
	        // If the number can be obtained
	        // by multiplication by 3
			/*
			 * if (i % 3 == 0) { System.out.println("i/3 :"+i/3);
			 * System.out.println("x :"+dp[i / 3]); int x = dp[i / 3]; if (x + 1 < dp[i]) {
			 * dp[i] = x + 1; } }
			 */
	 
	        // Obtaining the number by adding 1
	        int x = dp[i - 1];
	        System.out.println("x for add 1:"+x);
	        if (x + 1 < dp[i]) 
	        {
	            dp[i] = x + 1;
	        }
	        
	        
	        System.out.println("dp["+i+"] :"+dp[i]);
	        
	        System.out.println("-----------------------");
	    }
	 
	    // Return the minm operations
	    // to obtain n
	    return dp[n];
	}
	
	
	static int minOperationsBottom(int n)
	{
	     int count=0;
	    while(n==0)
	    {
	    	if(n%2==0)
	    	{
	    		n=n/2;
	    	}
	    	else {
	    		n=n-1;
	    	}
	    	count++;
	    }
		return count;
	}

}
