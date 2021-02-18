package com.kctech.daythree;

import java.util.*;
public class LinkedHashMapMo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer, String> obj = new LinkedHashMap<Integer, String>();
		
		obj.put(1, "Hi nice to meet you");
		obj.put(2, "Nope Not nice to meet you");
		obj.put(3, "Fine Bye");
		
		System.out.println(obj);
		
		System.out.println("Getting value for key 1 " + obj.get(1));
		System.out.println("Getting size of the map " + obj.size());
		System.out.println("It has values? " + obj.containsKey(2));
		System.out.println("Does it contain Nope Not nice to meet you? " + obj.containsValue("Nope Not nice to meet you"));
		System.out.println("Delete one element " + obj.remove(2));
		System.out.println("Mappings of linked list " + obj);
	}

}
