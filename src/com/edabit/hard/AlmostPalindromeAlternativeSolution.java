package com.edabit.hard;

public class AlmostPalindromeAlternativeSolution {
	
	static boolean almostPalindrome(String str) {
		int numberOfDifferences = 0;
		
		for (int i = 0; i<str.length()/2; i++ ) {
			if (str.charAt(i) != str.charAt(str.length()-i-1)) {
				numberOfDifferences++;
			}
		}

		
		if (numberOfDifferences>0 && numberOfDifferences<2)
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		//expect true
		System.out.println("expect true");
		System.out.println(almostPalindrome("1234322"));
		System.out.println(almostPalindrome("abcdcbg") );
		System.out.println(almostPalindrome("abccia") );
		
		//expect false
		
		System.out.println("expect false" );
		System.out.println(almostPalindrome("gggffff") );
		System.out.println(almostPalindrome("gggfggg") );
		System.out.println(almostPalindrome("1234312"));
	}
	
}


