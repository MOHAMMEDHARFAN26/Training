
package com.kctech.daytwo;

public class StringBuilderMo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.replace(0, 1, "J");
        System.out.println(sb);
    }
}
