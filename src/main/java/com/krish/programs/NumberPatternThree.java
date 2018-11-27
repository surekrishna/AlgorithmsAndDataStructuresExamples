package com.krish.programs;

public class NumberPatternThree {

	public static void main(String[] args) {
		patternThree(7);
	}
	
	private static void patternThree(int noOfRows) {
		
		for(int i = 1; i <= noOfRows; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
}
