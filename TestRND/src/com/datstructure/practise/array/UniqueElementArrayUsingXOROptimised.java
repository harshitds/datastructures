package com.datstructure.practise.array;

import java.util.HashMap;

public class UniqueElementArrayUsingXOROptimised {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {4,1,2,2,1};
		
		System.out.println(findUnique(arr));

	}
	
	public static int findUnique(int [] nums)
	{
		
		// Do XOR of all elements and return 
        int res = nums[0]; 
        for (int i = 1; i < nums.length; i++) 
            res = res ^ nums[i]; 
      
        return res;
	}

}
