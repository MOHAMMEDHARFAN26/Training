package com.kctech.daythree;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetMo {
	public static void main(String[] args) {
		SortedSet<String> s = new TreeSet<String>();
		
		s.add("Chennai");
		s.add("Banglore");
		s.add("Delhi");
		s.add("Kochi");
		
		System.out.println(s);
		
		for(String i : s) {
			System.out.println(i);
		}
		
		//Returns the first element 
		System.out.println("First:" + s.first());
		//Returns the last element 
		System.out.println("Last:" + s.last());
		//Returns a view of the portion of the given set whose elements are strictly less than the toElement. 
		System.out.println("Respective element:" + s.headSet("Chennai"));
		//Returns a view of the map whose keys are strictly less than the toKey.
		System.out.println("Respective elemet:" + s.tailSet("Banglore"));
		
	}
}
