package com.krish.programs;

public class NumberPatternTwo {

	public static void main(String[] args) {
		patternTwo(7);
	}
	
	private static void patternTwo(int noOfRows) {
		for(int i = 1; i <= noOfRows; i++) {
			for(int j = 1; j <= noOfRows-i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
