package com.krish.programs;

/**
 * This class created for Dead Lock situation main thread is waiting it self
 * Main thread is calls join() itself, then Dead Lock forms
 * @author Krishna Sure
 *
 */
public class DeadLockOne {

	public static void main(String[] args) {
		try {
			Thread.currentThread().join();
		} catch (InterruptedException e) {
			System.err.println(e);
		}
	}
}
