package com.krish.algorithms.and.datastructures.main;

public class Zoo {

	public static void main(String[] args) {
		code1("zzzoooooo");
		code2("zoo");
	}

	public static void code1(String name) {
		int countz = 0;
		int counto = 0;
		int length = name.length();
		for (int i = 0; i < length; i++) {
			if ('z' == name.charAt(i))
				countz += 1;
			else if ('o' == name.charAt(i))
				counto += 1;
		}

		if (counto == (countz * 2))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	public static void code2(String name) {
		int countx = 0;
		int county = 0;
		char value = name.charAt(0);
		int length = name.length();
		for (int i = 0; i < length; i++) {
			if (value == name.charAt(i))
				countx += 1;
			else
				county += 1;
		}

		if (countx > county && countx == (county * 2))
			System.out.println("Yes");
		else if (county > countx && county == (countx * 2))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
