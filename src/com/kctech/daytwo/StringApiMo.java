
package com.kctech.daytwo;

public class StringApiMo {
    public static void main(String[] args) {
        String s1= "This is a very nice day";
        //splits the string based on whitespace 
        String[] words = s1.split("\\s");
        //using java foreach loop to print elements of string array 
        for(String i : words) {
            System.out.println(i);
        }
    }
    }
