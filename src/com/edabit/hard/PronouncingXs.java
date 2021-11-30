package com.edabit.hard;

/*
 * Create a function which replaces all the x's in the string in the following ways:

Replace all x's with "cks" UNLESS:

    The word begins with "x", therefore replace it with "z".
    The word is just the letter "x", therefore replace it with "ecks".

Examples

xPronounce("Inside the box was a xylophone") ➞ "Inside the bocks was a zylophone"

xPronounce("The x ray is excellent") ➞ "The ecks ray is eckscellent"

xPronounce("OMG x box unboxing video x D") ➞ "OMG ecks bocks unbocksing video ecks D"
 */

public class PronouncingXs {

	
	static String xPronounce(String sentence) {
		return sentence
				.replaceAll("x ", "ecks ")
				.replaceAll(" x ", " ecks ")
				.replaceAll(" x$", " ecks")
				.replaceAll(" x", " z");
		
				
		
	}
	
	public static void main(String[] args) {
		System.out.println(xPronounce("x rays"));
		System.out.println(xPronounce("she is my x"));
		System.out.println(xPronounce("I hate x rays"));
		System.out.println(xPronounce("inside the blocks was a xyhlophone"));
		
		
	}
}
