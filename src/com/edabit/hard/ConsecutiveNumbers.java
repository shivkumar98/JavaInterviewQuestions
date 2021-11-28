package com.edabit.hard;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * 
 * Create a function that determines whether elements in an array can be re-arranged to form a consecutive list of numbers where each number appears exactly once.
Examples

cons([5, 1, 4, 3, 2]) ➞ true
// Can be re-arranged to form [1, 2, 3, 4, 5]

cons([5, 1, 4, 3, 2, 8]) ➞ false

cons([5, 6, 7, 8, 9, 9]) ➞ false
// 9 appears twice
 */

public class ConsecutiveNumbers {
	
	static boolean cons(int[] arr) {
		//get minimum value of array
		int minNumber = Integer.MAX_VALUE;
		for (int i = 0;i<arr.length;i++) {
			
			if (arr[i]<minNumber) {
				minNumber = arr[i];
			}
		}
		
		//convert to set
		Set<Integer> set = new HashSet<>();
		for (int i =0; i<arr.length;i++) {
			set.add(arr[i]);
		}
		
		// {1,2,3} minNumber = 1, 
		
		//see if consecutive numbers are in list
		
		for (int i =0;i<arr.length;i++) {
			if (set.contains(minNumber)) {
				minNumber++;
				continue;
			} else {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		//expect true
		System.out.println(cons(new int[] {1,2,3}));
		
		//expect false
		System.out.println(cons(new int[] {1,3,4}));
	}

}
