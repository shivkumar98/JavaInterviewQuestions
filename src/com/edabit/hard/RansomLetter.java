package com.edabit.hard;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
 * Write a function that returns true if you can use the letters of the first string to create the second string. Letters are case sensitive.
Examples

canBuild("aPPleAL", "PAL") ➞ true

canBuild("aPPleAL", "apple") ➞ false

canBuild("a", "") ➞ true

canBuild("aa", "aaa") ➞ false
 */
public class RansomLetter {
	
	static boolean canBuild(String str1, String str2) {
		HashMap<Character,Integer> firstMap = new HashMap<>();
		HashMap<Character, Integer> secondMap = new HashMap<>();
		
		for (int i=0; i< str1.length(); i++) {
			firstMap.put(str1.charAt(i), firstMap.getOrDefault(str1.charAt(i),0)+1);
		}
		
		for (int i =0; i<str2.length(); i++) {
			secondMap.put(str2.charAt(i), secondMap.getOrDefault(str2.charAt(i), 0)+1);
		}
		
		for (Character key: secondMap.keySet()) {
			if (firstMap.getOrDefault(key, 0)<secondMap.get(key)) {
				return false;
			}
		}
		return true;
	}
	

	public static void main(String[] args) {
		System.out.println( canBuild("xxYYzZ", "zzZxYxY"));
		
	}

}
