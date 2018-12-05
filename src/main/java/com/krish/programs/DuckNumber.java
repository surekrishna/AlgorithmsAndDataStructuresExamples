package com.krish.programs;

import java.util.Scanner;

/**
 * This class is created to check entered number is Duck Number or not
 * @author Krishna Sure
 *
 */
public class DuckNumber {

	static char zero = '0';
	
	public static void main(String[] args) {
		
		String input = new Scanner(System.in).nextLine();
		
		if(input.charAt(0) == zero)
			System.out.println("Entered number is not a Duck Number = "+input);
		else	
			isDuckNumber(input);
	}
	
	/**
	 * This method created to check Duck Number
	 * @param number
	 */
	private static void isDuckNumber(String number) {
		int length = number.length();
		
		for(int i = 0; i < length; i++)
			if(zero == number.charAt(i))
				System.out.println("Entered number is Duck Number = "+number);
		
	}
		
}
