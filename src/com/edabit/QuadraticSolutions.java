package com.edabit;
/*
 * How Many Solutions Does This Quadratic Have?

A quadratic equation a x² + b x + c = 0 has either 0, 1, or 2 distinct solutions for real values of x. Given a, b and c, you should return the number of solutions to the equation.
Examples

solutions(1, 0, -1) ➞ 2
// x² - 1 = 0 has two solutions (x = 1 and x = -1).

solutions(1, 0, 0) ➞ 1
// x² = 0 has one solution (x = 0).

solutions(1, 0, 1) ➞ 0
// x² + 1 = 0 has no real solutions.

Notes

    You do not have to calculate the solutions, just return how many there are.
    a will always be non-zero.
 */
public class QuadraticSolutions {
	public static int solutions(int a, int b, int c) {
		int determinant = b*b - 4*a*c;
		
		if (determinant > 0) {
			return 2;
		} else if (determinant < 0) {
			return 0;
		} else return 1;
	}
	public static void main(String[] args) {
		
		
	}

}
