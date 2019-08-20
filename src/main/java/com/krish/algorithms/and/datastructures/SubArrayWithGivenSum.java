package com.krish.programs.MyPrograms;

import java.util.Scanner;

/**
 * source :
 * https://practice.geeksforgeeks.org/problems/subarray-with-given-sum/0
 * 
 * @author krishnababu@bdcvit.com
 *
 */
public class SubArrayWithGivenSum {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Length of an array.");
		int arrayLength = scanner.nextInt();
		int sumOfSubArray = 0;
		int[] numbers = null;
		boolean isSumFound = false;
		int header = 0;
		int subArraySum = 0;

		if (arrayLength > 0) {
			System.out.println("Enter Sum of SubArray.");
			sumOfSubArray = scanner.nextInt();

			System.out.println("Enter Array Elements.");
			numbers = new int[arrayLength];

			for (int i = 0; i < numbers.length; i++) {
				numbers[i] = scanner.nextInt();
			}

			for (int i = 0; i < numbers.length; i++) {
				subArraySum += numbers[i];

				if (subArraySum == sumOfSubArray) {
					isSumFound = true;
					break;
				}

				while (subArraySum > sumOfSubArray) {
					subArraySum = subArraySum - numbers[header];
					header++;
				}
			}

		}

		if (isSumFound) {
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}

	}

}
