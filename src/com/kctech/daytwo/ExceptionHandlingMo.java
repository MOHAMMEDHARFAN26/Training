
package com.kctech.daytwo;

public class ExceptionHandlingMo {
    public static void main(String[] args) {
        try {
            String[] words = {"hello","world"};
            System.out.println(words[5]);
        } catch(Exception e) {
            System.out.println("something is wrong");
        } finally {
            System.out.println("Try catch finished");
        }
    }
}
