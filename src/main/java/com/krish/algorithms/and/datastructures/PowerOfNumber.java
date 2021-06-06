package com.krish.algorithms.and.datastructures;

public class PowerOfNumber {

	public static void main(String[] args) {
		System.out.println(pow(5f,3));
	}
	
	public static float pow(float x, int y) {
		float temp;
        if( y == 0)
            return 1;
        
        temp = pow(x, y/2);
         
        if (y%2 == 0)
            return temp*temp;
        else
        {
            if(y > 0)
                return x * temp * temp;
            else
                return (temp * temp) / x;
        }
	}
	
	public static int pow1(int x, int y) {
		int result = x;
		if(y == 0)
			return 1;
		
		if(x == 0)
			return 0;
		
		for(int i =1; i < y; i++) {
			result = result * x;
		}
		
		return result;
	}

}
