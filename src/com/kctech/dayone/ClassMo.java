package com.kctech.dayone;

public class ClassMo {
   int puppyAge;

   public ClassMo(String name) {
      
      System.out.println("Name chosen is :" + name );
   }

   public void setAge( int age ) {
      puppyAge = age;
   }

   public int getAge( ) {
      System.out.println("Puppy's age is :" + puppyAge );
      return puppyAge;
   }

   public static void main(String []args) {
    
      ClassMo myPuppy = new ClassMo( "tommy" );

      myPuppy.setAge( 2 );
      
      myPuppy.getAge();

      System.out.println("Variable Value :" + myPuppy.puppyAge );
   }
}