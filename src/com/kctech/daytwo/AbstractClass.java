package com.kctech.daytwo;

abstract class Paint {
	abstract void colors();
}

public class AbstractClass extends Paint{
	
	void colors() {
			System.out.println("painting red");
		}
	public static void main(String[] args) {
		Paint obj = new AbstractClass();
		obj.colors();
		}
	}


