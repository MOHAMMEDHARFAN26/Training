package com.kctech.daythree;

import java.util.*;

public class ArrayListMo {

	public static void main(String[] args) {
		//size of array list
		
		int n = 5;
		
		//declaring arraylist with inital size n
		ArrayList<Integer> arr = new ArrayList<Integer>(n);
		
		//appending new elements at the end of the list
		for(int i = 1; i <= n; i++) 
			arr.add(i);
			
			System.out.println(arr);
			
			//removing elements at index 2
			arr.remove(2);
			
			System.out.println(arr);
			
			//printing elements one by one
			for(int num : arr) 
				System.out.print(num + " ");	

		
	}

}
