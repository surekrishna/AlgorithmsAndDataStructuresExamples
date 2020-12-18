package com.krish.algorithms.and.datastructures;

/*
     * 
    * * 
   * * * 
  * * * * 
 * * * * * 
 */
public class StarPattern {

	public static void main(String[] args) {
		drawPyramidPattern(5);

	}

	public static void drawPyramidPattern(Integer length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
