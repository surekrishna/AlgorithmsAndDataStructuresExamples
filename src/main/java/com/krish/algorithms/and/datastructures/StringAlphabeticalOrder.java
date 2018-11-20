package com.krish.algorithms.and.datastructures;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This class is  created to sort the letters from the given string in alphabetical order
 * @author Krishna Sure
 *
 */
public class StringAlphabeticalOrder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to sort alphabetical order");
		String input = sc.next();
		char[] charArray = input.toCharArray();
		stringAlphabeticalOrder(charArray);
		System.out.println(charArray);
		System.out.println("Before alphabetical order ");
		System.out.println(charArray);
		//Sorting in alphabetical order using Arrays.sort() method
		Arrays.sort(charArray);
		System.out.println("After alphabetical order ");
		System.out.println(charArray);
		
		 
	}
	
	/**
	 * This method is created for sorting chars in alphabetical order without using Arrays.sort() method
	 * @param charArray
	 */
	private static void stringAlphabeticalOrder(char[] charArray) {
		int length = charArray.length;
		
		for(int i = 0; i < length; i++) {
			for(int j = i+1; j < length; j++) {
				if(charArray[i] > charArray[j]) {
					char temp = charArray[j];
					charArray[j] = charArray[i];
					charArray[i] = temp;
				}
			}
		}
	}

}
