package com.krish.algorithms.and.datastructures;

import java.util.Scanner;

/**
 * This class is created to delete vowels from the given string
 * @author Krishna Sure
 *
 */
public class DeleteVowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to delete vowels :: ");
		String text = sc.nextLine().toUpperCase();
		String removedVowels = "";
		for(char vowel : text.toCharArray()) {
			int result = isVowel(vowel);
			if(result == 0) {
				removedVowels = removedVowels + vowel;
			}
		}
		System.out.println("Remvoed Vowels :: "+removedVowels);
	}
	
	/**
	 * This method is used to find the given char is vowel or not
	 * @param vowel
	 * @return
	 */
	private static int isVowel(char vowel) {
		if('A' == vowel || 'E' == vowel || 'I' == vowel || 'O' == vowel || 'I' == vowel || 'U' == vowel)
			return 1;
		else
			return 0;
		
	}
}
