package com.edabit.medium;

import java.util.List;

/*
 *  Given a list of directions to spin, "left" or "right", return an integer of how many full 360° rotations were made. Note that each word in the array counts as a 90° rotation in that direction.
	Examples
	
	spinAround(["right", "right", "right", "right", "left", "right"]) ➞ 1
	# You spun right 4 times (90 * 4 = 360)
	# You spun left once (360 - 90 = 270)
	# But you spun right once more to make a full rotation (270 + 90 = 360)
	
	spinAround(["left", "right", "left", "right"]) ➞ 0
	
	spinAround(["right", "right", "right", "right", "right", "right", "right", "right"]) ➞ 2
	
	spinAround(["left", "left", "left", "left"]) ➞ 1
	
	Notes

    Return a positive number.
    All tests will only include the words "right" and "left".
 */

public class SpinTouchGround {
	
	static int spinAround(String[] turns) {
		int leftTurns = 0;
		int rightTurns = 0;
		for (int i =0; i<turns.length;i++) {
			if (turns[i]== "left") {
				leftTurns++;
			} else {rightTurns++;}
		}
		System.out.println(leftTurns);
		System.out.println(rightTurns);
		int netTurns = Math.abs(rightTurns - leftTurns);
		System.out.println(netTurns);
		return netTurns /4;
	}
	
	public static void main(String[] args) {
		System.out.println( spinAround(new String[] {"left","left","left","left"}));
	}

}
