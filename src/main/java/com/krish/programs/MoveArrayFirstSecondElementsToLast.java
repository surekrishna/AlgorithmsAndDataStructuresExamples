package com.krish.programs;

/**
 * This class is created split array and add at the end
 * @author Krishna Sure
 *
 */
public class MoveArrayFirstSecondElementsToLast {

	public static void main(String[] args) {
		
		int[] numbers = new int[] {1,2,3,4,5,6,7,8,9};
		int positionsToMove = 2;
		printArray(numbers);
		moveElements(numbers,positionsToMove);
		printArray(numbers);
	}
	
	/**
	 * This method is created to shift the number of positions from first to last of an array
	 * @param numbers
	 * @param position
	 */
	private static void moveElements(int[] numbers, int position) {
		
		int length = numbers.length;
		
		for(int i = 1; i <= position; i++) {
			int temp = numbers[0];
			
			for(int j = 0; j < length-1; j++)
				numbers[j] = numbers[j+1];
			
			numbers[length-1] = temp;
		}
			
	}
	
	private static void printArray(int[] numbers) {
		for(int number : numbers) {
			System.out.print(number+" ");
		}
		System.out.println();
	}
}
