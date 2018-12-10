package com.krish.programs;

/**
 * This class is created for Inter Thread communication using join() 
 * and How to create Dead Lock situation and used Java 8 Coding 
 * @author Krishna Sure
 *
 */
public class ChildThreadWaitingForMainThreadAndDeadLockExampleTwo {

	public static void main(String[] args) {
		
		//Main Thread
		Thread mainThread = Thread.currentThread();
		
		//Child Thread Creation
		Thread childThread = new Thread(() ->  {
			
			try {
				/* Child Thread wants to wait until completing Main Thread
				 * Below line is executed by Child Thread
				 */
				mainThread.join();
			} catch (InterruptedException e) {
				System.err.println(e);
			}
			
			for(int i = 0; i < 10; i++)
				System.out.println("Child Thread");
		});
		
		//Starting Child Thread
		childThread.start();
		
		/* DeadLock situation 
		 * Main Thread wants to wait until completing Child Thread
		 * Below line is executed by Main Thread
		 * If i un comment below code Main Thread is waiting for Child Thread
		 * and Child Thread is waiting for Main Thread which leads to Dead Lock
		try {
			childThread.join();
		} catch (InterruptedException e) {
			System.err.println(e);
		} 
		*/
		
		for(int i = 0; i < 10; i++)
			System.out.println("Main Thread");
		
	}
}
