package com.krish.programs;

import java.util.Scanner;

/**
 * This class is created to check all chars of given text are same or not
 * @author Krishna Sure
 *
 */
public class IsAllCharsEqualInText {

	public static void main(String[] args) {
		
		String text = new Scanner(System.in).nextLine();
		int length = text.length();
		
		if(length < 2)
			System.out.println("Chars should be at least 2");
		else if(isSame(text,length))
			System.out.println("All chars are equal = " + text);
		else
			System.out.println("All chars are not equal = "+ text);
	}
	
	/**
	 * checking all chars of given text are same or not
	 * @param text
	 * @param length
	 * @return
	 */
	private static boolean isSame(String text, int length) {
		char first = text.charAt(0);
		
		for(int i = 1; i < length; i++)
			if(first != text.charAt(i))
				return false;
		
		return true;
	}
}
