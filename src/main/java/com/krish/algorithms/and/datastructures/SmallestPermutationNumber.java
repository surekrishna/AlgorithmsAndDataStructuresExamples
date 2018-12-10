package com.krish.algorithms.and.datastructures;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestPermutationNumber {

	public static void main(String[] args) {

		System.out.println("Enter Number to get SmallestPermutationNumber");
		String input = new Scanner(System.in).nextLine();
		
		int length = input.length();
		char[] chars = input.toCharArray();
		Arrays.sort(chars);
		
		if(length < 1)
			System.out.println("At least input should be greater than one numbers");
		else if(input.indexOf("0") <= 0) {
			System.out.print("SmallestPermutationNumber = ");
			System.out.println(chars);
		}else if(input.indexOf("0") >= 0) {
			int i = 0; 
	        while (chars[i] == '0')  
	            i++; 
	           
	        char temp = chars[0]; 
	        chars[0] = chars[i]; 
	        chars[i] = temp;
	        
	        System.out.print("SmallestPermutationNumber = ");
	        System.out.println(chars);
		}
		
	}
}
