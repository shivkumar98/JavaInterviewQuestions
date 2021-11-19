package com.edabit.medium;

/*
 * i need to implemenmt a recurive algorithm which sums an integer array
 */

public class RecuriveSumOfArrayAttempt2 {
	public static int recursiveSum(int[] arr) {
		
		if (arr.length == 1) {
			return arr[0];
		}
				
		int[] diminished = new int[arr.length-1];
		
		for (int i =0; i<diminished.length;i++) {
			diminished[i] = arr[i+1];
		}
		
		return arr[0] + recursiveSum(diminished);
		
	}
	
	public static void main(String[] args) {
		System.out.println(recursiveSum(new int[] {3,2}));
	}

}
