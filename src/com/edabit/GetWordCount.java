package com.edabit;

import java.util.Arrays;

/*countWords("Just an example here move along") ➞ 6

countWords("This is a test") ➞ 4

countWords("What an easy task, right") ➞ 5
*/


public class GetWordCount {
	
	public static int countWords(String s) {
	
		
		return s.split(" ").length;
		
	}
	
	public static void main(String[] args) {
		System.out.println(countWords("hello this is shiv"));
	}


}
