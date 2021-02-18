package com.kctech.daythree;

public class GenericsMethods {
	
	public static <E> void printArray(E[] inputArray) {
		for(E element : inputArray) {
			System.out.println(element);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] i = {1,2,4,5,6};
		Double[] d = {1.2,3.4,5.4,2.3};
		String[] s = {"hey","hello","hie"};
		
		System.out.println("Integer elements:");
		printArray(i);
		
		System.out.println("\nDouble elements:");
		printArray(d);
		
		System.out.println("\nString elements:");
		printArray(s);
	}

}
