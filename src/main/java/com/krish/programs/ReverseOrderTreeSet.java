package com.krish.programs;

import java.util.TreeSet;

public class ReverseOrderTreeSet {

	public static void main(String[] args) {
		//Insertion Order output = 20,10,5,15,25
		//TreeSet<Integer> tSet = new TreeSet<>();
		
		//First Element output = 20
		//TreeSet<Integer> tSet = new TreeSet<>((obj1,obj2) -> 0);
		
		//Reverse Order output = 25,15,5,10,20
		TreeSet<Integer> tSet = new TreeSet<>((obj1,obj2) -> 1);
		
		tSet.add(20);
		tSet.add(10);
		tSet.add(5);
		tSet.add(15);
		tSet.add(25);
		
		System.out.println(tSet);
	}
}
