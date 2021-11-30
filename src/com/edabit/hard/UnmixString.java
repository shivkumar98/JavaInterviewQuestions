package com.edabit.hard;
/*
 * lPaeesh le pemu mnxit ehess rtnisg! Oh, sorry, that was supposed to say: Please help me unmix these strings!

Somehow my strings have all become mixed up; every pair of characters has been swapped. Help me undo this so I can understand my strings again.
Examples

unmix("123456") ➞ "214365"

unmix("hTsii  s aimex dpus rtni.g") ➞ "This is a mixed up string."

unmix("badce") ➞ "abcde"
 */
public class UnmixString {
	static String unmix(String str) {
		StringBuilder unmixedString = new StringBuilder();
		
		
			for (int i =0; i<str.length(); i+=2) {
				if (i+1<str.length()) {
					unmixedString.append(str.charAt(i+1));
				}
				if (i<str.length()) {
					unmixedString.append(str.charAt(i));
				}
					
			}
		

		
		return unmixedString.toString();
	}
	
	public static void main(String[] args) {

		System.out.println(unmix("hoi"));
		

	}
}
