package com.krish.algorithms.and.datastructures;

/**
 * This class is created to find the Max Number from the given array
 * @author Krishna Sure
 *
 */
public class MaxNumberInArray {

	public static void main(String[] args) {
		//int[] numbers = new int[] {23,67,91,2,7,10,47,61,234,189,29,341,66};
		//int[] numbers = new int[] {23,67,91,2};
		int[] numbers = {34, 82, 1, 60, 9, 234, 765, 71, 59, 121, 651, 42, 91, 771};
		//int[] numbers = {1, 99, 10000, 84849, 111, 212, 314, 21, 442, 455, 244, 554, 22, 22, 211};
		//Finding max number without using sorting technique
		findMaxNumber(numbers);
		//Sorting the give unsorted array
		selectionSort(numbers);
		//Finding the max number from the sorted array
		maxNumber(numbers);
	}
	
	/**
	 * Finding Max Number in the array without using sorting technique
	 * @param numbers
	 */
	private static void findMaxNumber(int[] numbers) {
		int length = numbers.length;
		int maxNumber = 0;
		int index = 0;
		for(int i = 0 ; i < length; i++) {
			if(maxNumber < numbers[i]) {
				maxNumber = numbers[i];
				index = i;
			}
		}
		System.out.println("Finding Max Number without using sorting technique");
		System.out.println("Max Number = "+maxNumber+" Index = "+(index+1));
	}
	
	/**
	 * Finding Max Number in the array by using selection sorting technique
	 * @param numbers
	 */
	private static void selectionSort(int[] numbers) {
		int lengthIn = numbers.length;
		int lengthOut = lengthIn-1;
		
		for(int i = 0; i < lengthOut; i++) {
			int minIndex = i;
			for(int j = i+1; j < lengthIn; j++) {
				if(numbers[minIndex] > numbers[j]) {
					minIndex = j;
				}
			}
			int temp = numbers[minIndex];
			numbers[minIndex] = numbers[i];
			numbers[i] = temp;
		}
	}
	
	private static void maxNumber(int[] numbers) {
		int index = numbers.length-1;
		System.out.println("\nFinding Max Number using selection sort");
		System.out.println("Max Number = "+numbers[index]+" Index = "+index);
	}
}
