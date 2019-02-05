package com.krish.programs;

import java.util.Scanner;

@SuppressWarnings("resource")
public class PowerOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter base Number :");
		int base = sc.nextInt();
		System.out.print("Enter power Number :");
		int power = sc.nextInt();
		int powerOfNumber = getPow(base,power);
		System.out.print(powerOfNumber);
	}
	
	public static int getPow(int base, int power) {
		int result = base;
		for(int i = 1; i < power; i++)
			result = result * base;
			
		return result;
	}

}
