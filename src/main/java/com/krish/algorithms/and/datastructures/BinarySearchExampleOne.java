package com.krish.algorithms.and.datastructures;

/**
 * 
 * @author Krishna Sure
 * Java code for binary search x in numbers[].  If findNumber  
 * is present  then return its  location,  otherwise 
 * return -1 
 *
 */
public class BinarySearchExampleOne {

	public static void main(String[] args) {
		int[] numbers = new int[] {1,5,9,12,26,37,45,56,69,89,92,129,147,189,200,247,280,321,452,567,689,711,913};
		int findNumber = 92;
		int index = binarySearch(numbers, findNumber);
		if(index == -1) {
			System.out.println("Binary Search index of Number Not Found {} "+index);
		}else {
			System.out.println("Binary Search index of Number Found @ {} "+index);
		}

	}
	
	/**
	 * This method returns the index of x in numbers[]
	 * @param numbers
	 * @param findNumber
	 * @return
	 * 
	 *  Algorithm steps 
	 *  ---------------
	 *  step-1  : first = 0
	 *	step-2  : last = arr.length
	 *	step-3  : while first <= last, go to step-12
	 *	step-4  : middle = (first+last)/2
	 *	step-5  : if arr[middle] == findNumber
	 *	step-6  : return middle, go to step-11
	 *	step-7  : else if arr[middle] < findNumber
	 *	step-8  : first = middle+1, go to step-3
	 *	step-9  : else 
	 *	step-10 : last = middle-1, go to step-3
	 *	step-11 : element found
	 *	step-12 : element not found
	 *	step-13 : exit	 
	 */
	private static int binarySearch(int[] numbers, int findNumber) {
		int first = 0;
		int last = numbers.length;
		
		while(first <= last) {
			
			//int middle = first + (last - first)/2;
			int middle = (first + last)/2;

			////Returns index if the element is found
			if(numbers[middle] == findNumber) {
				return middle;
			}else if(numbers[middle] < findNumber) {
				first = middle + 1;
			}else {
				last = middle - 1;
			}
			
		}
		
		//Returns -1 if the element is not found
		return -1;
	}

}
