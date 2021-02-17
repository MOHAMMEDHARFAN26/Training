
package com.kctech.daytwo;

public class WrapperClassMo {
    public static void main(String args[]){  
	//Creating Wrapper class object 
  
      Integer a=34;
      
      System.out.println(a.intValue());
      
      String number="123";
      int b=123;
      
      int c=Integer.parseInt(number);
      
      System.out.println("Result is "+ (b+c));
   }

}
