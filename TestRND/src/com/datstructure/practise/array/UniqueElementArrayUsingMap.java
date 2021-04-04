package com.datstructure.practise.array;

import java.util.HashMap;

public class UniqueElementArrayUsingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {4,1,2,2,1,2};
		
		System.out.println(findUnique(arr));

	}
	
	public static int findUnique(int [] nums)
	{
		int count=1;
		int uqniue=0;
		HashMap<Integer, Integer> hm=new HashMap<>();
		
		if(nums!=null)
		{
			for(int i=0;i<nums.length;i++)
			{
				if(hm.containsKey(nums[i]))
				{
				 hm.put(nums[i], count++);
				}
				else {
					hm.put(nums[i], count);
				}
			}
			System.out.println(hm);
			for(int i=0;i<nums.length;i++)
			{
				if(hm.get(nums[i])==1)
				{
					uqniue=nums[i];
				}
				
			}
			
		}
		
		return uqniue;
		
	}

}
