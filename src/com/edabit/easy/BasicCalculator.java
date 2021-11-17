package com.edabit.easy;
/*
 * Create a function that takes two numbers and a mathematical operator + - / * and will perform a calculation with the given numbers.
Examples

calculator(2, '+', 2) ➞ 4

calculator(2, '*', 2) ➞ 4

calculator(4, '/', 2) ➞ 2

Notes

If the input tries to divide by 0, return 0.
 */
public class BasicCalculator {
	public static int calculator(int num1, char operator, int num2) {
		switch(operator) {
		case '+':
			return num1+num2;
		case '/':
			if (num2 ==0) {
				return 0;
			} else {
				return num1/num2;
			}
		case '*':
			return num1*num2;
	
		case '-':
			return num1-num2;
		
		}
		return num2;
		
	  }
	
	public static void main(String[] args) {
		System.out.println(calculator(1, '+', 2));
	}
}
