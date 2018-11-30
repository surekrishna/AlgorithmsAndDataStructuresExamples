package com.krish.programs;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * This class is created for, Creating Thread using Callable interface
 * @author Krishna Sure
 *
 */
public class CreatingThreadUsingCallable {

	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newCachedThreadPool();
		
		Future<String> result = executor.submit(new Callable<String>() {
			@Override
			public String call() throws Exception {
				System.out.println(Thread.currentThread().getName());
				String otp = "";
				String numbers = "123456789";
				for(int i = 0; i < 5; i++) {
					otp = otp + numbers.charAt((int) (Math.random()*i));
				}
				return otp;
			}
		});
		
		executor.shutdown();
		try {
			System.out.println(Thread.currentThread().getName());
			System.out.println("OTP is = "+result.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}
}
