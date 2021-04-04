package com.datstructure.practise.array;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {9,6,4,2,3,5,7,0,1};
        int miss = getMissingNo(a);
        System.out.println(miss);
	}
	
	public static int getMissingNo(int[] nums) {
        
		int arrSum = 0;
        int n=nums.length;
        int fullSum = n*(n+1)/2;
        for (int i = 0; i < nums.length; i++) {
        	arrSum=arrSum+nums[i];
        }
        System.out.println(fullSum+"  "+arrSum);
        return  fullSum-arrSum;
	}

}
