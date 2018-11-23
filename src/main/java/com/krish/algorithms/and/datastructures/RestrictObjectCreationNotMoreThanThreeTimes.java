package com.krish.algorithms.and.datastructures;

public class RestrictObjectCreationNotMoreThanThreeTimes {
	public static void main(String[] args) {
		ObjectThreeTimesCreation ins1 = ObjectThreeTimesCreation.getInstance();
		ObjectThreeTimesCreation ins2 = ObjectThreeTimesCreation.getInstance();
		ObjectThreeTimesCreation ins3 = ObjectThreeTimesCreation.getInstance();
		ObjectThreeTimesCreation ins4 = ObjectThreeTimesCreation.getInstance();
		ObjectThreeTimesCreation ins5 = ObjectThreeTimesCreation.getInstance();
		
		System.out.println(ins1.hashCode());
		System.out.println(ins2.hashCode());
		System.out.println(ins3.hashCode());
		System.out.println(ins4.hashCode());//same hashcode of instance 3
		System.out.println(ins5.hashCode());//same hashcode of instance 3
	}
	
}

class ObjectThreeTimesCreation {
	
	private static ObjectThreeTimesCreation instance = null;
	private static int count = 0;
	
	private ObjectThreeTimesCreation() {
		count++;
		System.out.println("Object Created = "+count);
	}
	
	public static ObjectThreeTimesCreation getInstance() {
		if(count < 3) {
			instance = new ObjectThreeTimesCreation();
		}
		
		return instance;
	}
	
	
}
