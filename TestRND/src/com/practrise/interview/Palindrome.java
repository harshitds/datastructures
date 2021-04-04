package com.practrise.interview;

public class Palindrome {
	   public static void main(String[] args) {
	      int a = 525, revVal = 0, remainder, val;
	      val = a;
	      System.out.println("Number to be checked = "+a);
	      while( a != 0 ) {
	         remainder = a % 10;
	        // System.out.println("remainder::"+remainder);
	         revVal = revVal * 10 + remainder;
	         //System.out.println("revVal::"+revVal);
	         a /= 10;
	      }
	      if (val == revVal)
	         System.out.println("Palindrome!");
	      else
	         System.out.println("Not a palindrome!");
	   }
	}
