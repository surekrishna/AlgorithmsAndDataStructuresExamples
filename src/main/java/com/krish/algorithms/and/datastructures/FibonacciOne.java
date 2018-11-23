package com.krish.algorithms.and.datastructures;

import java.util.Scanner;

/**
 * This class is created to get the fibonacci numbers till the limit of entered number
 * @author Krishna Sure
 *
 */
public class FibonacciOne {

	public static void main(String[] args) {
		System.out.println("Enter number to get Fibnacci ");
		int input = new Scanner(System.in).nextInt();
		
		for(int i = 1; i <= input; i++) {
			System.out.print(fibonacci(i)+" ");	
		}

		System.out.println();
		
		for(int i = 1; i <= input; i++) {
			System.out.print(fibonacciRecursion(i)+" ");	
		}
		
	}
	
	/**
	 * This method is created to get the fibonacci sequence number
	 * @param number
	 * @return
	 */
	private static int fibonacci(int number) {
		
		if(number == 1 || number == 2)
			return 1;
		
		int first = 1, second = 1, third = 1;
		for(int i = 3; i <= number; i++) {
			third = first + second;
			first = second;
			second = third;
		}
		
		return third;
	}
	
	/**
	 * This method is created to get the fibonacci sequence number by using recursion
	 * @param number
	 * @return
	 */
	private static int fibonacciRecursion(int number) {
		
		if(number == 1 || number == 2)
			return 1;
		
		return fibonacciRecursion(number - 2) + fibonacciRecursion(number - 1);
	}
}
 