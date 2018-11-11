package com.krish.algorithms.and.datastructures;

/**
 * @author Krishna Sure
 * Java code for linearly search x in arr[].  If x  
 * is present  then return its  location,  otherwise 
 * return -1 
 */
public class LinearSerachExampleOne {

	public static void main(String[] args) {
		//array of n numbers
		int[] randomNumbers = new int[] {1,3,6,78,34,87,23,781,356,991,234,12,56,72,521};
		int x = 234;		
		int index = getIndexOfNumber(randomNumbers, x);
		System.out.println("Index of Random Number {} "+index);
	}
	
	/**
	 * This method returns the index of x in randomNumbers[]
	 * @param randomNumbers
	 * @param x
	 * @return
	 * 
	 *  Algorithm steps 
	 *  ---------------
	 *  step-1 : i = 0
	 *	step-2 : if i < randomNumbers.length, go to step 7
	 *	step-3 : if randomNumbers[i] != x, go to step 6
	 *	step-4 : i = i+1
	 *	step-5 : go to step 2
	 *	step-6 : element found
	 *	step-7 : element not found
	 *	step-8 : exit
	 */
	private static int getIndexOfNumber(int[] randomNumbers, int x) {
		for(int i = 0; i < randomNumbers.length; i ++) {
			//Returns index if the element is found
			if(randomNumbers[i] == x) {
				return i;
			}			
		}
		//Returns -1 if the element is not found
		return -1;
	}

}
