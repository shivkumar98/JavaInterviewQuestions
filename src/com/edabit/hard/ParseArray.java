package com.edabit.hard;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/*
 * Write a function that, given the start startNum and end endNum values, return an array containing all the numbers inclusive to that range. See examples below.
Examples

inclusiveArray(1, 5) ➞ [1, 2, 3, 4, 5]

inclusiveArray(2, 8) ➞ [2, 3, 4, 5, 6, 7, 8]

inclusiveArray(10, 20) ➞ [10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]

inclusiveArray(17, 5) ➞ [17]
 */

public class ParseArray {
	
	public static int[] inclusiveArray(int startNum,int endNum) {
		if (startNum>=endNum) {
			int[] returnedArray = new int[]{startNum};
			return returnedArray;
		} else {
		int[] returnedArray = new int[endNum - startNum + 1];
		for (int i =0;i<returnedArray.length;i++) {
			returnedArray[i] = startNum;
			startNum+=1;
			}
		return returnedArray;
		}
		
		

	}
	
	public static void main(String[] args) {

		Arrays.stream(inclusiveArray(2, 1)).forEach(System.out::println);
		System.out.println("test 2");
		Arrays.stream(inclusiveArray(1, 1)).forEach(System.out::println);
		System.out.println("test 3");
		Arrays.stream(inclusiveArray(1, 3)).forEach(System.out::println);
	}

}
