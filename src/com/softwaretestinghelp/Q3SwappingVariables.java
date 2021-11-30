package com.softwaretestinghelp;

import java.util.Arrays;

/* Q3) Write a Java Program to swap two numbers
 *  using the third variable.
 */
public class Q3SwappingVariables {
	
	public static void main(String[] args) {
		int[] swappedIntegers = swap(2,3);
		Arrays.stream(swappedIntegers).forEach(el -> System.out.println(el));
		
	}

	private static int[] swap(int i, int j) {
		int[] returnedArray = new int[2];
		int placeholder = i;
		returnedArray[0] = j;
		returnedArray[1] = placeholder;
		
		return returnedArray;
		
	}

}
