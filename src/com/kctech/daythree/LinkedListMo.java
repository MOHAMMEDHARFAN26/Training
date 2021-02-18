package com.kctech.daythree;
import java.util.*;
import java.io.IOException;
public class LinkedListMo {
	public static void main(String[] args) throws IOException {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("B");
        ll.add("D");
        ll.addLast("E");
        ll.addFirst("A");
        ll.add(2, "C");
		
				System.out.println(ll);
				
		ll.remove("B");
		ll.remove(3);
		ll.removeFirst();
		ll.removeLast();
		 
		        System.out.println(ll);
	}
	
	
	
	
}
