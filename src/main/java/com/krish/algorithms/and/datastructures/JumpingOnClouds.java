package com.krish.algorithms.and.datastructures;

public class JumpingOnClouds {
  static int jumpingOnClouds(int[] c) {
		int numberOfJumps = 0;
		int i = 0;
		
		while(true) {
			if(i + 2 < c.length && c[i+2] == 0) {
				i += 2;
			}else if(i + 1 < c.length) {
				i += 1;
			}else {
				break;
			}
			numberOfJumps++;
		}
		
		return numberOfJumps;
	}

	public static void main(String[] args) {
		System.out.println(jumpingOnClouds(new int[] { 0, 0, 1, 0, 0, 1, 0 }));
	}

}
