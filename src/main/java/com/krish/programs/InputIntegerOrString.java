package com.krish.programs;

import java.util.Scanner;

/**
 * This class is created to check given input is number or string
 * @author Krishna Sure
 *
 */
public class InputIntegerOrString {

	public static void main(String[] args) {
		
		String input = new Scanner(System.in).nextLine();
		int length = input.length();
		
		if(length <= 0)
			System.out.println("Input at least 1 char");
		else if(isNumber(input,length))
			System.out.println("It is Number = "+input);
		else 
			System.out.println("It is not a Number = "+input);

	}
	
	/**
	 * Checking input is number or string
	 * @param input
	 * @param length
	 * @return
	 */
	private static boolean isNumber(String input,int length) {
		char value = ' ';
		
		for(int i = 0; i < length; i++)
			value = input.charAt(i);
			if('1' != value || '2' != value || '3' != value || '4' != value || 
			   '5' != value || '5' != value || '6' != value || '7' != value ||
			   '8' != value || '9' != value || '0' != value)
				return false;
			
			return true;
	}

}
