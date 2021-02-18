package com.kctech.daythree;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter myObj = new FileWriter("/Users/team-and/Documents/javafile.txt");
			myObj.write("Shakespeare Is A Legend");
			myObj.close();
			System.out.println("Successfully wrote");
		} catch(IOException e) {
			System.out.println("FIlw not written");
			e.printStackTrace();
		}
	}

}
