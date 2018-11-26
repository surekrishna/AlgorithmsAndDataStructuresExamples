package com.krish.algorithms.and.datastructures;

/**
 * This class is created My own Stack implementation
 * @author Krishna Sure
 *
 */
public class StackOne {
	
	static int top = -1;
	static int maxSize = 5;
	static int[] numbers = new int[maxSize];
	
	public static void main(String[] args) {
		StackOne stack = new StackOne();
		System.out.println("Stack isEmpty = "+stack.isEmpty());
		printArray(numbers);
		//System.out.println(stack.pop(1));//com.krish.algorithms.and.datastructures.StackEmptyException: Stack is Empty
		stack.push(1);
		stack.push(3);
		stack.pop(3);
		stack.push(6);
		stack.peek(6);
		System.out.println("Stack isEmpty = "+stack.isEmpty());
		printArray(numbers);
		System.out.println("Stack isFull = "+stack.isFull());
		System.out.println("Searching for index the number ("+3+") = "+stack.search(numbers, 3));
		System.out.println("Searching for index the number ("+6+") = "+stack.search(numbers, 6));
		stack.push(8);
		stack.push(7);
		stack.push(12);
		//stack.push(24);//(maxSize = 5)com.krish.algorithms.and.datastructures.StackFullException: Stack is Full 
		printArray(numbers);
	}
	
	private int push(int number) {
		
		if(isFull())
			throw new  StackFullException("Cannot push "+number+", Stack is Full");
		
		return numbers[++top] = number;
	}
	
	private int pop(int number){
		
		if(isEmpty())
			throw new StackEmptyException("Stack is Empty");
			
		return numbers[--top];
	}
	
	private int peek(int number){
		return numbers[top];
	}
	
	private boolean isEmpty() {
		return top<0;
	}
	
	private boolean isFull() {
		return top == maxSize-1;
	}
	
	private int search(int[] numbers, int find) {
		int length = numbers.length-1;
		
		for(int i = 0; i < length; i++) {
			if(numbers[i] == find)
				return i;
		}
		
		return -1;
	}
	
	private static void printArray(int[] numbers) {
		for(int number : numbers) {
			System.out.print(number+" ");
		}
		System.out.println();
	}
}

class StackEmptyException extends RuntimeException {
	
	public StackEmptyException(){
		super();
	}
	
	public StackEmptyException(String message){
		super(message);
	}
}

class StackFullException extends RuntimeException {
	
	public StackFullException(){
		super();
	}
	
	public StackFullException(String message){
		super(message);
	}
}
