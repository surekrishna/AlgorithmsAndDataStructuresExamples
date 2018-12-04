package com.krish.algorithms.and.datastructures;

import java.util.LinkedList;

public class LinckedListMiddleElement {

	public static void main(String[] args) {
		LinkedList<Integer> numbers = getListItems();
		int middle = (numbers.size()/2) - 1;
		System.out.println(numbers.get(middle));
		
	}
	
	private static LinkedList<Integer> getListItems(){
		LinkedList<Integer> numbers = new LinkedList<>();
		numbers.add(2);numbers.add(10);numbers.add(24);
		numbers.add(987);numbers.add(91);numbers.add(45);
		numbers.add(81);numbers.add(246);numbers.add(201);
		numbers.add(651);numbers.add(420);numbers.add(777);
		
		return numbers;
	}
}
