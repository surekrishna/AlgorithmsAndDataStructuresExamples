package com.krish.algorithms.and.datastructures;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * This class is created to print message without using System.out.println()
 * @author Krishna Sure
 *
 */
public class PrintMessage {

	public static void main(String[] args) {
		
		System.err.println("Style-1 "+"printing message using err.println method");
		System.err.printf("Style-2 "+"printing message using err.printf method\n");
		System.out.printf("Style-3 "+"printing message using out.printf method");
		PrintStream myout =  new PrintStream(new FileOutputStream(FileDescriptor.out));
		myout.print("\nStyle-4 printing message using printstream");
		try {
			System.out.write("\nStyle-5 printing message using out.write method".getBytes());
		} catch (IOException e) {
			System.err.println(e);
		}
		
	}
}
