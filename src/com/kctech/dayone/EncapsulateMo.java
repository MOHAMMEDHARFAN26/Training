package com.kctech.dayone;

public class EncapsulateMo
{ 
    // private variables declared  
    // these can only be accessed by  
    // public methods of class 
    private String name; 
    private int roll; 
    private int age; 
  
    // get method for age to access  
    // private variable geekAge 
    public int getAge()  
    { 
      return age; 
    } 
   
    // get method for name to access  
    // private variable geekName 
    public String getName()  
    { 
      return name; 
    } 
      
    // get method for roll to access  
    // private variable geekRoll 
    public int getRoll()  
    { 
       return roll; 
    } 
   
    // set method for age to access  
    // private variable geekage 
    public void setAge( int newAge) 
    { 
      age = newAge; 
    } 
   
    // set method for name to access  
    // private variable geekName 
    public void setName(String newName) 
    { 
      name = newName; 
    } 
      
    // set method for roll to access  
    // private variable geekRoll 
    public void setRoll( int newRoll)  
    { 
      roll = newRoll; 
    } 
} 