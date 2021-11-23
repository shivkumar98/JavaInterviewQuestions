package com.edabit.hard;
/*
 * Create a function that takes an array of numbers and return "Boom!" if the digit 7 appears in the array. Otherwise, return "there is no 7 in the array".
Examples

sevenBoom([1, 2, 3, 4, 5, 6, 7]) ➞ "Boom!"
// 7 contains the number seven.

sevenBoom([8, 6, 33, 100]) ➞ "there is no 7 in the array"
// None of the items contain 7 within them.

sevenBoom([2, 55, 60, 97, 86]) ➞ "Boom!"
// 97 contains the number seven.
 */
public class SevenBoom {
	
	public static String sevenBoom(int[] arr) {
	
		// simple check to see if seven appears on its own
		for (int i =0; i<arr.length;i++) {
			if (arr[i] == 7) {
				return "Boom!";
			}
		}
		
		//now see if any numbers contain seven as a digit
		for (int j =0;j<arr.length;j++) {
			String[] splitDigits = String.valueOf(arr[j]).split("");
			for (int k =0; k<splitDigits.length;k++) {
				System.out.println(splitDigits[k]);
				if (splitDigits[k].equals("7")) {
					return "Boom";
				}
			}
			
		}
		return "there is no 7 in the array";
		
	}
	
	public static void main(String[] args) {
		System.out.println(sevenBoom(new int[] {76, 55, 44, 32}));
	}

}
