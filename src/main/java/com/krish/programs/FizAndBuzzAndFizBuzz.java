package com.krish.programs;

import java.util.Scanner;

/**
 * This program is created to find the multiples of 3 and 5 for the inputs and printing fizz, buzz and fizzbuzz based on the condition
 * @author Krishna Sure
 *
 */
public class FizAndBuzzAndFizBuzz {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		
		System.out.println("How Many numbers to process?");
		int itr = new Scanner(System.in).nextInt();

		for (int i = 1; i <= itr; i++) {
		
			System.out.println("Enter Number to print fizz,buzz and fizzbuzz!");
			int num = new Scanner(System.in).nextInt();
			
			for (int j = 1; j <= num; j++) {
				
				if(j % 3 == 0 && j % 5 == 0)
					System.out.println("FizzBuzz");
				else if (j % 3 == 0)
					System.out.println("Fizz");
				else  if (j % 5 == 0)
					System.out.println("Buzz");
				else
					System.out.println(j);
			}
		}
	}
}
