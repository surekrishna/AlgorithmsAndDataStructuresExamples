package com.krish.algorithms.and.datastructures;

public class ArrayMaxTwoNumbers {

	public static void main(String[] args) {
		int[] numbers = new int[] {23,45,1,9,42,71,58,31,212};
		printArray(numbers);
		maxTwoNumbers(numbers);
	}
	
	private static void maxTwoNumbers(int[] numbers) {
		int last = 0, beforeLast = 0;
		
		for(int number : numbers) {
			if(last < number) {
				beforeLast = last;
				last = number;
			}else if(beforeLast < number) {
				beforeLast = number;
			}
		}
		
		System.out.println("Before Last Number= "+beforeLast);
		System.out.println("Last Number = "+last);
	}
	
	private static void printArray(int[] numbers) {
		for(int number : numbers) {
			System.out.print(number+" ");
		}
		System.out.println();
	}
}
