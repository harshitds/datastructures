package com.datstructure.practise.array;

public class ArraySeggregateOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {12, 34, 45, 9, 8, 90, 3};
		 
	        segregateEvenOdd(arr);
	 
	        System.out.print("Array after segregation ");
	        for (int i = 0; i < arr.length; i++)
	            System.out.print(arr[i]+" ");
	    
	}
	
	static void segregateEvenOdd(int arr[])
    {
        /* Initialize left and right indexes */
        int left = 0, right = arr.length - 1;
        while (left < right)
        {
            /* Increment left index while we see 1 at left */
            while (arr[left]%2 == 1 && left < right)
                left++;
 
            /* Decrement right index while we see 0 at right */
            while (arr[right]%2 == 0 && left < right)
                right--;
 
            if (left < right)
            {
                /* Swap arr[left] and arr[right]*/
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

}
