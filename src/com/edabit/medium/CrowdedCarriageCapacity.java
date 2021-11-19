package com.edabit.medium;

public class CrowdedCarriageCapacity {
	
	
	
	/*findSeat(200, [35, 23, 18, 10, 40]) ➞ 2
// There are 5 carriages which each have a maximum capacity of 40 (200 / 5 = 40).
// Index 0's carriage is too full (35 is 87.5% of the maximum).
// Index 1's carriage is too full (23 is 57.5% of the maximum).
// Index 2's carriage is good enough (18 is 45% of the maximum).
// Return 2.

Examples

findSeat(20, [3, 5, 4, 2]) ➞ 3

findSeat(1000, [50, 20, 80, 90, 100, 60, 30, 50, 80, 60]) ➞ 0

findSeat(200, [35, 23, 40, 21, 38]) ➞ -1
*/
	public static int findSeat(int n, int[] arr) {
		int carriageCapacity = n/arr.length;
		
		for (int i =0; i<arr.length;i++) {
			if (arr[i] <= 0.5*carriageCapacity) {
				
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		System.out.println(findSeat(20,new int[] {3,5,4,2}));
	}

}
