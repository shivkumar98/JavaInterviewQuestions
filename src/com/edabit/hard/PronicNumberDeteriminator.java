package com.edabit.hard;
/*
 * A pronic number (or otherwise called as heteromecic) is a number which is a product of two consecutive integers, that is, a number of the form n(n + 1). Create a function that determines whether a number is pronic or not.
Examples

isHeteromecic(0) ➞ true
// 0 * (0 + 1) = 0 * 1 = 0

isHeteromecic(2) ➞ true
// 1 * (1 + 1) = 1 * 2 = 2

isHeteromecic(7) ➞ false

isHeteromecic(110) ➞ true
// 10 * (10 + 1) = 10 * 11 = 110

isHeteromecic(136) ➞ false

isHeteromecic(156) ➞ true
 */
public class PronicNumberDeteriminator {
	
	public static boolean isHeteromecic(int n) {
		if (Math.round(Math.sqrt(n))*(Math.round(Math.sqrt(n))+1) == n) {
			return true;
		}
		else if (Math.round(Math.sqrt(n)-1)*(Math.round(Math.sqrt(n)))==n) {
			return true;
		}
			return false;
	}
	
	public static void main(String[] args) {
		System.out.println(isHeteromecic(2));
	}

}
