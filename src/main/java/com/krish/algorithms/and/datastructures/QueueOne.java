package com.krish.algorithms.and.datastructures;

/**
 * This class is my own queue
 * @author Krishna Sure
 *
 */
public class QueueOne {

	private int front, rear, size, nItems;

	private int[] queArray;

	public QueueOne(int capacity) {
		size = capacity;
		queArray = new int[size];
		front = 0;
		rear = -1;
		nItems = 0;
	}

	/**
	 * To add an element to the queue
	 * @param number
	 */
	public void insert(int number) {
		
		if(isFull())
			throw new QueueFullExcepiton("Queue is Full with size = "+nItems+", cannot add more elemenet.");
			
		if (rear == size - 1)
			rear = -1;
		
		queArray[++rear] = number;
		nItems++;
	}

	/**
	 * To remove an element from the queue
	 * @return
	 */
	public int remove() {
		
		if(isEmpty())
			throw new QueueEmptyExcepiton("Queue is Empty cannot remove.");
			
		int temp = queArray[front++];
		if (front == size)
			front = 0;
		
		nItems--;
		return temp;
	}

	/**
	 * To check queue is empty or not
	 * @return
	 */
	public boolean isEmpty() {
		return (nItems == 0);
	}

	/**
	 * To check queue is full or not
	 * @return
	 */
	public boolean isFull() {
		return (nItems == size);
	}

	/**
	 * To get size of the queue
	 * @return
	 */
	public int size() {
		return nItems;
	}

	public static void main(String[] args) {
		QueueOne queue = new QueueOne(5); // queue holds 5 items

		queue.insert(10); // insert 4 items
		queue.insert(20);
		queue.insert(30);
		queue.insert(40);

		//remove 3 items
		queue.remove(); 
		queue.remove(); 
		queue.remove();

		//insert 4 more items
		queue.insert(50); 
		queue.insert(60); 
		queue.insert(70);
		queue.insert(80);

		while (!queue.isEmpty())
			System.out.print(queue.remove()+" ");
		
	}
}

class QueueFullExcepiton extends RuntimeException {

	QueueFullExcepiton() {
		super();
	}

	QueueFullExcepiton(String message) {
		super(message);
	}
}

class QueueEmptyExcepiton extends RuntimeException {

	QueueEmptyExcepiton() {
		super();
	}

	QueueEmptyExcepiton(String message) {
		super(message);
	}
}
