package com.krish.algorithms.and.datastructures;

public class FindNumberFromArrayWithoutUsingArraySize {

	public static void main(String[] args) {
		int numbers[] = {1,2,3,4,5,6,7,8,9};
		int index = findIndex(numbers, 8);
		if(index != 1)
			System.out.println("Index is : " + index);
		else
			System.out.println("Can't find number!");
		
		int index1 = findIndex1(numbers, 23, 11);
		if(index1 != -1)
			System.out.println("Index is : " + index1);
		else
			System.out.println("Can't find number!");
	}
	
	private static int findIndex(int numbers[], int number) {
		int index = 0;
		for(int num : numbers) {
			if(num == number)
				return index;
			
			index++;
		}
		
		return -1;
	}
	
	private static int findIndex1(int numbers[], int number, int size) {
		try {
			for(int i = 0; i < size; i++) {
				if(number == numbers[i])
					return i;
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			
		}
		
		return -1;
	}

}
