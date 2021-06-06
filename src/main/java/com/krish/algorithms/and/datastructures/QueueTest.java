package com.krish.algorithms.and.datastructures;

public class QueueTest {

	public static void main(String[] args) throws Exception {
		Queue queue = new Queue();
		//queue.deQueue();
		queue.enQueue(2);
		queue.enQueue(5);
		queue.enQueue(1);
		queue.enQueue(7);
		queue.enQueue(2);
		System.out.println("Queue size : " + queue.getSize());
		//queue.enQueue(6);//This will give Queue is Full! Exception.
		queue.show();
		System.out.println(queue.deQueue());
		queue.show();
		System.out.println("Queue size : " + queue.getSize());
		queue.deQueue();
		queue.show();
	}

}

class Queue {
	
	private int front = 0;
	private int rear = 0;
	private int maxSize = 5;
	private int queueSize = 0;
	private int numbers[] = new int[maxSize];
	
	public void enQueue(int number) throws Exception {
		if(isFull())
			throw new Exception("Queue is Full!");
		
		numbers[rear] = number;
		rear = (rear + 1) % maxSize;
		queueSize = queueSize + 1;
	}
	
	public int deQueue() throws Exception {
		if(isEmpty())
			throw new Exception("Queue is Empty!");
		
		int number = numbers[front];
		numbers[front] = 0;
		front = (front + 1)  % maxSize;
		queueSize = queueSize - 1;
		return number;
	}
	
	public void show() {
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[(front + i) % maxSize] + " ");
		}
		System.out.println();
	}
	
	public boolean isFull() {
		return maxSize == getSize();
	}
	
	public boolean isEmpty() {
		return getSize() == 0;
	}
	
	public int getSize() {
		return queueSize;
	}
}


