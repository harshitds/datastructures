package com.datstructure.practise.array;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 7, 8, 9, 1, 5}; 
        int n = arr.length; 
  
        QuickSort ob = new QuickSort(); 
        ob.sort(arr, 0, n-1); 
  
        System.out.println("sorted array"); 
        printArray(arr);
	}
	
	  /* A utility function to print array of size n */
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
	
	  int partition(int arr[], int low, int high) 
	    { 
	        int pivot = arr[high];  
	        int p_index = low; // index of smaller element 
	        for (int i=low; i<high; i++) 
	        { 
	            // If current element is smaller than or 
	            // equal to pivot 
	            if (arr[i] <= pivot) 
	            {
	  
	                // swap arr[i] and arr[j] 
	                int temp = arr[i]; 
	                arr[i] = arr[p_index]; 
	                arr[p_index] = temp; 
	                p_index++;
	            } 
	        } 
	  
	        // swap arr[i+1] and arr[high] (or pivot) 
	        int temp = arr[p_index]; 
	        arr[p_index] = arr[high]; 
	        arr[high] = temp; 
	  
	        return p_index; 
	    } 
	  
	  
	    /* The main function that implements QuickSort() 
	      arr[] --> Array to be sorted, 
	      low  --> Starting index, 
	      high  --> Ending index */
	    void sort(int arr[], int low, int high) 
	    { 
	        if (low < high) 
	        { 
	            /* pi is partitioning index, arr[pi] is  
	              now at right place */
	            int pi = partition(arr, low, high); 
	  
	            // Recursively sort elements before 
	            // partition and after partition 
	            sort(arr, low, pi-1); 
	            sort(arr, pi+1, high); 
	        }
	    }

}
