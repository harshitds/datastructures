package com.multithreading.practise;

public class OddAndEvenNumberGenerator  {

	private int totalNumberInSequece;
	private volatile boolean evenFlag;
	private int number = 1;
	
	public OddAndEvenNumberGenerator(int totalNumberInSequece) {
		super();
		this.totalNumberInSequece = totalNumberInSequece;
	}
	
	public void printOddNumber() {
		
		synchronized (this) {
			
			while (number <= totalNumberInSequece-1) {
				
				while (evenFlag) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				System.out.println(Thread.currentThread().getName()+": "+number);
				number++;
				evenFlag = true;
				notify();
			}
		}
	}
	
	public void printEvenNumber() {

		synchronized (this) {
			
			while (number <= totalNumberInSequece-1) {
				
				while (!evenFlag) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				System.out.println(Thread.currentThread().getName()+": "+number);
				number++;
				evenFlag = false;
				notify();
			}
		}
	
	}
}
