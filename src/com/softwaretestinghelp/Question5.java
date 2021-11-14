package com.softwaretestinghelp;

import java.util.HashMap;
import java.util.Map;

/*#5) Write a Java Program to count the number of words 
 * in a string using HashMap.
 * 
 */

public class Question5 {
	
	public static void main(String[] args) {
		String string= "this this this this this";
		String[] splitString = string.split(" ");
		Map<String, Integer> map = new HashMap<>();
		
		for (int i =0; i<splitString.length;i++) {
			if (map.containsKey(splitString[i])) {
				map.put(splitString[i], map.get(splitString[i])+1);
			} else {
				map.put(splitString[i], 1);
			}
		}
		
		System.out.println("The number of words are "+map);
	}

}
