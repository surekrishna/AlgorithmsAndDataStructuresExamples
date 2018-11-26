package com.krish.programs;

public class NumberPatternOne {

	public static void main(String[] args) {
		patternOne(5);
	}
	
	private static void patternOne(int noOfRows) {
		int temp = 1;
		
		for(int i = 1; i <= noOfRows; i++) {
		
			for(int k = i; k <= noOfRows; k++)
				System.out.print(" ");
			
			for(int j = 1; j <= i; j++) {
				System.out.print(temp+" ");
				++temp;
			}
			
			System.out.println();
		}
	}
}
