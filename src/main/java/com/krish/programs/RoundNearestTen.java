package com.krish.programs;

import java.util.Scanner;

/**
 * This calls is created to find the nearest multiple of ten for the given number
 * @author Krishna Sure
 *
 */
public class RoundNearestTen {

	public static void main(String[] args) {
		int input = new Scanner(System.in).nextInt();
		
		if(input <= 0)
			System.out.println("Number should be greater than zero.");
		else if(input <= 9 && input >= 1)
			System.out.println("Nearest Multiple of Ten = "+10);
		else 
			nearestRoundFigure(input, input%10);
		
	}
	
	/**
	 * Finding the nearest multiple of ten
	 * @param number
	 * @param reminder
	 */
	private static void nearestRoundFigure(int number, int reminder) {
		if(reminder < 5)
			System.out.println("Nearest Multiple of Ten = "+(number-reminder));
		else if(reminder >= 5)
			System.out.println("Nearest Multiple of Ten = "+number+(10-reminder));
	}
}
