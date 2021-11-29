package com.edabit.hard;
/*
 * A string is an almost-palindrome if, by changing only one character, you can make it a palindrome. Create a function that returns true if a string is an almost-palindrome and false otherwise.
Examples

almostPalindrome("abcdcbg") ➞ true
// Transformed to "abcdcba" by changing "g" to "a".

almostPalindrome("abccia") ➞ true
// Transformed to "abccba" by changing "i" to "b".

almostPalindrome("abcdaaa") ➞ false
// Can't be transformed to a palindrome in exactly 1 turn.

almostPalindrome("1234312") ➞ false
 */
public class almostPalindrome {
	
	static boolean almostPalindrome(String str) {
		int stringLength = str.length();
		StringBuilder sb = new StringBuilder();
		String palindromeString;
	
		if (stringLength%2==0) {
			sb.append(str.substring(0, stringLength/2)) ;
			StringBuilder reversedString = new StringBuilder(str.substring(0, stringLength/2));
			sb.append(reversedString.reverse());	
			palindromeString = sb.toString();
			System.out.println(palindromeString);
		}
		
		else {
	
			StringBuilder firstHalf = new StringBuilder(str.substring(0, (stringLength/2)+1));
			sb.append(firstHalf);
			StringBuilder secondHalf = new StringBuilder( firstHalf.substring(0, firstHalf.length()-1));
			sb.append(secondHalf.reverse());
			palindromeString = sb.toString();
		}
		
		int matchingChars = 0;
		for (int i =0; i<str.length(); i++) {
			if (str.charAt(i)==palindromeString.charAt(i)) {
				matchingChars++;
			} 
		}
		if (matchingChars == palindromeString.length()-1) 
			return true;
		return false;
		
	}
	
	public static void main(String[] args) {
		//expect false
		System.out.println(almostPalindrome("1234312"));
		
		//expect false
		System.out.println(almostPalindrome("1234312"));
	}

}
