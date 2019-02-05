package com.krish.algorithms.and.datastructures;

public class JumpSearch {

	public static void main(String[] args) {
		int[] numbers = new int[] {12,4,19,8,24,62,3,29,72,31};
		int index = jumpSearch(numbers, 12);
		System.out.println(index);
	}
	
	public static int jumpSearch(int[] numbers, int findNumber) {
		int length = numbers.length - 1;
		int increment = 4;
		int i ;
		
		for(i = 0; i <= length; i = i++) {
			
			if(numbers[i] == findNumber) {
				return i;
			}else if(numbers[i] < findNumber) {
				i = i + increment;
			}else if( numbers[i] > findNumber) {
				i = i - increment >= 0 ? i - increment : i;
				for(int j = i; j < length ; j++) {
					if(numbers[j] == findNumber)
						return j;
				}
			}
			
		}
		
		return i;
	}

}
