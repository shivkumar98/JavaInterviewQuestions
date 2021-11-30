package com.edabit.hard;

public class ValidatePin {
	
	static boolean validate(String pin) {
		return pin.matches("\\d{4}|\\d{6}"); 
		
	}
	
	public static void main(String[] args) {
		System.out.println(validate("1234"));
	}

}
