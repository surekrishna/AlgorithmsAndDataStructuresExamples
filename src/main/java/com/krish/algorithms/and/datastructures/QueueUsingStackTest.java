package com.krish.algorithms.and.datastructures;

import java.util.Stack;
public class QueueUsingStackTest {

	public static void main(String[] args) {
		QueueUsingStack queueUsingStack = new QueueUsingStack();
		queueUsingStack.enQueue(1);
		queueUsingStack.show();
		System.out.println(queueUsingStack.deQueue());
		queueUsingStack.show();
		queueUsingStack.enQueue(1);
		queueUsingStack.enQueue(2);
		queueUsingStack.show();
		
		queueUsingStack.enQueue(3);
		queueUsingStack.enQueue(4);
		queueUsingStack.show();
		
		System.out.println(queueUsingStack.deQueue());
		System.out.println(queueUsingStack.deQueue());
		queueUsingStack.show();
		System.out.println(queueUsingStack.deQueue());
		System.out.println(queueUsingStack.deQueue());
		queueUsingStack.show();
		System.out.println(queueUsingStack.deQueue());
	}

}

class QueueUsingStack {
	
	private Stack<Integer> enQueue = new Stack<>();
	private Stack<Integer> deQueue = new Stack<>();
	
	public void enQueue(int number) {
		enQueue.push(number);
	}
	
	public int deQueue() {
		if(enQueue.isEmpty())
			return -1;
		
		while(!enQueue.isEmpty()) {
			deQueue.push(enQueue.pop());
		}
		
		int number = deQueue.pop();
		while(!deQueue.isEmpty()) {
			enQueue.push(deQueue.pop());
		}		
		return number;
	}
	
	public void show() {
		for(int number : enQueue) {
			System.out.print(number + " ");
		}
		
		System.out.println();
	}
}
