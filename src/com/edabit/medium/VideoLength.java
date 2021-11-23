package com.edabit.medium;

/*
 * You are given the length of a video in minutes. The format is mm:ss (e.g.: "02:54"). Create a function that takes the video length and return it in seconds.
Examples

minutesToSeconds("01:00") ➞ 60

minutesToSeconds("13:56") ➞ 836

minutesToSeconds("10:60") ➞ -1

Notes

    The video length is given as a string.
    If the number of seconds is 60 or over, return -1 (see example #3).
    You may get a number of minutes over 99 (e.g. "121:49" is perfectly valid).
 */

public class VideoLength {
	
	public static int minuteToSeconds(String tm) {
		//split string
		String[] splitString = tm.split(":");
		
		// getting the minutes and secs as an integer
		int minutes = Integer.parseInt(splitString[0]);
		int seconds = Integer.parseInt(splitString[1]);
		
		return seconds>=60 ? -1 : seconds + minutes*60;

	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//expect 83
		System.out.println( minuteToSeconds("1:23"));
		
		// expect -1
		System.out.println(minuteToSeconds("1:60"));
		
	}

}
