package com.krish.programs;

public class ReverseArrayDifferentWays {

	public static void main(String[] args) {
		int[] nums = new int[]{12,4,78,23,45};
		int length = nums.length-1;
		
		printArray(nums);
		nIterations(nums, length);
		printArray(nums);
		
		nByTwoIterations(nums, length);
		printArray(nums);
	}
	
	private static void printArray(int[] numbers) {
		for(int number : numbers)
			System.out.print(number+" ");
		
		System.out.println();
	}
	
	private static void nIterations(int[] numbers, int length) {
		for(int i = 0, l = length; i < l; i++,l--) {
			int temp = numbers[i];
			numbers[i] = numbers[l];
			numbers[l] = temp;
		}
	}
	
	private static void nByTwoIterations(int[] numbers, int length) {
		int middle = length/2;
		
		for(int i = 0; i < middle ; i++) {
			int temp = numbers[i];
			numbers[i] = numbers[length-i];
			numbers[length-i] = temp;
		}
	}

}
