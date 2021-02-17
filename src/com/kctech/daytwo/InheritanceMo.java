package com.kctech.daytwo;

class Employee{  
	 int salary=40000;  
	}  
class Hours extends Employee{
	int hour = 9; 
}
	class InheritanceMo extends Hours{  
	 int bonus=10000;  
	 public static void main(String args[]){  
		 InheritanceMo p=new InheritanceMo();  
	   System.out.println("Programmer salary is:"+p.salary);  
	   System.out.println("Bonus of Programmer is:"+p.bonus);
	   System.out.println("Time of Programmer is:"+p.hour);
	}  
	}
