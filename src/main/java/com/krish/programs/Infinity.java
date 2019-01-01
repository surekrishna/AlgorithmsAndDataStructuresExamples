package com.krish.programs;

/**
 * This class is created, Difference between 1/0 and 1.0/0.0
 * @author Krishna Sure
 *
 */
public class Infinity {

	public static void main(String[] args) {
		System.out.println(1.0/0.0);//Infinity
		System.out.println(1.0/0);//Infinity
		System.out.println(1/0.0);//Infinity
		System.out.println(-1.0/0.0);//-Infinity
		System.out.println(-1.0/0);//-Infinity
		System.out.println(-1/0.0);//-Infinity
		System.out.println(1/0);//java.lang.ArithmeticException: / by zero
	}
}
