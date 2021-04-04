package com.datstructure.practise.array;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindKthSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using Max Heap Heap
		int k=4;
		int arr []= {3,2,4,5,6,8,10,34};
		int num=findKthLargest(arr, k);
		System.out.println(k+"th smallest element is ::"+num);
		
	}
	//new PriorityQueue<>(Collections.reverseOrder());
	 public  static int findKthLargest(int[] nums, int k) {
	        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, Collections.reverseOrder());
	        for(int item:nums) {
	        	maxHeap.add(item);
	            if(maxHeap.size()>k) {
	            	System.out.println(maxHeap.poll());
	            }
	        }
	        System.out.println(maxHeap);
	        return maxHeap.peek();
	    }

}
