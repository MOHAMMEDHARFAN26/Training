package com.kctech.daythree;

import java.io.File;
import java.io.IOException;

public class FIleMo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File myObj = new File("/Users/team-and/Documents/javafile2.txt");
			if(myObj.createNewFile()) {
				System.out.println("file created");
			} else {
				System.out.println("file not created");
			} 
		} catch(IOException e) {
			System.out.println("an errror occured");
			e.printStackTrace();
		}
	}
}

