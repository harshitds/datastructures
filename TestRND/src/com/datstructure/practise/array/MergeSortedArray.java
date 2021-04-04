package com.datstructure.practise.array;

public class MergeSortedArray {
	
	
	
	public static void  mergearr(int [] arr1,int [] arr2) {
		
		int n1=arr1.length;
		int n2=arr2.length;
		int [] arr3=new int[n1+n2];
		int i=0;
		int j=0;
		int k=0;
		
		while(i<n1 && j<n2) {
			if(arr1[i]<arr2[j]) {
				arr3[k]=arr1[i];
				i++;
				
				System.out.println("iteration i:"+i +"::value "+arr3[i]);
			}
			else {
				arr3[k]=arr2[j];
				j++;
				System.out.println("iteration j:"+j +"::value "+arr3[j]);
			}
			k++;
		}
		
		
      
		// Store remaining elements of first array 
        while (i < n1) 
            arr3[k++] = arr1[i++]; 
      
        // Store remaining elements of second array 
        while (j < n2) 
            arr3[k++] = arr2[j++]; 		
		
		  for (int c=0 ;c<arr3.length;c++)
		  { 
			  System.out.print(arr3[c]+ " "); 
		  }
		 
		
	}

	public static void main(String[] args) {
		
		int [] arr1= {2,5,7,8,9,13,15};
		int [] arr2= {1,3,5,6,11,16};
		// TODO Auto-generated method stub
		MergeSortedArray.mergearr(arr1, arr2);

	}

}
