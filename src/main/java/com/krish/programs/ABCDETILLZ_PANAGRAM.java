package com.krish.programs;

import java.util.HashMap;
import java.util.Map;

public class ABCDETILLZ_PANAGRAM {

	public static void main(String[] args) {
		String name = "lskdjfljweiorywoccneurioquwc";

		Map<Character, Integer> m = new HashMap<>();

		for (int i = 0; i < name.length(); i++) {
			if (m.containsKey(name.charAt(i))) {
				m.put(name.charAt(i), m.get(name.charAt(i)) + 1);
			} else {
				m.put(name.charAt(i), 1);
			}
		}

		if (m.size() == 26)
			System.out.println("All chars exist in the string");
		else
			System.out.println("Not all chars not present in the string");
	}
}
