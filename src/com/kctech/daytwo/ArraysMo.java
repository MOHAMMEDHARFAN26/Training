package com.kctech.daytwo;

import java.util.*;

public class ArraysMo {
    public static void main(String args[]) {
     // Array
    int[] array = {3,2,7,5,9,4,1};
    // Given number
    int number = 1;
    // Creating new array with increased size
    int[] new_array = new int[array.length + 1];
    // Copying elements from one array to another
    for(int i = 0; i < array.length; i++) {
    new_array[i] = array[i];
    }
    // Adding new element
    new_array[new_array.length - 1] = number;
     // Sorting new array
    Arrays.sort(new_array);
    // print array
    for(int i = 0; i < new_array.length; i++)
        System.out.println(new_array[i] + " ");

}
}
