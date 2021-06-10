package com.krish.algorithms.and.datastructures;

public class AABBCCA2B2C2 {

	public static void main(String[] args) {
		String input = "aaaaaabbbcc";
		int length = input.length();
		String output = "";
		for (int i = 0; i < length - 1; i++) {
			int count = 1;
			while (i + 1 < length && input.charAt(i) == input.charAt(i + 1)) {
				count++;
				i++;
			}
			output += input.charAt(i) + String.valueOf(count);
		}

		System.out.println(output);
	}
}
