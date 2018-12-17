package com.krish.programs;

import java.util.Scanner;

public class MonkTeachesPalindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        
        for(int i = 0; i < limit; i++){
             String input = scanner.next();
             int length = input.length() - 1;
             String reverse = new StringBuffer(input).reverse().toString();
           
             /*String  reverse = "";
             
             for(int j = length; j >= 0; j--)
            	 reverse += input.charAt(j);*/
             
             if(input.equals(reverse)) {
            	 System.out.print("YES ");
            	 System.out.println(length%2 == 0 ? "ODD" : "EVEN");
             } else {
            	 System.out.println("NO");
             }
            	 
        }
	}
}
