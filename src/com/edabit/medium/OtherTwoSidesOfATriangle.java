package com.edabit.medium;

/*
 * Given the shortest side of a 30° by 60° by 90° triangle you have to find out the other 2 sides, (return the longest side, medium-length side).
Examples

otherSides(1) ➞ [2.0, 1.73]

otherSides(12) ➞ [24.0, 20.0]

otherSides(2) ➞ [4.0, 3.46]

otherSides(3) ➞ [6.0, 5.2]
 */

public class OtherTwoSidesOfATriangle {
	
	static double[] otherSides(double shortestSide) {
		double[] returnedArray = new double[2];
		
		returnedArray[0]= Math.round(2*shortestSide*100)/100d;
		returnedArray[1] = Math.round(Math.sqrt(3)*shortestSide*100)/100d;
		return returnedArray;
	}

	public static void main(String[] args) {
		System.out.println(otherSides(3)[0]);
		System.out.println(otherSides(3)[1]);
	

	}

}
