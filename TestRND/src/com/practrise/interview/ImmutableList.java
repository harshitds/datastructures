package com.practrise.interview;

import java.util.*;

public class ImmutableList {

	public static void main(String[] args) {
		
		List<Student> l= new ArrayList<Student>();
		// TODO Auto-generated method stub
		
		Student one = new Student(1, "Geeks1"); // key1 

		Student two = new Student(2, "Geeks2"); // key2 
		Student three = new Student(3, "Geeks3"); // key2 
		l.add(one);
		l.add(two);
		l.add(three);
		
		List<Student> immutale=Collections.unmodifiableList(l);
		
		two.setname("harshit");
		immutale.add(three);
		
		for(Student list:immutale)
		{
			System.out.println(list.getname());
		}
	}

}
