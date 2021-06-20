package com.krish.algorithms.and.datastructures.main;

public class AliAndHelpingInnocentPeople {

	public static void main(String[] args) {
		String name = "13X357-21";
		boolean isValid = false;
//        for(int i = 2; i < name.length(); i++) {
//            if(!isVowel(name.charAt(i))) {
//                if(name.charAt(i - 1) + name.charAt(i - 2) % 2 == 0)
//                    isValid = true;
//            }
//        }
        
        if(!isVowel(name.charAt(2))) {
            if((name.charAt(1) + name.charAt(0)) % 2 == 0)
                isValid = true;
        }
        
        if(isValid)
            System.out.println("valid");
        else
            System.out.println("invalid");
	}
	
	public static boolean isVowel(char value) {
		if(value == 'A' || value == 'E' || value == 'I' || value == 'O' || value == 'U' ||value == 'Y')
			return true;
		
		return false;
	}



}
