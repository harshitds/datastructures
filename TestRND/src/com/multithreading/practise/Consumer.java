package com.multithreading.practise;
import java.util.*;

public class Consumer implements Runnable {
	
	private  List<Integer> producequeue;
	
	public Consumer(List<Integer> producequeue) {
		
		this.producequeue = producequeue;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			synchronized (producequeue) {
				
				while(producequeue.isEmpty())
					try {
						producequeue.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			int i=producequeue.remove(0);
			System.out.println("Cosnumed:"+i);
			
			producequeue.notify();
			}
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		}
		
	}
	


	

}
