package com.krish.algorithms.and.datastructures;

//Output :- -1 1 2 3 4 -1 6 -1 -1 9 
public class RearrangeArray {

	public static void main(String[] args) {
		int[] numbers = { -1, -1, 6, 1, 9, 3, 2, -1, 4, -1 };
		for (int i = 0; i < numbers.length;) {
			if (numbers[i] >= 0 && numbers[i] != i) {
				int element = numbers[numbers[i]];
				numbers[numbers[i]] = numbers[i];
				numbers[i] = element;
			} else {
				i++;
			}
		}
		
		for(int number : numbers) {
			System.out.print(number + " ");
		}
	}

}
