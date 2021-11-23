package com.edabit.hard;

import java.util.HashMap;
import java.util.Map;

/*
 * Write a function that creates an object with each (key, value) pair being the (lower case, upper case) versions of a letter, respectively.
Examples

mapping(["x", "a", "v", "i", "e", "r"]) ➞ { "x"="X", "a"="A", "v"="V", "i"="I", "e"="E", "r"="R" }

mapping(["t", "e", "s", "h", "a"]) ➞ { t=T, e=E, s=S, h=H, a=A }

mapping(["p", "s"]) ➞ { "p"="P", "s"="S" }

mapping(["a", "b", "c"]) ➞ { "a"="A", "b"="B", "c"="C" }

mapping(["a", "v", "y", "z"]) ➞ { "a"="A", "v"="V", "y"="Y", "z"="Z" }

mapping(["d", "x", "t", "s"]) ➞ { "d"="D", "x"="X", "t"="T", "s"="S" }
 */

public class LowerUpperCaseMap {
	public static Map<String, String> mapping(String[] letters) {
		Map<String, String> map = new HashMap<String, String>();
	for (int i =0; i<letters.length;i++) {
			
			String upperCasedLetter = letters[i].toUpperCase();
			
			map.put(letters[i], upperCasedLetter);
		}
		return map;
	  }
	
	public static void main(String[] args) {
		String[] stingArray = {"g", "s", "y"};
		System.out.println(mapping(stingArray));
		
	
	}
}
