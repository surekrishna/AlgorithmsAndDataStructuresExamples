package com.krish.algorithms.and.datastructures;

/**
 * This class is created to reverse the given int array
 * @author Krishna Sure
 *
 */
public class ReverseAnArray {

	public static void main(String[] args) {
		int[] numbers = {5,7,1,34,29,67,49,81,31,299};
		printArray(numbers);
		reverseArray(numbers);
		printArray(numbers);
	}
	
	/**
	 * method to reverse given int array
	 * @param numbers
	 */
	private static void reverseArray(int[] numbers) {
		int length = numbers.length;
		int loop = length/2;
		for(int i = 0; i < loop; i++) {
			int temp = numbers[i];
			numbers[i] = numbers[length-i-1];
			numbers[length-i-1] = temp;
		}
	}
	
	/**
	 * printing the int array
	 * @param numbers
	 */
	private static void printArray(int[] numbers) {
		for(int number : numbers) {
			System.out.print(number+" ");
		}
		System.out.println();
	}
}
