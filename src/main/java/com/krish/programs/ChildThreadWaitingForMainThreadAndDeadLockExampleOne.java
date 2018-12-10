package com.krish.programs;

/**
 * This class is created for Inter Thread communication using join() 
 * and How to create Dead Lock situation and used Java 7 Coding 
 * @author Krishna Sure
 *
 */
public class ChildThreadWaitingForMainThreadAndDeadLockExampleOne {

	public static void main(String[] args) {
		MyThread.mainThread = Thread.currentThread();
		
		Thread t = new Thread(new MyThread());
		t.start();
		
		//Dead Lock situation
		//If i un-comment below code main thread is waiting for child thread
		//child thread is waiting for main thread which leads to dead lock
		/*try {
			t.join();
		} catch (InterruptedException e) {
			System.err.println(e);
		}*/
		
		for(int i = 0; i < 10; i++)
			System.out.println("Main Thread");
	}
}

class MyThread implements Runnable {

	static Thread mainThread;
	
	@Override
	public void run() {
		try {
			mainThread.join();
		} catch (InterruptedException e) {
			System.err.println(e);
		}
		for(int i = 0; i < 10; i++)
			System.out.println("Child Thread");
		
	}
	
}
