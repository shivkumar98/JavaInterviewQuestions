package com.softwaretestinghelp;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Q15DuplicateChars {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a string and press Enter");
		String inputString = scanner.next();
		
		//initialising hashmap to store chars
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (char c : inputString.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for (char c: map.keySet()) {
			if (map.get(c)>1) {
				System.out.println(c);
			}
			
		}
		
		main(new String[0]);
	}

}
