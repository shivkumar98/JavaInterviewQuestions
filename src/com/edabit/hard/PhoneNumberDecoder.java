package com.edabit.hard;

import java.util.List;

/*
 * Create a program that converts a phone number with letters to one with only numbers.
Number	Letter
0	none
1	none
2	ABC
3	DEF
4	GHI
5	JKL
6	MNO
7	PQRS
8	TUV
9	WXYZ
Examples

textToNum("123-647-EYES") ➞ "123-647-3937"

textToNum("(325)444-TEST") ➞ "(325)444-8378"

textToNum("653-TRY-THIS") ➞ "653-879-8447"

textToNum("435-224-7613") ➞ "435-224-7613"
 */

public class PhoneNumberDecoder {
	
	
	
	static String textToNum(String phone) {
		StringBuilder decodedPhoneNumber = new StringBuilder();
		for (int i=0; i<phone.length(); i++) {
			if (Character.isLetter(phone.charAt(i))) {
				decodedPhoneNumber.append(LetterToNumber(phone.charAt(i)));
			} else {
				decodedPhoneNumber.append(phone.charAt(i));
			}
		}
		return decodedPhoneNumber.toString();
		
	}
 
	private static String LetterToNumber(char letter) {
		if (List.of('A','B','C').contains(Character.toUpperCase(letter))) {
			return "2";
		}
		else if (List.of('D','E','F').contains(Character.toUpperCase(letter))) {
			return "3";
		}
		else if (List.of('G','H','I').contains(Character.toUpperCase(letter))) {
			return "4";
		}
		else if (List.of('J','K','L').contains(Character.toUpperCase(letter))) {
			return "5";
		}
		else if (List.of('M','N','O').contains(Character.toUpperCase(letter))) {
			return "6";
		}
		else if (List.of('P','Q','R','S').contains(Character.toUpperCase(letter))) {
			return "7";
		}
		else if (List.of('T', 'U', 'V').contains(Character.toUpperCase(letter))) {
			return "8";
		}
		else if (List.of('W', 'X', 'Y', 'Z').contains(Character.toUpperCase(letter) )) 
		{
			return "9";
		}
		return null;
	}
	
	public static void main(String[] args) {
		System.out.println(textToNum("435-224-7613"));
		System.out.println(textToNum("653-TRY-THIS") );
	}

}
