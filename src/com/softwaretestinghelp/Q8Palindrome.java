package com.softwaretestinghelp;

import java.util.Scanner;

public class Q8Palindrome {

	public static void main(String[] args) {

		System.out.println("Enter a string, I will return whether it is a palindrome. Otherwise enter q to quit");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		
		if (input.equals("q")) {
			System.exit(0);
		}
		
		int flag = 0;
		

		for (int i =0; i < input.length(); i++ ) {
			if (input.charAt(i)!=input.charAt(input.length()-i-1)) {
				flag =1;
				break;
			}
		}


		if (flag == 1) {
			System.out.println("This is not a palindrome");
		} else {
			System.out.println("This is a palindrome");
		}

		main(new String[0]);


	}
}
