package com.krish.algorithms.and.datastructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class TenDifferenceWaysStringReverse {

	public static void main(String[] args) {
		String input = "krishna";
		System.out.println("Before = "+input);
		char[] chars = input.toCharArray();
		String reverseForLoop = charForLoop(chars);
		System.out.println("After Char For Loop = "+reverseForLoop);
		String stringForLoop = stringForLoop(input);
		System.out.println("After String For Loop = "+stringForLoop);
		String stack = stack(chars);
		System.out.println("After Stack = "+stack);
		String stringBuffer = stringBuffer(input);
		System.out.println("After StringBuffer = "+stringBuffer);
		String stringBuilder = stringBuilder(input);
		System.out.println("After StringBuilder = "+stringBuilder);
		String collectionsReverse = collectionsReverse(chars);
		System.out.println("After Collections reverse() = "+collectionsReverse);
		String charArraySwap = charArraySwap(chars);
		System.out.println("After char[] swap = "+charArraySwap);
		String unicodeRLO = unicodeRLO(input);
		System.out.println("After unicode Right-to-Left Override = "+unicodeRLO);
		String byteArray = byteArray(input);
		System.out.println("After byte[] swap = "+byteArray);
		String recursionSubString = recursionSubString(input);
		System.out.println("After recursionSubString = "+recursionSubString);
	}
	
	private static String charForLoop(char[] chars) {
		
		boolean isEmpty = isEmpty(chars);
		if(isEmpty)
			return "";
		
		int length = chars.length - 1;
		String reverse = "";
		
		for(int i = length; i >= 0; i--)
			reverse += chars[i];
		
		return reverse;
	}
	
	private static String stringForLoop(String input) {
		
		boolean isEmpty = isEmpty(input);
		if(isEmpty)
			return input;
		
		int length = input.length()-1;
		String reverse = "";
		
		for(int i = length; i >= 0; i-- )
			reverse += input.charAt(i);
		
		return reverse;
	}
	
	private static String stack(char[] chars) {
		
		boolean isEmpty = isEmpty(chars);
		if(isEmpty)
			return "";
		
		String reverse = "";
		Stack<Character> stack = new Stack<>();
		
		for(char c : chars)
			stack.push(c);
		
		while(!stack.isEmpty())
			reverse += stack.pop();
		
		return reverse;
	}
	
	private static String stringBuffer(String input) {
		
		boolean isEmpty = isEmpty(input);
		if(isEmpty)
			return input;
		
		return new StringBuffer(input).reverse().toString();
	}
	
	private static String stringBuilder(String input) {
		
		boolean isEmpty = isEmpty(input);
		if(isEmpty)
			return input;
		
		return new StringBuilder(input).reverse().toString();
	}
	
	private static String collectionsReverse(char[] chars) {
		
		boolean isEmpty = isEmpty(chars);
		if(isEmpty)
			return "";
		
		List<Character> cList = new ArrayList<>();
		
		for(char c : chars)
			cList.add(c);
		
		Collections.reverse(cList);
		
		StringBuilder builder = new StringBuilder(cList.size());
		
		for(char c : cList)
			builder.append(c);
		
		return builder.toString();
	}
	
	private static boolean isEmpty(String input) {
		return input.isEmpty() || input == null ? true : false;
	}
	
	private static boolean isEmpty(char[] chars) {
		return chars.length < 0 ? true : false;
	}
	
	private static String charArraySwap(char[] chars) {
		int length = chars.length-1;
		
		for(int i = 0, l = length; i < l; i++, l--) {
			char temp = chars[i];
			chars[i] = chars[l];
			chars[l] = temp;
		}
		
		return String.valueOf(chars);
	}
	
	private static String unicodeRLO(String input) {
		boolean isEmpty = isEmpty(input);
		if(isEmpty)
			return input;
		
		return "\u202E" +input;
	}
	
	private static String byteArray(String input) {
		
		boolean isEmpty = isEmpty(input);
		if(isEmpty)
			return input;
		
		byte[] bytes = input.getBytes();
		int length = bytes.length - 1;
		
		for(int i = 0, l = length; i < l; i++,l--) {
			byte temp = bytes[i];
			bytes[i] = bytes[l];
			bytes[l] = temp;
		}
		
		return new String(bytes);
	}
	
	private static String recursionSubString(String input) {
		boolean isEmpty = isEmpty(input);
		if(isEmpty)
			return input;
		
		return recursionSubString(input.substring(1)) +input.charAt(0);
	}

}
