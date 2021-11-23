package com.edabit.medium;

import java.util.HashSet;
import java.util.Set;

/*
 * Create a function that tests whether or not an integer is a perfect number. A perfect number is a number that can be written as the sum of its factors, (equal to sum of its proper divisors) excluding the number itself.

	For example, 6 is a perfect number, since 1 + 2 + 3 = 6, where 1, 2, and 3 are all factors of 6. Similarly, 28 is a perfect number, since 1 + 2 + 4 + 7 + 14 = 28.
	Examples

	checkPerfect(6) ➞ true

	checkPerfect(28) ➞ true

	checkPerfect(496) ➞ true

	checkPerfect(12) ➞ false

	checkPerfect(97) ➞ false
 */

public class PerfectNumber {

	static boolean checkPerfect(int num) {
		
		Set<Integer> set = new HashSet<Integer>();
		

		for (int i = 2;i<num/2;i++) {
			if (num%(i+1) == 0) { //checking if number is divisible by (i+1)
				set.add((i+1));
			}
		}
		
		//checking sum of set
		int sum =0;
		for (int num1 : set) {
			sum+=num1;
		}
		System.out.println(sum);
		
		return sum == num;
		
	}
	
	public static void main(String[] args) {
		//expect true
		System.out.println(checkPerfect(28));
	
		
	
	}
}