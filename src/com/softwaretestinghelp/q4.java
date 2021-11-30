package com.softwaretestinghelp;

import java.util.Arrays;

/*  Q4) Write a Java Program to swap two numbers
 *  without using the third variable.
 */
public class q4 {
	public static void main(String[] args) {
		Arrays.stream(swap(1,2)).forEach(E -> System.out.println(E));
	}

	private static int[] swap(int i, int j) {
		int[] array = new int[2];
		i = i +j;
		j  = i-j;
		i = i-j;
		array[0] = i;
		array[1] = j;
		
		
	
		
		return array;
		
	}
}
