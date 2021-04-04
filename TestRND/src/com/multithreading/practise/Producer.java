package com.multithreading.practise;
import java.util.*;

public class Producer implements Runnable {
	
	private  List<Integer> producequeue;
	private final int MAX_CAPACITY=5;
	
	public Producer(List<Integer> producequeue) {
	
		this.producequeue = producequeue;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int counter=0;
		while(true)
		{
		produce(counter++);
		}
	}
	
	public void produce(int i)
	{
		synchronized (producequeue) {
			
			while(producequeue.size()==MAX_CAPACITY)
				try {
					System.out.println("Queue is full:::"+producequeue.size());
					producequeue.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			producequeue.add(i);
			
			System.out.println("Produced::"+i);
			
			
			producequeue.notify();
		}
		 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	

}
