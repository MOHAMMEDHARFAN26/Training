package com.kctech.daythree;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;


public class FileReading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File myObj = new File("/Users/team-and/Documents/javafile.txt");
			Scanner myReader = new Scanner(myObj);
			while(myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not read");
			e.printStackTrace();
		}
		
	}

}
