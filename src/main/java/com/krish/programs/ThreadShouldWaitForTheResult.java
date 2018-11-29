package com.krish.programs;

public class ThreadShouldWaitForTheResult {
	static String otp = ""; 

	public static String getOtp() {
		String numbers = "123456789";
		for(int i =1; i <= 5; i++) {
			otp = otp + numbers.charAt((int) (Math.random()*i));
		}
		return otp;
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(() ->  {
			for(int i =0; i<10; i++) {
				System.out.println("Child Thread = "+i);
			}
			otp = getOtp();
		});
		t1.start();
		t1.join();
		System.out.println("OTP = "+otp);
		System.out.println("I Won't Print until i got the OTP.");
	}
}
