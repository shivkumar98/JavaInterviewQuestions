package com.softwaretestinghelp;

import java.util.Scanner;

public class Q9Fibonnaci {
	
	public static void main(String[] args) {
		System.out.println("Enter the number of iterations you want:");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		int a =0, b=0, c=1;

		
		for (int i=1; i<=input; i++) {
			
			a = b;
			b = c;
			c = a+b;
			System.out.println(a);
			
			
			
			
		}
		
		main(new String[0]);
		
		
	}

}
