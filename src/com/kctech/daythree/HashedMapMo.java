package com.kctech.daythree;

import java.util.*;

public class HashedMapMo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> both = new HashMap<Integer, String>();
		
		both.put(1, "hi");
		both.put(2, "say");
		both.put(3, "bye");
		
		for(Map.Entry<Integer, String> val : both.entrySet()) {
		System.out.println(val.getKey() + " " + val.getValue());
	}
	}

}
