package com.practrise.interview;

public class SplitString {

	public static void main(String[] args) {
		
		String s="DFF3465BCDRTYU65";
		String xz[]=s.split("\"(?<=\\\\D)(?=\\\\d)\"");
		
		for(int c=0;c<xz.length;c++)
		{
			
		}
		System.out.println(xz[0]);
		// TODO Auto-generated method stub

	}

}
