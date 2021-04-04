package com.multithreading.practise;

public class ThreadSequenceGenerate implements Runnable {
	
	private  int result;
	private volatile int   totalNumner=10;
	private volatile int  numner=1;
	private volatile  int numberofThread=3;
	static volatile Object lock=new Object();

	public ThreadSequenceGenerate(int result) {
		this.result = result;
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		synchronized (lock) {
			
			while(numner<totalNumner-1)
				
			{
			
				while(numner%numberofThread!=result)
				{
					try {
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				System.out.println("Thread:"+Thread.currentThread().getName()+" "+numner);
				numner++;
				lock.notifyAll();
			}
			
		}
		

	}

}
