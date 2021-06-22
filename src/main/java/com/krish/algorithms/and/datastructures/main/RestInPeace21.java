package com.krish.algorithms.and.datastructures.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RestInPeace21 {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	     Integer size = s.nextInt();
	     List<Integer> numbers = new ArrayList<>();
	     
	     for(int i = 0; i < size; i ++) {
	    	 numbers.add(s.nextInt());
	     }
	     
		 for(Integer number : numbers) {
			 if(number%21 == 0) {
				 System.out.println("The streak is broken!");
				 continue; 
			 }else if(is21Exist(number)) {
				 System.out.println("The streak is broken!");
				 continue;
			 }else {
				 System.out.println("The streak lives still in our heart!");
				 continue;
			 }

		 }
	}
	
	public static boolean is21Exist(Integer number) {
		int reminder = 0;
		while(number > 0) {
			reminder = number % 10;
			number = number / 10;
			if(reminder == 1) {
				reminder = number % 10;
				if(reminder == 2)
					return true;
			}
		 }
		
		return false;
	 }

}
