package com.krish.programs;

import java.util.HashMap;
import java.util.Map;

public class ArmyMaryExample {
	
	public static void main(String[] args) {
		Map<String,Integer> army = new HashMap<>();
		army.put("a", 23);
		army.put("r", 67);
		army.put("m", 91);
		army.put("y", 29);
		
		Map<String, Integer> mary = new HashMap<>();
		mary.put("m", 91);
		mary.put("a", 23);
		mary.put("r", 67);
		mary.put("y", 29);
		
		
		for(String armyKey : army.keySet()) {
			System.out.println(army.get(armyKey) == mary.get(armyKey));
		}
	}

}
