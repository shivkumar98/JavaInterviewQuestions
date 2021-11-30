package com.softwaretestinghelp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Write a Java Program to iterate 
 * ArrayList using for-loop, while-loop, and advance for-loop.
 */
public class Q10ArrayLists {
	
	public static void main(String[] args) {
		ArrayList<Integer> myList = new ArrayList<>();
		myList.addAll(List.of(1,2,3,4,56,78));
		
		System.out.println("Standard for loop");
		for (int i = 0; i<myList.size(); i++) {
			System.out.println(myList.get(i));
		}
		
		System.out.println("while loop");
		Iterator itr = myList.iterator();
		while (itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println("Advanced for-loop: ");
		for (int i :myList) {
			System.out.println(i);
		}
	}
}
