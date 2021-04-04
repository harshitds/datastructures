package com.datastruture.linkedlist;
public class Runner {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.insert(18);
		list.insert(45);
		list.insert(12);
		list.insert(25);
		list.insert(28);
		list.insert(55);
		//list.insertAt(0, 55);
		
		///list.deleteAt(2);
		//list.show();
		list.printMiddle();
	}

}
