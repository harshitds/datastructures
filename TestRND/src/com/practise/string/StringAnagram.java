package com.practise.string;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="dear";
		String s2="dare";
	
		System.out.println(StringAnagram.isAnagram(s1, s2));
	}
	
	
	public static boolean isAnagram(String str1, String str2) {
		 
	      /*If both strings is of different length,
	        then it's not an anagram */
	      if(str1.length() != str2.length())
	         return false;
	 
	       //Create an array of size 256
	       int[] countarr = new int[256];
	 
	       for(int i = 0; i < str1.length(); i++) {
	    	   
	    	   System.out.println("Before incre:"+countarr[str1.charAt(i)] +"Char is "+str1.charAt(i));
	          //Increment character count for str1
	          countarr[str1.charAt(i)]++;
	          
	         System.out.println("After  incre:"+countarr[str1.charAt(i)]+"Char is "+str1.charAt(i));
	 
	         //decrement character count for str2
	        countarr[str2.charAt(i)]--;
	       }
	 
	       for(int j = 0; j < countarr.length; j++) {
	          //if it's not zero
	          if( countarr[j] != 0) {
	              return false;
	          }
	       }
	 
	       return true;
	  }

}
