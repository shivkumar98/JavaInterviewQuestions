package com.softwaretestinghelp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 * Write a Java Program to iterate HashMap using
 *  While and advance for loop.
 */
public class Q6IterateHashMap {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "shiv");
		map.put(2, "kumar");
		map.put(3, "jacob");
		
		System.out.println("Iterating using advanced for loop");
		for (int key : map.keySet()) {
			System.out.println("key: " + key + " value: " + map.get(key));
		}
		
		System.out.println("Iterating using while loop");
		Iterator itr = map.entrySet().iterator();
		
		while (itr.hasNext()) {
			Map.Entry mapEntry = (Map.Entry) itr.next();
			System.out.println(mapEntry.getKey());
			System.out.println(mapEntry	.getValue());
			
		}
	}
}
