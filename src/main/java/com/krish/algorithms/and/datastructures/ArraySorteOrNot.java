package com.krish.algorithms.and.datastructures;

/**
 * This class is created to check whether the given array is sorted or not
 * @author Krishna Sure
 *
 */
public class ArraySorteOrNot {

	public static void main(String[] args) {

		int[] sortedNumbers = new int[] {1,4,5,8,9,13,17,21,26,39};
		int[] notSortedNumbers = new int[] {7,16,36,43,9,24};
		System.out.println("Array is Sorted or Not = "+isArraySortedOrNot(sortedNumbers));
		System.out.println("Array is Sorted or Not = "+isArraySortedOrNot(notSortedNumbers));

	}
	
	/**
	 * This method created to check the given array is sorted or not
	 * @param numbers
	 * @return
	 */
	private static boolean isArraySortedOrNot(int[] numbers) {
		int length = numbers.length-1;
		for(int i = 0; i < length; i++) 
			if(numbers[i] > numbers[i+1])
				return false;
		
		return true;
	}

}
