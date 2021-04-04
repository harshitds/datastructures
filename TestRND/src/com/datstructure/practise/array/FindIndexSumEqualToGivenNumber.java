package com.datstructure.practise.array;

import java.util.*;

public class FindIndexSumEqualToGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[]= {2,7,11,15,5,4};
		int target=9;
		
		System.out.println("Array pair is :::");
		FindIndexSumEqualToGivenNumber.twoSum(nums, target);
		
		System.out.println("Array pair Index is :::");
		FindIndexSumEqualToGivenNumber.twoSumindex(nums, target);
	}
	
	
	public static void  twoSum(int[] nums, int target) {
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        if (map.containsKey(complement)) {
	           System.out.println("Pair is :"+nums[i]+","+complement);
	        }
	        map.put(nums[i], i);
	    }
	   // throw new IllegalArgumentException("No two sum solution");
	}
	
	public static void  twoSumindex(int[] nums, int target) {
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        if (map.containsKey(complement)) {
	           System.out.println("Index of Pair is:"+i+","+map.get(complement));
	        }
	        else {
	        map.put(nums[i], i);
	        }
	    }
	   // throw new IllegalArgumentException("No two sum solution");
	}

}
