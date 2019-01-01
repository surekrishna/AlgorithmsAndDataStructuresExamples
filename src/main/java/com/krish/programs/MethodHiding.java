package com.krish.programs;

public class MethodHiding {

	public static void main(String[] args) {
		ParentMethodHiding.printMessage();
		ChildMethodHiding.printMessage();
	}
	
}

class ParentMethodHiding {
	
	public static void printMessage() {
		System.out.println("Parent class printMessage() ");
	}
}

class ChildMethodHiding extends ParentMethodHiding{
	
	public static void printMessage() {
		System.out.println("Child class printMessage()");
	}
}