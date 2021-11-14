package com.edabit;
/*
 * 
 * Create a function that takes two arguments: the original price and the 
 * discount percentage as integers and returns the final price after the discount.

Alternative Text
Examples

discount(1500, 50) ➞ 750

discount(89, 20) ➞ 71.2

 * 
 */
public class FindTheDiscount {
	
	public static double discount(int originalPrice,int discountPercentage) {
		return originalPrice - (discountPercentage*0.01)*originalPrice;
		
	}
	public static void main(String[] args) {
		
		System.out.println(discount(1500,50));
		
	}

}
