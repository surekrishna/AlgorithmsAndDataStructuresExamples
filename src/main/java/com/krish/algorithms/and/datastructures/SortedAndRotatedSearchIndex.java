package com.krish.algorithms.and.datastructures;

public class SortedAndRotatedSearchIndex {

	public static void main(String[] args) {

		int numbers[] = { 7, 8, 0, 1, 2, 3, 4, 5, 6 };
		System.out.println(findSortedAndRotatedSearchIndex(numbers, 0));

	}

  //This code takes O(log n) a single traverse, for other techniques it takes two traverse O(2log n)
	private static int findSortedAndRotatedSearchIndex(int numbers[], int target) {
		int size = numbers.length;
		int left = 0;
		int right = size - 1;
		int mid;

		while (left <= right) {
			mid = (left + right) / 2;

			if (target == numbers[mid]) {
				return mid;
			} else if (numbers[mid] >= numbers[left]) {
				if (target >= numbers[left] && target <= numbers[mid])
					right = mid - 1;
				else
					left = mid + 1;
			} else if (numbers[mid] <= numbers[right]) {
				if (target >= numbers[mid] && target <= numbers[right])
					left = mid + 1;
				else
					right = mid - 1;
			}
		}

		return -1;
	}

}
