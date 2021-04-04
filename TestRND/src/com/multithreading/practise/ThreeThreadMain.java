package com.multithreading.practise;

public class ThreeThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread(new ThreadSequenceGenerate(1),"T1");
		Thread t2=new Thread(new ThreadSequenceGenerate(2),"T2");
		Thread t3=new Thread(new ThreadSequenceGenerate(0),"T3");
		t1.start();
		t2.start();
		t3.start();
	}

}
