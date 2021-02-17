
package com.kctech.daytwo;

public class StringBufferMo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello ");
        //sb.reverse();
        //sb.insert(5, " ");
        //sb.insert(6, "World");
        sb.append("World");
        System.out.println(sb);
    }
}
