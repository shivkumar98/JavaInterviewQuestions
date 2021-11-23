package com.edabit.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PandigitalNumbers {

	/*
	 * A pandigital number contains all digits (0-9) at least once. Write a function that takes an integer, returning true if the integer is pandigital, and false otherwise.
Examples

isPandigital(98140723568910) ➞ true

isPandigital(90864523148909) ➞ false
// 7 is missing.

isPandigital(112233445566778899) ➞ false
	 */

	public static boolean isPandigital(long num) {
		Set<Integer> set = new HashSet<>();
		
	
		
		
		for (String c :String.valueOf(num).split("")) {
			set.add(Integer.parseInt(c) );
		}
		
		return set.size()==10;

		

	
	}

	public static void main(String[] args) {
		// expect true
		System.out.println( isPandigital(1234567890));

		//expect false
		System.out.println( isPandigital(2));
	}

}
