package com.practrise.interview;

public class TestInterface implements TestI1,I2  {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		TestI1 t1=new TestInterface();
		t1.print();

	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
		System.out.println("Wgich maethd to call");
		
	}

}
