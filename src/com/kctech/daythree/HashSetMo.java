package com.kctech.daythree;

import java.util.*;

public class HashSetMo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> a = new HashSet<Integer>();
		a.addAll(Arrays.asList(new Integer[] {1,3,4,6,7,4,8}));
		Set<Integer> b = new HashSet<Integer>();
		b.addAll(Arrays.asList(new Integer[] {0,1,2,3,4,7,8,9}));
		
		Set<Integer> union = new HashSet<Integer>(a);
		union.addAll(b);
		System.out.print("Union");
		System.out.println(union);
		
		Set<Integer> intersection = new HashSet<Integer>(a);
		intersection.retainAll(b);
		System.out.print("Intersection");
		System.out.println(intersection);
		
		Set<Integer> diff = new HashSet<Integer>(a);
		diff.removeAll(b);
		System.out.print("Difference");
		System.out.println(diff);
	}

}
