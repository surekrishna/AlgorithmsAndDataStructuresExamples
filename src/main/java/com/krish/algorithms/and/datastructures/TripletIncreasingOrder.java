package com.krish.algorithms.and.datastructures;

public class TripletIncreasingOrder {

	public static void main(String[] args) {

		int numbers[] = { 1, 3, 4, 4 };
		tripletIncreasingOrder(numbers);

	}

	public static void tripletIncreasingOrder(int[] numbers) {
		int sequence = 1;
		int size = numbers.length;
		int minNumber = numbers[0];
		int second = Integer.MIN_VALUE;
		
		if (size < 3) {
			System.out.print("array size should be more than 3 numbers!");
			return;
		}

		for (int i = 1; i < size; i++) {
			
			if (minNumber == numbers[i]) {
				continue;
			} else if (numbers[i] < minNumber) {
				minNumber = numbers[i];
				continue;
			} else if (numbers[i] > second) {
				sequence++;
				if (sequence == 3) {
					System.out.println("Triplet: " + minNumber + ", " + second + ", " + numbers[i]);
					return;
				}
				second = numbers[i];
			}
		}

		System.out.print("No such triplet found");
	}

}
