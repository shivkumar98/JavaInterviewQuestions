package com.edabit.easy;

/*
 * checkEnding("abc", "bc") ➞ true

checkEnding("abc", "d") ➞ false

checkEnding("samurai", "zi") ➞ false

checkEnding("feminine", "nine") ➞ true

checkEnding("convention", "tio") ➞ false
 */
public class CheckIfStringsMatch {
	  public static boolean checkEnding(String str1, String str2) {
		  System.out.println(str2);
		  System.out.println(str1.substring(str1.length()-str2.length()));
		  
		   if (str1.substring(str1.length()-str2.length()).equals(str2)) {
			   return true;
		   } else {
			return false;
		   }
	  }
	  
	  public static void main(String[] args) {
		System.out.println(checkEnding("hello", "llo"));
	}

}
