package com.krish.programs;

import java.util.Scanner;

/**
 * This class is created to find the first and last number from the given number
 * @author Krishna Sure
 *
 */
public class FirstAndLastNumbers {

	public static void main(String[] args) {
		
		int input = new Scanner(System.in).nextInt();
		
		if(input < 10 && input >= 0)
			System.out.println("Number should be greater than equal to 10");
		else 
			firstLastNumbers(input);
	}
	
	/**
	 * Finding first and last numbers from the input number
	 * @param number
	 */
	private static void firstLastNumbers(int number) {
		int temp = number;
		while(temp >= 10)
			temp /= 10;
		
		System.out.println("First Number = "+temp);
		System.out.println("Last Number = "+number%10);
	}

}
