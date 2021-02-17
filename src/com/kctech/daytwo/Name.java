package com.kctech.daytwo;

class Name implements Interface
{
	   public void vehicle()
	   {
	     System.out.println("I'm using a car");
	     System.out.println("I'm using a bike");
	   }
	   

	public static void main(String[] args) {
		Name obj = new Name();
		obj.vehicle();
	}
}