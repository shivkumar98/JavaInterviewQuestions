package com.edabit.medium;
/*
 * 
Create a function that takes an integer and outputs an n x n square solely consisting of the integer n.
Examples

squarePatch(3) ➞ [
  [3, 3, 3],
  [3, 3, 3],
  [3, 3, 3]
]

squarePatch(5) ➞ [
  [5, 5, 5, 5, 5],
  [5, 5, 5, 5, 5],
  [5, 5, 5, 5, 5],
  [5, 5, 5, 5, 5],
  [5, 5, 5, 5, 5]
]

squarePatch(1) ➞ [
  [1]
]

squarePatch(0) ➞ []

 */
public class PerfectSquares {
	
	public static int[][] squarePatch(int n) {
		int[][] squareArray = new int[n][n];
		for (int i =0; i<n;i++) {
			for (int j =0;j<n;j++) {
				squareArray[i][j] = n;
			}
		}
		return squareArray;
	}

}
