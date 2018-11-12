package com.krish.algorithms.and.datastructures;

/**
 * @author Krishna Sure
 * Java program implementation of selection sort
 */
public class SelectionSortExampleOne {

	public static void main(String[] args) {
		int[] numbers = new int[] {12,8,23,65,9,51,4};
		System.out.println("Before Selection Sort {} ");
		printSortedArray(numbers);
		selectionSort(numbers);
		System.out.println();
		System.out.println("After Selection Sort {} ");
		printSortedArray(numbers);
	}
	
	/**
	 * This method returns the sorted int array
	 * finds the minimum element in numbers[] and place it in beginning
	 * @param numbers
	 * 
	 * Algorithm steps
	 * step-1 : i = 0
	 * step-2 : min_index = i
	 * step-3 : j = i + 1, go to step-7
	 * step-4 : if numbers[j] < numbers[min_index], go to step-3
	 * step-5 : min_index = j
	 * step-6 : temp = numbers[min_index], numbers[min_index] = numbers[i], numbers[i] = temp
	 * step-7 : i++, go to step-1
	 * step-8 : exit
	 */
	private static void selectionSort(int[] numbers) {
		int length = numbers.length;
		
		for(int i = 0; i < length-1; i++) {
			int min_index = i;
			for(int j = i+1; j < length; j++) {
				//Below code is for Sorting in Ascending order
				if(numbers[j] < numbers[min_index]) {
					min_index = j;
				}
				//Below code is for Sorting in Descending order
				/*if(numbers[min_index] < numbers[j]) {
					min_index = j;
				}*/
			}
			int temp = numbers[min_index];
			numbers[min_index] = numbers[i];
			numbers[i] = temp;
		}
	}
	
	/**
	 * This method is prints the given int array
	 * @param numbers
	 */
	private static void printSortedArray(int numbers[]) {
		for(int number : numbers) {
			System.out.print(number+" ");
		}
	}
}
