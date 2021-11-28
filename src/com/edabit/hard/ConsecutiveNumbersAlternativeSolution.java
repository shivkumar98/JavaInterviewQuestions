package com.edabit.hard;

import java.util.Arrays;

public class ConsecutiveNumbersAlternativeSolution {
	
	static boolean cons(int[] arr) {
		Arrays.sort(arr);
		

		for (int i =0; i<arr.length-1; i++) {
			if (arr[i+1]==arr[i]+1) {
				continue;
			} else {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		//tests
		System.out.println(cons(new int[]{5, 1, 4, 3, 2}));
			

		System.out.println(cons(new int[]{55, 59, 58, 56, 57}));
			
		System.out.println(cons(new int[]{-3, -2, -1, 1, 0}));
			

		System.out.println(cons(new int[]{5, 1, 4, 3, 2, 8}));
			

		System.out.println(cons(new int[]{5, 6, 7, 8, 9, 9}));
		
		
		System.out.println(cons(new int[]{5, 3}));
		
	}

}
