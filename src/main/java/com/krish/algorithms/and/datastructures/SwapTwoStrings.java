package com.krish.algorithms.and.datastructures;

import java.util.Scanner;

/**
 * This is created to swap two given strings
 * @author Krishna Sure
 *
 */
public class SwapTwoStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String ");
		String first = sc.next();
		System.out.println("Enter Second String ");
		String second = sc.next();
		System.out.println("Before Swap");
		System.out.println("First = "+first);
		System.out.println("Second = "+second);
		first = first + second;
		second = first.substring(0, first.length()-second.length());
		first = first.substring(second.length());
		System.out.println("After Swap");
		System.out.println("First = "+first);
		System.out.println("Second = "+second);
	}
}
