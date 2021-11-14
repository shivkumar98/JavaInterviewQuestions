package com.edabit;

import java.util.Arrays;

/*
 * Shuffle the Name

Create a method that accepts a string (of a person's first and last name) and returns a string with the first and last name swapped.
Examples

nameShuffle("Donald Trump") ➞ "Trump Donald"

nameShuffle("Rosie O'Donnell") ➞ "O'Donnell Rosie"

nameShuffle("Seymour Butts") ➞ "Butts Seymour"
 */
public class SuffleTheName {
    public static String nameShuffle(String s) {
        String[] splitString = s.split(" ");
        String lastName= splitString[splitString.length-1];
     
        
        splitString[splitString.length-1] = splitString[0] ;
        splitString[0]= lastName;
        
        
        
        return splitString[0] + " " + splitString[1];
        
    }
    
    public static void main(String[] args) {
		System.out.println(nameShuffle("Shivington kumar"));
	}

	

}
