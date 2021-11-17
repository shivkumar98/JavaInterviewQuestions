package com.edabit.easy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * countTrue([true, false, false, true, false]) ➞ 2

countTrue([false, false, false, false]) ➞ 0

countTrue([]) ➞ 0
 */

public class HowMuchIsTrue {
	
	public static int countTrue(boolean[] arr) {
		int sum = 0;
		for (boolean b : arr) {
			if (b == true) {
				sum+=1;
			}
		}
		return sum;
		
	}
	public static void main(String[] args) {
	
		
		
		System.out.println(countTrue(new boolean[] {true, false, true}));
		
	}

}
