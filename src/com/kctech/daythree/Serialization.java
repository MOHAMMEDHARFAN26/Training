package com.kctech.daythree;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
@SuppressWarnings("serial")
public class Serialization implements java.io.Serializable{
	
	
	int a; 
	String b;
	
	Serialization(int a, String b) {
		this.a = a;
		this.b = b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Serialization myObj = new Serialization(07,"Mohammed Harfan");
		String filename = "/Users/team-and/Documents/javafile3.txt";
		
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(myObj);
			
			file.close();
			out.close();
			System.out.println("Done");
		} catch(IOException ex) {
			System.out.println("Exception has been caught");
		}
	}

}
