package com.softwaretestinghelp;

import java.util.Scanner;

/*
 * Write a Java Program to 
 * find whether a number is prime or not.
 */
public class Q7PrimeNumbers {
		/**
		 * @param args
		 */
		public static void main(String[] args) {
			System.out.println("Please enter an integer."
					+ " I will return whether it is prime");
			Scanner scanner = new Scanner(System.in);
			int num = scanner.nextInt();
			
			
			//working out whether input is prime
			int divisorCount =0;
			for (int i = 1; i<=num; i++) {
				if (num%i==0) {
					divisorCount++;
				}
			}
			if (num == 1 || num == 2) {
				System.out.println("This number is prime!");
			}
			else if (divisorCount==2) {
				System.out.println("This number is prime!");
			} else {
				System.out.println("This number is not prime!");
			}
			main(new String[1]);
		}
}
