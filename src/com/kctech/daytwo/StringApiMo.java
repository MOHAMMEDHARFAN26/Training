
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
        //creating a char array
        char ch[] = {'i','t',' ','i','s'};
        //converting  char array to String
        String s2 = new String(ch);
        System.out.println(s2);
    }
    }
