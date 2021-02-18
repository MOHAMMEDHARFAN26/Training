package com.kctech.daythree;

import java.io.File;
public class FileInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File myObj = new File("/Users/team-and/Documents/javafile.txt");
		if(myObj.exists()) {
			System.out.println("File Name:" + myObj.getName());
			System.out.println("File Path:" + myObj.getAbsolutePath());
			System.out.println("File Readabale?" + myObj.canRead());
			System.out.println("File Writable?" + myObj.canWrite());
			System.out.println("File Size:" + myObj.length());
			System.out.println("Total Space" + myObj.getTotalSpace());
		} else {
			System.out.println("FIle doesnt exists!!!!");
		}
	}

}
