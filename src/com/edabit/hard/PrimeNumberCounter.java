package com.edabit.hard;

public class PrimeNumberCounter {
	
	static int primeNumbers(int num) {
		int primeNumberCount =0;
		for (int i =1; i<=num; i++) {
			if (isPrime(i)) {
				primeNumberCount++;
			} else {
				continue;
			}
				
		}
		return primeNumberCount;
	}
	private static boolean isPrime(int i) {
		if (i==2 || i==1) {
			return false;
		}
		int numberOfDivisors =0;
		for (int j=3;j<i;j++) {
			if (i%j==0) {
				numberOfDivisors++;
			}
		}
		return numberOfDivisors==0; 
	}
	

	public static void main(String[] args) {
		System.out.println(primeNumbers(10));
	
	}

}
