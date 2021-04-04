package com.datstructure.practise.array;
import java.util.*;

public class FindKthLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using Min Heap
		int k=4;
		int arr []= {3,2,3,1,2,4,5,5,6};
		int num=findKthLargest(arr, k);
		System.out.println(num);
		
	}
	
	 public  static int findKthLargest(int[] nums, int k) {
	        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);
	        for(int item:nums) {
	            minHeap.add(item);
	            if(minHeap.size()>k) {
	                minHeap.poll();
	            }
	        }
	        return minHeap.peek();
	    }

}
