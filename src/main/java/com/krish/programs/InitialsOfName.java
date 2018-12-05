package com.krish.programs;

/**
 * This class is created to print the initials of a name with upper case
 * @author Krishna Sure
 *
 */
public class InitialsOfName {

	public static void main(String[] args) {
		
		String name = " keen krishna sure  ".trim();
		int length = name.length();
		
		System.out.println(name);
		System.out.print(String.valueOf(name.charAt(0)).toUpperCase());
		
		for(int i = 0; i < length; i++)
			if(name.charAt(i) == ' ')
				System.out.print(" "+String.valueOf(name.charAt(i+1)).toUpperCase());
	}
}
