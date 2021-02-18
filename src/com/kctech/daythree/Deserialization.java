package com.kctech.daythree;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
@SuppressWarnings("serial")
public class Deserialization implements java.io.Serializable{
	

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
	
		String filename = "/Users/team-and/Documents/javafile3.txt";
	    Serialization myobj= null;
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream out = new ObjectInputStream(file);
			
			myobj = (Serialization)out.readObject();
			
			file.close();
			out.close();
			System.out.println("Done");
			System.out.println(myobj.a);
			System.out.println(myobj.b);
		} catch(IOException ex) {
			System.out.println("Exception has been caught");
		}
	}

}
