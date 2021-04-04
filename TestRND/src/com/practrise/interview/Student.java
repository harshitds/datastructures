package com.practrise.interview;
// Java example to create a Java HashMap 
// of user-defined class type 

import java.util.*; 
import java.io.*; 

// User defined class 

	public  class Student { 

		private int rollno; 
		private String name; 

		// Constructor 
		public Student(int rollno, String name) 
		{ 
			this.rollno = rollno; 
			this.name = name; 
		} 

		public String getname() 
		{ 
			return this.name; 
		} 

		public int getmarks() 
		{ 
			return this.rollno; 
		} 

		public void setname(String name) 
		{ 
			this.name = name; 
		} 

		public void setmarks(int rollno) 
		{ 
			this.rollno = rollno; 
		} 
	


	
	}

	// This code is contributed by Subhesh 

