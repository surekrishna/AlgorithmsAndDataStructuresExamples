package com.krish.algorithms.and.datastructures;

/**
 * This is implemented, convert unsorted int array to sorted array and do selection sort to find index of number
 * @author M1033511
 *
 */
public class SortArrayBinarySearchExampleOne {

	public static void main(String[] args) {
		int[] numbers = new int[] {12,4,19,8,24,62,3,29,72,31};
		System.out.println("Before Sorting :: ");
		printArray(numbers);
		selectionSort(numbers);
		System.out.println("After Sorting :: ");
		printArray(numbers);
		int index = binarySearch(numbers,62);
		if(index == -1) {
			System.out.println("Number is not found!");
		}else {
			System.out.println("Number is found @Index = "+index);
		}
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
		
		for(int i = 0 ; i < length -1; i++) {
			int minIndex = i;
			for(int j = i+1; j<length; j++) {
				if(numbers[j] < numbers[minIndex]) {
					minIndex = j;
				}
			}
			
			int temp = numbers[minIndex];
			numbers[minIndex] = numbers[i];
			numbers[i] = temp;
		}
	}
	
	/**
	 * This method is used for print int array on the console
	 * @param numbers
	 */
	private static void printArray(int[] numbers) {
		for(int number : numbers) {
			System.out.print(number+" ");
		}
		System.out.println();
	}
	
	
	/**
	 * This method returns the index of x in numbers[]
	 * @param numbers
	 * @param findNumber
	 * @return
	 * 
	 * Algorithm steps 
	 *  ---------------
	 *  step-1  : firstNumber = 0
	 *	step-2  : lastNumber = arr.length
	 *	step-3  : while firstNumber <= lastNumber, go to step-12
	 *	step-4  : middleNumber = (firstNumber+lastNumber)/2
	 *	step-5  : if arr[middleNumber] == findNumber
	 *	step-6  : return middleNumber, go to step-11
	 *	step-7  : else if arr[middleNumber] < findNumber
	 *	step-8  : firstNumber = middleNumber+1, go to step-3
	 *	step-9  : else 
	 *	step-10 : lastNumber = middleNumber-1, go to step-3
	 *	step-11 : element found
	 *	step-12 : element not found
	 *	step-13 : exit	
	 */
	private static int binarySearch(int[] numbers, int findNumber) {
		int firstNumberNumber = 0;
		int lastNumber = numbers.length;
		
		while(firstNumberNumber <= lastNumber) {
			//int middle = firstNumber + (last - firstNumber)/2;
			int middleNumber = (firstNumberNumber + lastNumber)/2;

			////Returns index if the element is found
			if(numbers[middleNumber] == findNumber) 
				return middleNumber;
			else if(numbers[middleNumber] < findNumber) 
				firstNumberNumber = middleNumber + 1;
			else 
				lastNumber = middleNumber - 1;
		}
		
		//Returns -1 if the element is not found
		return -1;
	}
}
