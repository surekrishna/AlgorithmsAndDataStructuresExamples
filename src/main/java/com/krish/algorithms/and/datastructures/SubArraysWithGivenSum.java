package com.krish.algorithms.and.datastructures;

/**
 * Input 
 * int arr[] = {3,4,-7,1,3,3,1,-4};
 * int sum = 7;
 * Output - only indexes		
 * {0,1}
 * {0,5}
 * {3,5}
 * {4,6}
 * Output - Only values subarray
 * [3, 4]
 * [3, 4, -7, 1, 3, 3]
 * [1, 3, 3]
 * [3, 3, 1]
 * Output
 * 0 1
 * [3, 4]
 * 0 5
 * [3, 4, -7, 1, 3, 3]
 * 3 5
 * [1, 3, 3]
 * 4 6
 * [3, 3, 1]
 * @author krishnababu@bdcvit.com
 *
 */
public class SubArraysWithGivenSum {

	public static void main(String[] args) {
		int arr[] = {3,4,-7,1,3,3,1,-4};
		int length = arr.length;
		int sum = 7;

		for(int i = 0; i< length; i++) {
			int currSum = 0;
			for(int j = i; j < length; j++) {
				currSum += arr[j];
				
				if(currSum == sum) {
					System.out.println(i + " " + j);
				}
			}
		}
	}

	private static void getSubArray(int arr[], int firstIndex, int lastIndex) {
		System.out.println(IntStream.range(firstIndex, lastIndex + 1).mapToObj(k -> arr[k]).collect(Collectors.toList()));
	}
}
