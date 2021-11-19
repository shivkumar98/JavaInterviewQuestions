package com.edabit.medium;

/*
 * Write a function that finds the sum of an array. Make your function recursive.
Examples

sum([1, 2, 3, 4]) ➞ 10

sum([1, 2]) ➞ 3

sum([1]) ➞ 1

sum([]) ➞ 0
 */
public class RecursionSumArray {
	// ARR = {1,2}
	

		
	static int sumHelper(int[] arr) {
		int sum = 0;
		if (arr.length == 1) {
			return arr[0];
		}
		
		

		int[]  diminished = new int[arr.length-1];
		diminished[0]= arr[0];
		for (int i =0; i<diminished.length;i++) {
			diminished[i]=arr[i+1];
		}
		return arr[0]+sumHelper(diminished);
		
	
	
	

	}
	

	public static void main(String[] args) {
		System.out.println(sumHelper(new int[] {1,2,3}));
	}
		
	
	
}
