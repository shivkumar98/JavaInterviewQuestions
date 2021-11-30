package com.edabit.hard;
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
public class PhoneNumberDecoderAlternativeSolution {
	
	static String textToNum(String phone) {
		return phone.replaceAll("[ABC]", "2")
				.replaceAll("[DEF]", "3")
				.replaceAll("[GHI]", "4")
				.replaceAll("[JKL]", "5")
				.replaceAll("[MNO]","6")
				.replaceAll("[PQRS]", "7")
				.replaceAll("[TUV]", "8")
				.replaceAll("[WXYZ]", "9");
		
		
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(textToNum("123-647-EYES"));
		System.out.println(textToNum("(325)444-TEST"));
		
	}
	
}
