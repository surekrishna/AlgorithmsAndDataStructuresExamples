package com.krish.programs.MyPrograms;

import java.util.Scanner;

/**
 * source : https://practice.geeksforgeeks.org/problems/key-pair/0
 * 
 * @author krishnababu@bdcvit.com
 *
 */
public class KeyPair {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Length of an array.");
		int arrayLength = scanner.nextInt();
		int sumOfTwoNumbers = 0;
		int[] numbers = null;
		boolean isSumFound = false;
		int sumOfNumbers = 0;

		if (arrayLength > 0) {
			System.out.println("Enter Sum of SubArray.");
			sumOfTwoNumbers = scanner.nextInt();

			System.out.println("Enter Array Elements.");
			numbers = new int[arrayLength];

			for (int i = 0; i < numbers.length; i++) {
				numbers[i] = scanner.nextInt();
			}

			for (int i = 0; i < numbers.length; i++) {
				sumOfNumbers += numbers[i];

				for (int j = i + 1; j < numbers.length; j++) {
					sumOfNumbers += numbers[j];

					if (sumOfNumbers == sumOfTwoNumbers) {
						isSumFound = true;
						break;
					} else {
						sumOfNumbers = sumOfNumbers - numbers[j];
					}
				}
			}

			if (isSumFound)
				System.out.println("Found");
			else
				System.out.println("Not Found");

		}
	}

}
