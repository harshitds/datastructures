package com.datstructure.practise.array;

//you can also use imports, for example:
import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class MultiplyResult {

 public static void main(String args[])
 {
	 int a[]={1,-2,-3,5};
	 System.out.println(MultiplyResult.solution(a));
 }
 public static int solution(int[] A) {
     // write your code in Java SE 8
     int result=0;
     
     int product=1;

     for(int i=0;i<A.length;i++)
     {
         product=product*A[i];
     }
     if(product<0)
     return -1;
     else if (product==0)
     {
         return 0;
     }
     else{
         return 1;
     }
 }
}
