package com.krish.algorithms.and.datastructures;

class Stack {

	int top = 0;
	int maxSize = 5;
	int numbers[] = new int[maxSize];
	
	public void push(int data) throws Exception {
		if(isFull())
			throw new Exception("Stack is Full can't add elements!");
		
		numbers[top] = data;
		top++;
	}
	
	public int pop() throws Exception {
		if(isEmpty())
			throw new Exception("Stack is empty!");

		--top;
		int number = numbers[top];
		numbers[top] = 0;
		return number;
	}
	
	public int peek() throws Exception {
		if(isEmpty())
			throw new Exception("Stack is empty!");
		
		return numbers[top - 1];
	}
	
	public int min() throws Exception {
		int min = numbers[0];
		for(int number : numbers) {
			if(min > number)
				min = number;
		}
		
		return min;
	}
	
	public int max() throws Exception {
		int max = numbers[0];
		for(int number : numbers) {
			if(max < number)
				max = number;
		}
		
		return max;
	}
	
	public void show() throws Exception {
		for(int number : numbers) {
			System.out.print(number + " ");
		}
		System.out.println();
	}

	public boolean isFull() {
		return maxSize == top;
	}
	
	public boolean isEmpty() {
		return top < 0;
	}
	
}

public class StackTwo {
	public static void main(String[] args) throws Exception {

		Stack stack = new Stack();	
		stack.show();//This will print all zeros
		//stack.pop();//This will give Exception: Stack is empty!
		
		System.out.println("Min number : " + stack.min());
		
		stack.push(1);
		stack.show();
		System.out.println(stack.peek());
		stack.pop();
		stack.show();
		
		stack.push(2);
		stack.push(5);
		stack.push(7);
		stack.push(8);
		stack.push(-4);
		//stack.push(3);
		
		System.out.println("Min number : " + stack.min());
		
		System.out.println("Max number : " + stack.max());

	}
}
