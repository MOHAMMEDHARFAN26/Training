package com.kctech.daythree;

import java.util.*; 

class IteratorMo{ 
  
    public static void main(String[] args) 
    { 
        Set<String> h = new HashSet<String>(); 
  
        // Adding elements into the HashSet 
        // using add() 
        h.add("India"); 
        h.add("Australia"); 
        h.add("South Africa"); 
  
        // Adding the duplicate 
        // element 
        h.add("India"); 
  
        // Displaying the HashSet 
        System.out.println(h); 
  
        // Removing items from HashSet 
        // using remove() 
        h.remove("Australia"); 
        System.out.println("Set after removing "
                           + "Australia:" + h); 
  
        // Iterating over hash set items 
        System.out.println("Iterating over set:"); 
        Iterator<String> i = h.iterator(); 
        while (i.hasNext()) 
            System.out.println(i.next()); 
    } 
} 
