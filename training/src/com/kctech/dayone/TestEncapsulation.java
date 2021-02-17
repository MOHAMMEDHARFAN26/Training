package com.kctech.dayone;

public class TestEncapsulation 
{     
    public static void main (String[] args)  
    { 
        EncapsulateMo obj = new EncapsulateMo(); 
          
        // setting values of the variables  
        obj.setName("Harfan"); 
        obj.setAge(21); 
        obj.setRoll(07); 
          
        // Displaying values of the variables 
        System.out.println("Geek's name: " + obj.getName()); 
        System.out.println("Geek's age: " + obj.getAge()); 
        System.out.println("Geek's roll: " + obj.getRoll()); 
          
        // Direct access of geekRoll is not possible 
        // due to encapsulation 
        // System.out.println("Geek's roll: " + obj.geekName);         
    } 
} 
