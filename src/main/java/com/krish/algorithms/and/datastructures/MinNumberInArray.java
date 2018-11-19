package com.krish.algorithms.and.datastructures;

public class MinNumberInArray {

	public static void main(String[] args) {
		int[] numbers = {34, 82, 1, 60, 9, 234, 765, 71, 59, 121, 651, 42, 91, 771};
		selectionSort(numbers);
		minNumber(numbers);
	}
	
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
	
	private static void minNumber(int[] numbers) {
		System.out.println("Min Number = "+numbers[0]);
	}
}
